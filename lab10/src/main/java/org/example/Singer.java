package org.example;

class Singer implements Performer, Awardable {
    private String name;
    private String genre;
    private String[] awards;
    private int awardCount;

    public Singer(String name, String genre) {
        this.name = name;
        this.genre = genre;
        this.awards = new String[10];
        this.awardCount = 0;
    }

    @Override
    public void perform() {
        System.out.println(name + " поёт песню");
    }

    @Override
    public String getGenre() {
        return genre;
    }

    @Override
    public String[] getAwards() {
        return awards;
    }

    @Override
    public void addAward(String award) {
        if (awardCount < awards.length) {
            awards[awardCount] = award;
            awardCount++;
        } else {
            System.out.println("Нельзя добавить больше наград");
        }
    }

    public String getName() {
        return name;
    }

    public void printSingerInfo() {
        System.out.println("Певец: " + getName());
        System.out.println("Жанр: " + getGenre());
        System.out.println("Награды:");

        for (String award : getAwards()) {
            if (award != null) {
                System.out.println("- " + award);
            }
        }

        perform();
        System.out.println();
    }
}