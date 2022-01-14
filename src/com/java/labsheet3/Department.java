package com.java.labsheet3;

import java.util.ArrayList;
import java.util.List;

public class Department {

    String name;
    Building building;
    Employee headOfDepartment;
    List<Employee> listOfEmployees = new ArrayList<>();
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Building getBuilding() {
        return building;
    }

    public void setBuilding(Building building) {
        this.building = building;
    }

    public Employee getHeadOfDepartment() {
        return headOfDepartment;
    }

    public void setHeadOfDepartment(Employee headOfDepartment) throws Exception {
        if(headOfDepartment.getDepartment().getName() != this.getName()) {
            throw new Exception("Employee must belong to same department");
        }
        this.headOfDepartment = headOfDepartment;
    }

    public List<Employee> getListOfEmployees() {
        return listOfEmployees;
    }

    public void setListOfEmployees(List<Employee> listOfEmployees) {
        this.listOfEmployees = listOfEmployees;
    }

    @Override
    public String toString() {
        return "Department";
    }
}
