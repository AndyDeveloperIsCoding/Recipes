package fun.practice.recipes;

import java.util.Arrays;

public class Recipe {

    private String name;
    private String description;
    private String[] ingredients;
    private String[] directions;

    // Constructors
    public Recipe(String name, String description, String[] ingredients, String[] directions) { // Previously was also int id
        this.name = name;
        this.description = description;
        this.ingredients = ingredients;
        this.directions = directions;
    }

    public Recipe() {
    }

    // Setters

    /*
    public void setId(int id) {
        this.id = id;
    }

     */

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }

    public void setDirections(String[] directions) {
        this.directions = directions;
    }

    // Getters

    /*
    public int getId() {
        return this.id = id;
    }

     */

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public String[] getDirections() {
        return directions;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", ingredients=" + Arrays.toString(ingredients) +
                ", directions=" + Arrays.toString(directions) +
                '}';
    }

}
