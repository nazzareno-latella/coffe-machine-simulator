package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.example.model.impl.CoffeeMachineSimulatorImpl;

public class Main {

    private static CoffeeMachineSimulatorImpl coffeeMachineSimulator;

    public static void main(String[] args) {
	new Main();

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
	    }

	    String beverage = input.substring(0, input.indexOf(mg));

	    System.out.println("Output: " + coffeeMachineSimulator.getPrice(beverage, sugarUnits));
	    System.out.println("Description: " + beverage + " with " + sugarUnits + " sugar units");

	} catch (IOException e) {
	    System.err.println(e.getMessage());
	}
    }

    public Main() {
	Main.coffeeMachineSimulator = new CoffeeMachineSimulatorImpl();
    }
}