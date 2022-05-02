package org.example.model;

import org.example.bean.Beverage;

public interface CoffeeMachineSimulator {

    String getPrice(Beverage beverage, Integer sugarUnits);

    String getPrice(String beverageName, Integer sugarUnits);
}
