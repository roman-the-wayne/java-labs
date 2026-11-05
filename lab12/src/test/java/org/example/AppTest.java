package org.example;

import org.example.task1.Doctor;
import org.example.task1.Lawyer;
import org.example.task1.Professional;
import org.example.task1.Teacher;
import org.example.task2.Club;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void testProfessionalsMap() {
        Map<String, Professional> map = new HashMap<>();
        map.put("Доктор 1", new Doctor("Доктор 1", 1, 5, "Хирург"));
        map.put("Доктор 2", new Doctor("Доктор 2", 2, 7, "Терапевт"));
        map.put("Доктор 3", new Doctor("Доктор 3", 3, 10, "Окулист"));

        map.put("Юрист 1", new Lawyer("Юрист 1", 4, 3, 15));
        map.put("Юрист 2", new Lawyer("Юрист 2", 5, 8, 40));
        map.put("Юрист 3", new Lawyer("Юрист 3", 6, 12, 85));

        map.put("Учитель 1", new Teacher("Учитель 1", 7, 2, 25));
        map.put("Учитель 2", new Teacher("Учитель 2", 8, 15, 100));

        assertEquals(8, map.size());
        assertTrue(map.get("Доктор 1") instanceof Doctor);
        assertTrue(map.get("Юрист 1") instanceof Lawyer);
        assertTrue(map.get("Учитель 1") instanceof Teacher);
    }

    @Test
    public void testClubAverageRating() {
        Club club = new Club(1, "Спартак", "Футбол", 2, List.of(4, 5, 3));
        assertEquals(4.0, club.getAverageRating(), 0.001);

        Club emptyClub = new Club(2, "Пустой", "Теннис", 1, List.of());
        assertEquals(0.0, emptyClub.getAverageRating(), 0.001);
    }

    @Test
    public void testClubOperations() {
        List<Club> clubs = new ArrayList<>();
        Club c1 = new Club(1, "Клуб А", "Футбол", 2, List.of(5, 5, 5));
        Club c2 = new Club(2, "Клуб Б", "Футбол", 2, List.of(2, 2, 2));
        Club c3 = new Club(3, "Клуб В", "Футбол", 2, List.of(4, 4, 4));

        clubs.add(c1);
        clubs.add(c2);
        clubs.add(c3);

        clubs.removeIf(club -> club.getAverageRating() < 3);
        assertEquals(2, clubs.size());
        assertFalse(clubs.contains(c2));

        for (Club club : clubs) {
            if (club.getAverageRating() >= 4) {
                club.setDivision(club.getDivision() - 1);
            }
        }
        assertEquals(1, c1.getDivision());
        assertEquals(1, c3.getDivision());
    }

    @Test
    public void testClubSorting() {
        List<Club> clubs = new ArrayList<>();
        Club b = new Club(1, "Б", "Футбол", 1, List.of(4, 4));
        Club a = new Club(2, "А", "Футбол", 1, List.of(4, 4));
        Club c = new Club(3, "В", "Футбол", 1, List.of(5, 5));

        clubs.add(b);
        clubs.add(a);
        clubs.add(c);

        clubs.sort((c1, c2) -> {
            int cmp = Double.compare(c2.getAverageRating(), c1.getAverageRating());
            if (cmp != 0) {
                return cmp;
            }
            return c1.getName().compareTo(c2.getName());
        });

        assertEquals("В", clubs.get(0).getName());
        assertEquals("А", clubs.get(1).getName());
        assertEquals("Б", clubs.get(2).getName());
    }
}
