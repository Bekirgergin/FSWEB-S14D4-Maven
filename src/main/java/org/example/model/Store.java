package org.example.model;

public class Store {

    public static void listProducts(ProductForSale[] products) {
        if (products != null) {
            for (ProductForSale product : products) {
                if (product != null) {
                    product.showDetails();
                }
            }
        }
    }

    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[3];

        products[0] = new Chocolate("Sütlü Çikolata", 25.5, "Lezzetli fındıklı çikolata", "Kahverengi");
        products[1] = new Coke("Kutu Kola", 30.0, "Soğuk içecek", true);
        products[2] = new Bread("Tam Buğday Ekmeği", 15.0, "Taze fırın ekmeği", "Buğday");

        listProducts(products);
    }
}