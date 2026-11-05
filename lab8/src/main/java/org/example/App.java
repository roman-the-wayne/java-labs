package org.example;

public class App {
    public static void main(String[] args) {
        Artist singer = new Singer(
                "Анна",
                25,
                "Поп",
                "Сопрано"
        );

        Dancer dancer = new Dancer(
                "Иван",
                28,
                "Современный танец",
                "Хип-хоп"
        );

        singer.displayInfo();
        singer.perform();
        singer.singSong();

        System.out.println();

        dancer.displayInfo();
        dancer.perform();
        dancer.choreograph();
        Artist singer1 = new Singer(
                "Анна",
                25,
                "Поп",
                "Сопрано"
        );
    }
}
