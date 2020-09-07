Basic weather application for Android OS.

Last week I came up with an interesting idea to encourage my childhood town with an attractive, informative tourism application.
I have started my journey with this small-step application and I implemented the following features:

- Users can search for weather information in other places.
- The weather icon or image will change depending on weather conditions.

It would maybe worthy to take it a bit further in the future and add one or more user stories, such as:
- User can view the weather in his/her current location.
- Users can toggle the temperature unit (Celsius or Fahrenheit).

Design:

Keeping things simple was the aim here. I decided to show only the temperature and weather description.

Logic:

After looking at an example API response from Open Weather, I figured I’ll need to get the location name from the user to be able to serve weather information on page load.

I stored the returned value in already declared variable and used it to make the GET request.
The Open Weather API gave me a way to update the location, temperature and weather description, but I still needed to find a way to update the weather icon

The last thing I did was to update the weather icon based on the conditions in the user’s city of interest. I have considered doing that by fitting a relevant icon to every condition. Yet, Open Weather has a broad variety of weather conditions, so I decided a better way to achieve that was to use another API service of Open Weather and get the relevant icon to the requested condition.

Key takeaway:

My major takeaway from this project is that I learned using Retrofit, and how to access each part of the returned JSON data from the API response and use it in different ways. Although my methodology needs some refining, it’s bound to get better with more practice.
