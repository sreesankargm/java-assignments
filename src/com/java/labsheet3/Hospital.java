package com.java.labsheet3;

import java.util.List;

public class Hospital {
    
    String name;
    String location;
    List<Department> listOfDepartments;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Department> getListOfDepartments() {
        return listOfDepartments;
    }

    public void setListOfDepartments(List<Department> listOfDepartments) {
        this.listOfDepartments = listOfDepartments;
    }

    @Override
    public String toString() {
        return "Department";
    }

}
