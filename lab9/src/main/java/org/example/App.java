package org.example;


public class App {
    public static void main(String[] args) {

        Novel novel = new Novel(
                "Война и мир",
                "Лев Толстой",
                1300,
                "Роман"
        );

        Textbook textbook = new Textbook(
                "Основы Java",
                "Иван Иванов",
                450,
                "Программирование"
        );

        novel.displayInfo();

        System.out.println();

        textbook.displayInfo();

    }
}
