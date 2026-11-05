package org.example;

public class Bookstore {
    private String name;
    private int bookCount;
    private int employees;
    private static double totalStores;
    private static double totalBooks;

    public Bookstore(String name, int bookCount, int employees) {
        this.name = name;
        this.bookCount = bookCount;
        this.employees = employees;

        totalStores++;
        totalBooks+=bookCount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBookCount(int bookCount) {
        this.bookCount = bookCount;
    }

    public void setEmployees(int employees) {
        this.employees = employees;
    }


    public String getName() {
        return name;
    }

    public int getBookCount() {
        return bookCount;
    }

    public int getEmployees() {
        return employees;
    }


    static double getAverageBooks(){

        double averageBooks = totalBooks/totalStores;
        return averageBooks;
    }


}
