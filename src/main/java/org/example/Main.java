package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
	// Enter data using BufferReader
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	// Reading data using readLine
	try {
	    String input = reader.readLine();
	    System.out.println("");
	    System.out.println("Input: " + input);

	    Integer sugarUnits = 0;
	    Pattern pattern = Pattern.compile("\\d+$");
	    Matcher sugarUnitsMatcher = pattern.matcher(input);
	    String mg = null;
	    while (sugarUnitsMatcher.find()) {
		mg = sugarUnitsMatcher.group();
		sugarUnits = Integer.parseInt(sugarUnitsMatcher.group());
		// System.out.println("sugarUnits: " + sugarUnits);
	    }

	    String beverage = input.substring(0, input.indexOf(mg));
	    // System.out.println("beverage: " + beverage);

	    System.out.println("Output: " + getFinalPrice(beverage, sugarUnits));

	} catch (IOException e) {
	    System.err.println(e.getMessage());
	}

    }

    private static String calculatePrice(Beverage b) {
	DecimalFormat df = new DecimalFormat("0.00", DecimalFormatSymbols.getInstance(Locale.ENGLISH));

	Double price = 0.0;
	for (Iterator<Ingredient> iterator = b.getIngredients().iterator(); iterator.hasNext();) {
	    Ingredient i = iterator.next();
	    price += (i.getUnit() * i.getUnitPrice());
	}
	return df.format(price);
    }

    private static String getFinalPrice(String beverage, Integer sugarUnits) {
	Beverage b = null;
	if ("espresso".equals(beverage)) {
	    b = new Beverage();
	    b.setName(beverage);
	    b.setIngredients(new ArrayList<Ingredient>());

	    Ingredient i = new Ingredient();
	    i.setName("coffee");
	    i.setUnit(3);
	    i.setUnitPrice(0.40);
	    b.getIngredients().add(i);

	    Ingredient sugar = new Ingredient();
	    sugar.setName("sugar");
	    sugar.setUnit(sugarUnits);
	    sugar.setUnitPrice(0.01);
	    b.getIngredients().add(sugar);
	}
	return calculatePrice(b);
    }
}