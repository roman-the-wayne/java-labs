package org.example.task1;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task1App {
    public static void main(String[] args) {
        Map<String, Professional> professionals = new LinkedHashMap<>();

        professionals.put("Иван Смирнов", new Doctor("Иван Смирнов", 1, 10, "Хирург"));
        professionals.put("Ольга Васильева", new Doctor("Ольга Васильева", 2, 7, "Терапевт"));
        professionals.put("Сергей Кузнецов", new Doctor("Сергей Кузнецов", 3, 15, "Кардиолог"));

        professionals.put("Анна Попова", new Lawyer("Анна Попова", 4, 8, 45));
        professionals.put("Михаил Соколов", new Lawyer("Михаил Соколов", 5, 5, 20));
        professionals.put("Елена Морозова", new Lawyer("Елена Морозова", 6, 12, 90));

        professionals.put("Дмитрий Волков", new Teacher("Дмитрий Волков", 7, 4, 30));
        professionals.put("Татьяна Новикова", new Teacher("Татьяна Новикова", 8, 20, 120));

        for (Map.Entry<String, Professional> entry : professionals.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
