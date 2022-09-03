package fun.practice.recipes;


import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus; // This
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException; // This

@SpringBootApplication
public class RecipesApplication {
	public static void main(String[] args) {
		SpringApplication.run(RecipesApplication.class, args);
	}

	// Recipe controller

	@RestController
	public class RecipeController {

		// Create collection of recipes, where You will add all Your recipes
		Map<Integer, Recipe> collectionOfRecipes = new HashMap<>();
		int idNumbering = 1;

		// Endpoint for importing new recipes
		@PostMapping("/api/recipe/new")
		public Id postRecipe(@RequestBody Recipe recipe) { // Previous type: String
			Id newId = new Id(idNumbering);
			collectionOfRecipes.put(newId.getId(), recipe);

            /*
            // Temp
            System.out.println("Your recipe has been successfully added!");

            // Temp: Print the whole recipe book
            for (Map.Entry<Integer, Recipe> entry : collectionOfRecipes.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue().toString());
            }
             */

			System.out.println(newId); // Temp
			idNumbering++;
			return newId;
		}



		// Endpoint for displaying existing recipes- according to the requested id
		@GetMapping("/api/recipe/{id}")
		public Recipe getRecipe(@PathVariable int id) {
			if (!collectionOfRecipes.containsKey(id)) {
				throw new ResponseStatusException(HttpStatus.NOT_FOUND,
						"Unfortunately recipe with such id is not found");
			} else {
				System.out.println(collectionOfRecipes.get(id)); // Temp
				return collectionOfRecipes.get(id);
			}

		}

	}
}
