package org.example.model;

public class Chocolate extends ProductForSale {
    private String color;

    // Testlerin hata vermemesi için 3 parametreli constructor
    public Chocolate(String type, double price, String description) {
        super(type, price, description);
    }

    // 4 parametreli constructor
    public Chocolate(String type, double price, String description, String color) {
        super(type, price, description);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void showDetails() {
        System.out.println("Type: " + getType() + ", Price: " + getPrice() +
                ", Description: " + getDescription() + ", Color: " + color);
    }
}