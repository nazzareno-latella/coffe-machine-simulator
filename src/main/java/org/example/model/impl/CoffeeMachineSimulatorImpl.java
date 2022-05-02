package org.example.model.impl;

import java.util.ArrayList;
import java.util.List;

import org.example.bean.Beverage;
import org.example.bean.Ingredient;
import org.example.model.AbstractCoffeeMachineSimulator;

public class CoffeeMachineSimulatorImpl extends AbstractCoffeeMachineSimulator {

    private static final String BEVERAGE_ESPRESSO = "espresso";
    private static final String BEVERAGE_MACCHIATO = "macchiato";
    private static final String BEVERAGE_CAPPUCCINO = "cappuccino";
    private static final String BEVERAGE_LATTE = "latte";
    private static final String BEVERAGE_CHOCOLATE = "chocolate";
    private static final String BEVERAGE_MOCHACCINO = "mochaccino";

    private static final String INGREDIENT_COFFEE = "coffee";
    private static final String INGREDIENT_MILK = "milk";
    private static final String INGREDIENT_FOAMED_MILK = "foamed milk";
    private static final String INGREDIENT_COCOA = "cocoa";
    private static final String INGREDIENT_WHIPPED_CREAM = "whipped cream";

    private List<Beverage> beverages;

    public CoffeeMachineSimulatorImpl() {
	super();
	setupBeverages();
    }

    @Override
    public String getPrice(String beverageName, Integer sugarUnits) {
	return getPrice(getBeverage(beverageName), sugarUnits);
    }

    private void addCappuccino() {
	List<Ingredient> ingredients = new ArrayList<>();
	ingredients.add(new Ingredient(INGREDIENT_COFFEE, 0.40, 2));
	ingredients.add(new Ingredient(INGREDIENT_MILK, 0.15, 2));
	ingredients.add(new Ingredient(INGREDIENT_FOAMED_MILK, 0.20, 2));
	beverages.add(new Beverage(BEVERAGE_CAPPUCCINO, ingredients));
    }

    private void addChocolate() {
	List<Ingredient> ingredients = new ArrayList<>();
	ingredients.add(new Ingredient(INGREDIENT_COCOA, 0.30, 3));
	ingredients.add(new Ingredient(INGREDIENT_MILK, 0.15, 2));
	ingredients.add(new Ingredient(INGREDIENT_WHIPPED_CREAM, 0.50, 1));
	beverages.add(new Beverage(BEVERAGE_CHOCOLATE, ingredients));
    }

    private void addEspresso() {
	List<Ingredient> ingredients = new ArrayList<>();
	ingredients.add(new Ingredient(INGREDIENT_COFFEE, 0.40, 3));
	beverages.add(new Beverage(BEVERAGE_ESPRESSO, ingredients));
    }

    private void addLatte() {
	List<Ingredient> ingredients = new ArrayList<>();
	ingredients.add(new Ingredient(INGREDIENT_COFFEE, 0.40, 1));
	ingredients.add(new Ingredient(INGREDIENT_MILK, 0.15, 5));
	beverages.add(new Beverage(BEVERAGE_LATTE, ingredients));
    }

    private void addMacchiato() {
	List<Ingredient> ingredients = new ArrayList<>();
	ingredients.add(new Ingredient(INGREDIENT_COFFEE, 0.40, 3));
	ingredients.add(new Ingredient(INGREDIENT_FOAMED_MILK, 0.20, 1));
	beverages.add(new Beverage(BEVERAGE_MACCHIATO, ingredients));
    }

    private void addMochaccino() {
	List<Ingredient> ingredients = new ArrayList<>();
	ingredients.add(new Ingredient(INGREDIENT_COFFEE, 0.40, 2));
	ingredients.add(new Ingredient(INGREDIENT_COCOA, 0.30, 1));
	ingredients.add(new Ingredient(INGREDIENT_MILK, 0.15, 2));
	ingredients.add(new Ingredient(INGREDIENT_WHIPPED_CREAM, 0.50, 1));
	beverages.add(new Beverage(BEVERAGE_MOCHACCINO, ingredients));
    }

    private Beverage getBeverage(String beverageName) {
	return beverages.stream().filter(b -> b.getName().equals(beverageName)).findFirst().get();
    }

    private void setupBeverages() {
	beverages = new ArrayList<>();
	addEspresso();
	addMacchiato();
	addCappuccino();
	addLatte();
	addChocolate();
	addMochaccino();
    }
}
