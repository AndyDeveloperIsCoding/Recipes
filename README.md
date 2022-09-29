<b>Recipes web service</b>

How to use this program?

Communication with the Recipes web service goes via REST API. You can send the HTTP requests via an API platform, e.g. Postman. The service accepts the requests to Apache Tomcat application server in JSON format.

1. Register a new user using POST request and URL localhost:6065/api/register/, the body should look like
{
"email": "a@a.com",
"password": "abcdefgh"
}

2. For a recipe POST request You should firstly provide Basic Authorization credentials (e.g. provided above if You have registered the same way) and use URL localhost:6065/api/recipe with request body in raw format, JSON:
{
   "name": "Fresh Mint Tea",
   "description": "Light, aromatic and refreshing beverage, ...",
   "ingredients": "boiled water, honey, fresh mint leaves",
   "directions": "1) Boil water. 2) Pour boiling hot water into a mug. 3) Add fresh mint leaves. 4) Mix and let the mint leaves seep for 3-5 minutes. 5) Add honey and mix again."
}

3. For GET request You can use the same URL: localhost:6065/api/recipe. GET request also work for authorized users only.

