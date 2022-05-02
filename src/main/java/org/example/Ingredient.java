package org.example;

public class Ingredient {

    private String name;
    private Double unitPrice;
    private Integer unit;

    public String getName() {
	return name;
    }

    public Integer getUnit() {
	return unit;
    }

    public Double getUnitPrice() {
	return unitPrice;
    }

    public void setName(String name) {
	this.name = name;
    }

    public void setUnit(Integer unit) {
	this.unit = unit;
    }

    public void setUnitPrice(Double unitPrice) {
	this.unitPrice = unitPrice;
    }

}
