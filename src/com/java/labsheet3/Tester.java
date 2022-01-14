package com.java.labsheet3;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Tester {

    public static void main(String[] args) throws Exception {
        Hospital hospital = new Hospital();
        hospital.setName("Hospital 1");
        hospital.setLocation("Hospital 1 Location");

        Building building1 = new Building("Building1", "B0001", "Building 1 Location", 5, 15400);
        Building building2 = new Building("Building2", "B0002", "Building 2 Location", 4, 3500);

        Department department1 = new Department();
        department1.setBuilding(building1);
        department1.setName("Depatment1");

        Department department2 = new Department();
        department2.setBuilding(building2);
        department2.setName("Department2");

        List<Department> departmentList = new ArrayList<>();
        departmentList.add(department1);
        departmentList.add(department2);

        hospital.setListOfDepartments(departmentList);

        Employee employee1 = new MedicalStaff();
        Employee employee2 = new MedicalStaff();
        Employee employee3 = new MedicalStaff();

        employee1.setDateOfBirth(new Date(158954754));
        employee1.setDepartment(department1);
        employee1.setDesignation("Unknown1");
        employee1.setEmailId("something@something.com");
        employee1.setEmployeeId("EMP001");
        employee1.setGender("Male");
        employee1.setName("Employee1");
        employee1.setPhoneNumber("9876543210");
        employee1.setSalary(15600L);

        employee2.setDateOfBirth(new Date(158954754));
        employee2.setDepartment(department1);
        employee2.setDesignation("Unknown2");
        employee2.setEmailId("something@something.com");
        employee2.setEmployeeId("EMP002");
        employee2.setGender("Female");
        employee2.setName("Employee2");
        employee2.setPhoneNumber("9876543210");
        employee2.setSalary(15600L);

        employee3.setDateOfBirth(new Date(158954754));
        employee3.setDepartment(department1);
        employee3.setDesignation("Unknown3");
        employee3.setEmailId("something@something.com");
        employee3.setEmployeeId("EMP003");
        employee3.setGender("Transgender");
        employee3.setName("Employee3");
        employee3.setPhoneNumber("9876543210");
        employee3.setSalary(15600L);
        

        Employee employee4 = new NonMedicalStaff();

        employee4.setDateOfBirth(new Date(158954754));
        employee4.setDepartment(department2);
        employee4.setDesignation("Unknown1");
        employee4.setEmailId("something@something.com");
        employee4.setEmployeeId("EMP004");
        employee4.setGender("Male");
        employee4.setName("Employee4");
        employee4.setPhoneNumber("9876543210");
        employee4.setSalary(15600L);

        Employee employee5 = new NonMedicalStaff();

        employee5.setDateOfBirth(new Date(158954754));
        employee5.setDepartment(department2);
        employee5.setDesignation("Unknown1");
        employee5.setEmailId("something@something.com");
        employee5.setEmployeeId("EMP005");
        employee5.setGender("Female");
        employee5.setName("Employee5");
        employee5.setPhoneNumber("9876543210");
        employee5.setSalary(15600L);

        department1.setHeadOfDepartment(employee1);
        department2.setHeadOfDepartment(employee4);

        System.out.println(department1.getListOfEmployees().toString());
        System.out.println(department2.getListOfEmployees().toString());

        System.out.println(hospital);

    }
    
}
