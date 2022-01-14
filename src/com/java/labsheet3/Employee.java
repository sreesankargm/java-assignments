package com.java.labsheet3;

import java.util.List;

public abstract class Employee extends Person {

    String employeeId;
    Department department;
    String designation;
    String emailId;
    String phoneNumber;
    Long Salary;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        List<Employee> employeeList = department.getListOfEmployees();
        employeeList.add(this);
        department.setListOfEmployees(employeeList);
        this.department = department;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Long getSalary() {
        return Salary;
    }

    public void setSalary(Long salary) {
        Salary = salary;
    }

    public abstract boolean isMedicalStaff();
    
}
