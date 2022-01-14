package com.java.labsheet3;

public class NonMedicalStaff extends Employee {

    boolean isAdministrativeStaff;
    boolean isManager;

    public boolean isAdministrativeStaff() {
        return isAdministrativeStaff;
    }

    public void setAdministrativeStaff(boolean isAdministrativeStaff) {
        this.isAdministrativeStaff = isAdministrativeStaff;
    }

    public boolean isManager() {
        return isManager;
    }

    public void setManager(boolean isManager) {
        this.isManager = isManager;
    }

    @Override
    public boolean isMedicalStaff() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("""
        Name: %s,
        Designation: %s,
        Specialization: %s
    """, this.getName(), this.getDesignation(), this.isAdministrativeStaff());
    }
    
}
