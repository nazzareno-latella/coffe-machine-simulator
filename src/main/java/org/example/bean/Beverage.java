package org.example.bean;

import java.io.Serializable;
import java.util.List;

public class Beverage implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private List<Ingredient> ingredients;

    public Beverage() {
	super();
    }

    public Beverage(String name, List<Ingredient> ingredients) {
	super();
	this.name = name;
	this.ingredients = ingredients;
    }

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
