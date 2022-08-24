package fun.practice.recipes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
public class RecipesApplication {
	public static void main(String[] args) {
		SpringApplication.run(RecipesApplication.class, args);
	}

	// Recipe controller

	@RestController
	public class RecipeController {

		Recipe singleRecipe = new Recipe();

		@PostMapping("/api/recipe")
		public Recipe postRecipe(@RequestBody Recipe recipe) {
			singleRecipe = recipe;
			System.out.println("Your recipe has been successfully added!");
			return singleRecipe;
		}

		@GetMapping("/api/recipe")
		public Recipe getRecipe() {
			return singleRecipe;
		}

	}
}
