# coffe-machine-simulator

Description

Implement a coffee machine simulator receiving the request for a beverage and returning the price paid for it.

The coffee machine provides the following beverages by mixing specific quantities of a set of ingredients:

    espresso = 3 units of coffee
    macchiato = 3 units of coffee, 1 unit of foamed milk
    cappuccino = 2 units of coffee, 2 units of milk, 2 units of foamed milk
    latte = 1 unit of coffee, 5 units of milk
    chocolate = 3 units of cocoa, 2 units of milk, 1 unit of whipped cream
    mochaccino = 2 units of coffee, 1 unit of cocoa, 2 units of milk, 1 unit of whipped cream



To promote healthier eating habits all beverages are prepared without using sugar.
Anyway, the coffee machine allows to select the sugar level so that 1 to 5 sugar units can be used at an extra cost.

Ingredients have the following unit prices:

    coffee: EUR 0.40
    milk: EUR 0.15
    foamed milk: EUR 0.20
    cocoa: EUR 0.30
    whipped cream: EUR 0.50
    sugar: EUR 0.01


Input/Output format

The software takes string requests as an input with the following format:
<beverage><sugarUnits>

The software displays the price paid by the user as an output with the following format:
<digit>.<digit><digit>


Examples
Input: macchiato0
Output: EUR 1.40
Description: Macchiato with 0 sugar units



Input: mochaccino3
Output: EUR 1.93
Description: Mochaccino with 3 sugar units
