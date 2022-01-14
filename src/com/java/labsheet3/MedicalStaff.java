package com.java.labsheet3;

public class MedicalStaff extends Employee {

    String specialization;
    String registrationNumber;
    Float yearsOfMedicalExperience;
    boolean isDoctor;
    boolean isVisitingConsultant;

    public String getSpecialization() {
        return specialization;
    }
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    public String getRegistrationNumber() {
        return registrationNumber;
    }
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
    public Float getYearsOfMedicalExperience() {
        return yearsOfMedicalExperience;
    }
    public void setYearsOfMedicalExperience(Float yearsOfMedicalExperience) {
        this.yearsOfMedicalExperience = yearsOfMedicalExperience;
    }
    public boolean isDoctor() {
        return isDoctor;
    }
    public void setDoctor(boolean isDoctor) {
        this.isDoctor = isDoctor;
    }
    public boolean isVisitingConsultant() {
        return isVisitingConsultant;
    }
    public void setVisitingConsultant(boolean isVisitingConsultant) {
        this.isVisitingConsultant = isVisitingConsultant;
    }
    @Override
    public boolean isMedicalStaff() {
        // TODO Auto-generated method stub
        return true;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("""
            Name: %s,
            Designation: %s,
            Specialization: %s
        """, this.getName(), this.getDesignation(), this.getSpecialization());
    }

    public boolean isDoctorVisitingConsultant() {
        return isDoctor && isVisitingConsultant;
    }

    
    
}
