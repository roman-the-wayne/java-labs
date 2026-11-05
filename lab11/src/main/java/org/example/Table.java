package org.example;

public class Table extends Furniture {

    public Table() {
        super("Стол", "Дерево", 5000.0);
    }

    public Table(String name, String material, double price) {
        super(name, material, price);
    }

    @Override
    public String getPurpose() {
        return "Для работы";
    }

    public void qwer(){
        System.out.print("qwer1");
    }

    public void qwer(int i){
        System.out.print("qwer1");
    }
}
