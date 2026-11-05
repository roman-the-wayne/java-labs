package org.example;

public class Dancer extends Artist {
    private String danceStyle;

    public Dancer(String name, int age, String genre, String danceStyle) {
        super(name, age, genre);
        this.danceStyle = danceStyle;
    }

    public void setDanceStyle(String danceStyle) {
        this.danceStyle = danceStyle;
    }

    public String getDanceStyle() {
        return danceStyle;
    }


    @Override
    public void perform() {
        System.out.println("Исполняет танец");
    }

    public void choreograph() {
        System.out.println("Танцор ставит хореографию");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Стиль танца: " + danceStyle);
    }
}
