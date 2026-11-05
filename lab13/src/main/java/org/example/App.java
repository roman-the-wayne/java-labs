package org.example;

public class App {
    public static void main(String[] args) {
        Clinic clinic = new Clinic("МедЦентр");

        try {
            Doctor doc1 = new Doctor("Иванов И.И.", "Хирург", 10, 5);
            Doctor doc2 = new Doctor("Петрова А.С.", "Терапевт", 5, 4);
            Doctor doc3 = new Doctor("Сидоров В.П.", "Окулист", 3, 4);

            clinic.addDoctor(doc1);
            clinic.addDoctor(doc2);
            clinic.addDoctor(doc3);

            clinic.makeAppointment("Иванов И.И.", "Смирнов А.А.");
            clinic.makeAppointment("Иванов И.И.", "Кузнецов Д.В.");
            clinic.makeAppointment("Петрова А.С.", "Морозова Е.В.");

            doc2.updateRating(5);

            clinic.printDoctors();
        } catch (InvalidDoctorDataException | DoctorNotFoundException | AppointmentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        System.out.println();

        try {
            new Doctor("Некорректный", "Хирург", -1, 4);
        } catch (InvalidDoctorDataException e) {
            System.out.println("Поймано исключение: " + e.getMessage());
        }

        try {
            clinic.makeAppointment("Неизвестный Врач", "Смирнов А.А.");
        } catch (DoctorNotFoundException | AppointmentException e) {
            System.out.println("Поймано исключение: " + e.getMessage());
        }

        try {
            clinic.makeAppointment("Иванов И.И.", "Смирнов А.А.");
        } catch (DoctorNotFoundException | AppointmentException e) {
            System.out.println("Поймано исключение: " + e.getMessage());
        }
    }
}
