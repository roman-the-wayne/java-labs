package org.example.task1;

public class Pet {
    private final String name;
    private final String species;
    private final String breed;
    private final int age;
    private final String color;
    private final String favoriteFood;
    private final String character;

    public Pet(String name, String species, String breed, int age, String color, String favoriteFood, String character) {
        this.name = name;
        this.species = species;
        this.breed = breed;
        this.age = age;
        this.color = color;
        this.favoriteFood = favoriteFood;
        this.character = character;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public String getCharacter() {
        return character;
    }

    public String toFormattedString() {
        return "Информация о питомце" + System.lineSeparator() +
                "Кличка: " + name + System.lineSeparator() +
                "Вид животного: " + species + System.lineSeparator() +
                "Порода: " + breed + System.lineSeparator() +
                "Возраст: " + age + " года/лет" + System.lineSeparator() +
                "Окрас: " + color + System.lineSeparator() +
                "Любимая еда: " + favoriteFood + System.lineSeparator() +
                "Характер: " + character;
    }

    @Override
    public String toString() {
        return toFormattedString();
    }
}
