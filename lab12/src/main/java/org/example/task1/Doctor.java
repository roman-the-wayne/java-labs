package org.example.task1;

public class Doctor extends Professional {
    private String specialization;

    public Doctor() {
    }

    public Doctor(String name, int id, int experience, String specialization) {
        super(name, id, experience);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", experience=" + getExperience() +
                ", specialization='" + specialization + '\'' +
                '}';
    }
}
