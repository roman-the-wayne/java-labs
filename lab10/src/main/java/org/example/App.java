package org.example;


public class App {
    public static void main(String[] args) {
        Singer singer1 = new Singer("Анна", "Поп");
        Singer singer2 = new Singer("Иван", "Рок");
        Singer singer3 = new Singer("Мария", "Джаз");

        Dancer dancer1 = new Dancer("Олег", "Хип-хоп");
        Dancer dancer2 = new Dancer("Елена", "Балет");

        singer1.addAward("Лучший дебют");
        singer1.addAward("Певица года");

        singer2.addAward("Лучший рок-исполнитель");

        singer3.addAward("Лучший джазовый альбом");

        dancer1.addAward("Лучший танцор года");

        dancer2.addAward("Лучший балетный номер");
        dancer2.addAward("Танцовщица года");

        singer1.printSingerInfo();
        singer2.printSingerInfo();
        singer3.printSingerInfo();



        dancer1.printDancerInfo();
        dancer2.printDancerInfo();
    }




}

