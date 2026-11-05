package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void testValidDoctorCreation() throws InvalidDoctorDataException {
        Doctor doctor = new Doctor("Иванов И.И.", "Хирург", 10, 5);
        assertEquals("Иванов И.И.", doctor.getName());
        assertEquals("Хирург", doctor.getSpecialization());
        assertEquals(10, doctor.getExperience());
        assertEquals(5.0, doctor.getRating());
        assertTrue(doctor.getPatients().isEmpty());
    }

    @Test
    public void testInvalidDoctorDataThrowsException() {
        assertThrows(InvalidDoctorDataException.class, () -> {
            new Doctor("Иванов", "Хирург", -1, 4);
        });

        assertThrows(InvalidDoctorDataException.class, () -> {
            new Doctor("Иванов", "Хирург", 5, 0);
        });

        assertThrows(InvalidDoctorDataException.class, () -> {
            new Doctor("Иванов", "Хирург", 5, 6);
        });
    }

    @Test
    public void testAppointmentSuccessAndDuplicateException() throws InvalidDoctorDataException, AppointmentException {
        Doctor doctor = new Doctor("Петрова", "Терапевт", 7, 4);
        doctor.makeAppointment("Пациент 1");
        doctor.makeAppointment("Пациент 2");
        assertEquals(2, doctor.getPatients().size());

        assertThrows(AppointmentException.class, () -> {
            doctor.makeAppointment("Пациент 1");
        });

        assertThrows(AppointmentException.class, () -> {
            doctor.makeAppointment("");
        });
    }

    @Test
    public void testUpdateRating() throws InvalidDoctorDataException {
        Doctor doctor = new Doctor("Сидоров", "Окулист", 3, 3);
        doctor.updateRating(5);
        assertEquals(5.0, doctor.getRating());

        assertThrows(InvalidDoctorDataException.class, () -> {
            doctor.updateRating(7);
        });
    }

    @Test
    public void testClinicOperationsAndDoctorNotFound() throws InvalidDoctorDataException, DoctorNotFoundException, AppointmentException {
        Clinic clinic = new Clinic("ТестКлиника");
        Doctor doctor = new Doctor("Иванов", "Хирург", 5, 4);
        clinic.addDoctor(doctor);

        clinic.makeAppointment("Иванов", "Пациент А");
        assertEquals(1, doctor.getPatients().size());

        assertThrows(DoctorNotFoundException.class, () -> {
            clinic.findDoctorByName("Неизвестный");
        });

        assertThrows(DoctorNotFoundException.class, () -> {
            clinic.makeAppointment("Неизвестный", "Пациент Б");
        });
    }
}
