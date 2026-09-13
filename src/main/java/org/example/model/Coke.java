package org.example.model;

public class Coke extends ProductForSale {
    private boolean hasSugar;

    // Testlerin hata vermemesi için 3 parametreli constructor
    public Coke(String type, double price, String description) {
        super(type, price, description);
    }

    // 4 parametreli constructor
    public Coke(String type, double price, String description, boolean hasSugar) {
        super(type, price, description);
        this.hasSugar = hasSugar;
    }

    public boolean isHasSugar() {
        return hasSugar;
    }

    @Override
    public void showDetails() {
        System.out.println("Type: " + getType() + ", Price: " + getPrice() +
                ", Description: " + getDescription());
    }
}