package org.example.model.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CoffeeMachineSimulatorTest {

    CoffeeMachineSimulatorImpl coffeeMachineSimulator;

    @Test
    void getPrice() {
	Assertions.assertEquals("1.20", coffeeMachineSimulator.getPrice("latte", 5));
    }

    @BeforeEach
    void setUp() {
	coffeeMachineSimulator = new CoffeeMachineSimulatorImpl();
    }

}
