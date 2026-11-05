package org.example;

public class App {
    public static void main(String[] args) {
        Furniture furniture = new Furniture("Шкаф", "Дуб", 15000);
        Table table = new Table("Письменный стол", "Сосна", 8000);
        Chair chair = new Chair("Офисный стул", "Пластик", 3500);

        furniture.displayInfo();
        System.out.println();
        table.displayInfo();
        System.out.println();
        chair.displayInfo();
        System.out.println();

        System.out.println(furniture.use());
        System.out.println(furniture.use("хранения одежды"));
        System.out.println(furniture.use(24));
        System.out.println();

        System.out.println(table.use());
        System.out.println(table.use("учебы"));
        System.out.println(table.use(6));
        System.out.println();

        System.out.println(chair.use());
        System.out.println(chair.use("отдыха"));
        System.out.println(chair.use(3));
    }
}
