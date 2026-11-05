package org.example;

import java.util.ArrayList;
import java.util.List;

public class Doctor {
    private String name;
    private String specialization;
    private int experience;
    private double rating;
    private List<String> patients;

    public Doctor(String name, String specialization, int experience, double rating) throws InvalidDoctorDataException {
        if (experience < 0) {
            throw new InvalidDoctorDataException("Опыт работы не может быть отрицательным: " + experience);
        }
        if (rating < 1 || rating > 5) {
            throw new InvalidDoctorDataException("Рейтинг должен быть от 1 до 5: " + rating);
        }
        this.name = name;
        this.specialization = specialization;
        this.experience = experience;
        this.rating = rating;
        this.patients = new ArrayList<>();
    }

    public void makeAppointment(String patient) throws AppointmentException {
        if (patient == null || patient.trim().isEmpty()) {
            throw new AppointmentException("Имя пациента не может быть пустым");
        }
        if (patients.contains(patient)) {
            throw new AppointmentException("Пациент " + patient + " уже записан к врачу " + name);
        }
        patients.add(patient);
    }

    public void updateRating(int newRating) throws InvalidDoctorDataException {
        if (newRating < 1 || newRating > 5) {
            throw new InvalidDoctorDataException("Новый рейтинг должен быть от 1 до 5: " + newRating);
        }
        this.rating = newRating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) throws InvalidDoctorDataException {
        if (experience < 0) {
            throw new InvalidDoctorDataException("Опыт работы не может быть отрицательным: " + experience);
        }
        this.experience = experience;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) throws InvalidDoctorDataException {
        if (rating < 1 || rating > 5) {
            throw new InvalidDoctorDataException("Рейтинг должен быть от 1 до 5: " + rating);
        }
        this.rating = rating;
    }

    public List<String> getPatients() {
        return patients;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + name + '\'' +
                ", specialization='" + specialization + '\'' +
                ", experience=" + experience +
                ", rating=" + rating +
                ", patients=" + patients +
                '}';
    }
}
