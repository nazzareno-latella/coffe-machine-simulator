package org.example.model;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Iterator;
import java.util.Locale;

import org.example.bean.Beverage;
import org.example.bean.Ingredient;

public abstract class AbstractCoffeeMachineSimulator implements CoffeeMachineSimulator {
    @Override
    public String getPrice(Beverage benerage) {
	DecimalFormat df = new DecimalFormat("0.00", DecimalFormatSymbols.getInstance(Locale.ENGLISH));

	Double price = 0.0;
	for (Iterator<Ingredient> iterator = benerage.getIngredients().iterator(); iterator.hasNext();) {
	    Ingredient i = iterator.next();
	    price += (i.getUnit() * i.getUnitPrice());
	}
	return df.format(price);
    }
}
