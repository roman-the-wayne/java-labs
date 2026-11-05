package org.example;

import java.util.ArrayList;
import java.util.List;

public class Clinic {
    private String name;
    private List<Doctor> doctors;

    public Clinic(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public Doctor findDoctorByName(String name) throws DoctorNotFoundException {
        for (Doctor doctor : doctors) {
            if (doctor.getName().equalsIgnoreCase(name)) {
                return doctor;
            }
        }
        throw new DoctorNotFoundException("Врач " + name + " не найден в клинике " + this.name);
    }

    public void makeAppointment(String doctorName, String patient) throws DoctorNotFoundException, AppointmentException {
        Doctor doctor = findDoctorByName(doctorName);
        doctor.makeAppointment(patient);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public void printDoctors() {
        for (Doctor doctor : doctors) {
            System.out.println(doctor);
        }
    }
}
