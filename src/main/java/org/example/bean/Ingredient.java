package org.example.bean;

import java.io.Serializable;

public class Ingredient implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private Double unitPrice;
    private Integer unit;

    public Ingredient() {
	super();
    }

    public Ingredient(String name, Double unitPrice, Integer unit) {
	super();
	this.name = name;
	this.unitPrice = unitPrice;
	this.unit = unit;
    }

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
