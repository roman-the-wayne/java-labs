package org.example;

public class Chair extends Furniture {

    public Chair() {
        super("Стул", "Дерево", 2500.0);
    }

    public Chair(String name, String material, double price) {
        super(name, material, price);
    }

    @Override
    public String getPurpose() {
        return "Для сидения";
    }
}
