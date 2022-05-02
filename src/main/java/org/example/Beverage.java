package org.example;

import java.util.List;

public class Beverage {

    private String name;
    private List<Ingredient> ingredients;

    public List<Ingredient> getIngredients() {
	return ingredients;
    }

    public String getName() {
	return name;
    }

    public void setIngredients(List<Ingredient> ingredients) {
	this.ingredients = ingredients;
    }

    public void setName(String name) {
	this.name = name;
    }

}
