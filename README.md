<b>Recipes web service</b>

How to use this program?

Communication with the Recipes web service goes via REST API. You can send the HTTP requests via an API platform, e.g. Postman. The service accepts the requests to Apache Tomcat application server in JSON format.

For POST request You can use URL localhost:6065/api/recipe and the request body in raw format, JSON:
{
   "name": "Fresh Mint Tea",
   "description": "Light, aromatic and refreshing beverage, ...",
   "ingredients": "boiled water, honey, fresh mint leaves",
   "directions": "1) Boil water. 2) Pour boiling hot water into a mug. 3) Add fresh mint leaves. 4) Mix and let the mint leaves seep for 3-5 minutes. 5) Add honey and mix again."
}

For GET request You can use thesame URL: localhost:6065/api/recipe.

The project is currently in progress. As it has just been started, it currently has just a simple functionality- adding recipes to and reading recipes from a HashMap. The project's complexity will grow during the coming week. 


