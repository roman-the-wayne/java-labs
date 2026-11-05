package org.example;

public class Furniture {
    private String name;
    private String material;
    private double price;

    public Furniture() {
        this("Неизвестная мебель", "Неизвестный материал", 0.0);
    }

    public Furniture(String name, String material, double price) {
        this.name = name;
        this.material = material;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPurpose() {
        return "Неизвестно";
    }

    public String use() {
        return "Использую мебель";
    }

    public String use(String purpose) {
        return "Использую для " + purpose;
    }

    public String use(int hours) {
        return "Использую " + hours + " часов";
    }

    public void displayInfo() {
        System.out.println("Наименование: " + name);
        System.out.println("Материал: " + material);
        System.out.println("Цена: " + price + " руб.");
        System.out.println("Назначение: " + getPurpose());
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", material='" + material + '\'' +
                ", price=" + price +
                ", purpose='" + getPurpose() + '\'' +
                '}';
    }
}
