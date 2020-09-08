package com.e.weatheragain;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.e.weatheragain.Retrofit.ApiClient;
import com.e.weatheragain.Retrofit.ApiInterface;
import com.e.weatheragain.Retrofit.Example;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    ImageView searchButton;
    TextView tempText, feelsLikeText, humidityText;
    EditText textField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchButton = findViewById(R.id.search_button);
        tempText = findViewById(R.id.tempText);
        feelsLikeText = findViewById(R.id.feelsLikeText);
        humidityText = findViewById(R.id.humidityText);
        textField = findViewById(R.id.textField);

        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getWeatherData(textField.getText().toString().trim());
            }
        });
    }

    private void getWeatherData(String name){
        final OkHttpClient client = new OkHttpClient();

        ApiInterface apiInterface = ApiClient.getClient().create(ApiInterface.class);
        Call<Example> call = apiInterface.getWeatherData(name);

        call.enqueue(new Callback<Example>() {
            @Override
            public void onResponse(Call<Example> call, Response<Example> response) {
                tempText.setText(response.body().getMain().getTemp());
            }

            @Override
            public void onFailure(Call<Example> call, Throwable t) {

            }
        });
    }
}