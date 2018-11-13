package com.anb4jspring.domain;

public class Product {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String name;
    private String type;
    private Float price;
    private String description;
    public  Product(String name, String type, Float price,String description) {
        this.name=name;
        this.type=type;
        this.price=price;
        this.description=description;
    }
}
