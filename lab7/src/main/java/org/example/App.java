package org.example;

import static org.example.Bookstore.getAverageBooks;

public class App {
    public static void main(String[] args) {
        Bookstore[] bookstores = {
                new Bookstore("Книжный мир", 103, 5),
                new Bookstore("Буквоед", 200, 8),
                new Bookstore("Лабиринт", 150, 6),
                new Bookstore("Читай-город", 250, 10)
        };

        System.out.println(getAverageBooks());
    }
}
