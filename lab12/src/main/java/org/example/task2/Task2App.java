package org.example.task2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task2App {

    public static void printClubs(List<Club> clubs, int division) {
        for (Club club : clubs) {
            if (club.getDivision() == division) {
                System.out.println(club);
            }
        }
    }

    public static void main(String[] args) {
        List<Club> clubs = new ArrayList<>();
        clubs.add(new Club(1, "Спартак", "Футбол", 2, List.of(5, 5, 4, 5)));
        clubs.add(new Club(2, "Зенит", "Футбол", 2, List.of(4, 4, 4, 4)));
        clubs.add(new Club(3, "Динамо", "Баскетбол", 2, List.of(4, 4, 4, 4)));
        clubs.add(new Club(4, "ЦСКА", "Хоккей", 2, List.of(3, 4, 3, 4)));
        clubs.add(new Club(5, "Локомотив", "Футбол", 2, List.of(2, 3, 2, 2)));
        clubs.add(new Club(6, "Рубин", "Футбол", 2, List.of(1, 2, 2, 2)));

        clubs.removeIf(club -> club.getAverageRating() < 3);

        for (Club club : clubs) {
            if (club.getAverageRating() >= 4) {
                club.setDivision(club.getDivision() - 1);
            }
        }

        printClubs(clubs, 1);

        System.out.println();

        clubs.sort((c1, c2) -> {
            int cmp = Double.compare(c2.getAverageRating(), c1.getAverageRating());
            if (cmp != 0) {
                return cmp;
            }
            return c2.getName().compareTo(c1.getName());
        });

        Iterator<Club> iterator = clubs.iterator();
        while (iterator.hasNext()) {
            Club club = iterator.next();
            if(club.getAverageRating()<3) {
                iterator.remove();
            }
            }

        for (Club club : clubs) {
            System.out.println("ID: " + club.getId() + ", Название: " + club.getName() + ", Средний рейтинг: " + club.getAverageRating());
        }
    }
}
