package org.example;

class Dancer implements Performer, Awardable {
    private String name;
    private String style;
    private String[] awards;
    private int awardCount;

    public Dancer(String name, String style) {
        this.name = name;
        this.style = style;
        this.awards = new String[10];
        this.awardCount = 0;
    }

    @Override
    public void perform() {
        System.out.println(name + " исполняет танец");
    }

    @Override
    public String getGenre() {
        return style;
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

    public void printDancerInfo() {
        System.out.println("Танцор: " + getName());
        System.out.println("Стиль: " + getGenre());
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