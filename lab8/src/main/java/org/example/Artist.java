package org.example;

public class Artist {
    private String name;
    private int age;
    private String genre;

    public Artist(String name, int age, String genre) {
        this.name = name;
        this.age = age;
        this.genre = genre;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGenre() {
        return genre;
    }

    public void perform() {
    }

    public void displayInfo() {
        System.out.print("Имя: " + name + ", Возраст: " + age + ", Жанр:" + genre + "\n");

    }

}
