package org.example.model;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Iterator;
import java.util.Locale;

import org.example.bean.Beverage;
import org.example.bean.Ingredient;

public abstract class AbstractCoffeeMachineSimulator implements CoffeeMachineSimulator {

    private static final String DECIMAL_FORMAT_PATTERN = "0.00";
    private static final Double SUGAR_UNIT_PRICE = 0.01;

    @Override
    public String getPrice(Beverage beverage, Integer sugarUnits) {
	DecimalFormat df = new DecimalFormat(DECIMAL_FORMAT_PATTERN, DecimalFormatSymbols.getInstance(Locale.ENGLISH));

	Double price = 0.0;
	for (Iterator<Ingredient> iterator = beverage.getIngredients().iterator(); iterator.hasNext();) {
	    Ingredient i = iterator.next();
	    price += (i.getUnit() * i.getUnitPrice());
	}
	price += sugarUnits * SUGAR_UNIT_PRICE;
	return df.format(price);
    }
}
