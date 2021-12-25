package com.java;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class Person {

    private int id;
    private String name;
    private Date dateOfBirth;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Person() {
        System.out.println("This is the non-parameterized constructor");
    }

    public Person(int id, String name, Date dateOfBirth) {
        this.setId(id);
        this.setName(name);
        this.setDateOfBirth(dateOfBirth);
    }

    @Override
    public String toString() {

        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

        String dob = df.format(this.getDateOfBirth());

        return "Id: " + Integer.toString(this.getId()) + ", Name: " + this.getName() + ", DOB: "
                + dob;
    }

    public static void main(String[] args) {
        String dob = "30/05/1900";

        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

        Date dateOfBirth = new Date();

        try {
            dateOfBirth = df.parse(dob);
        } catch (ParseException e) {
            System.out.println("Date cannot be parsed! + " + e.getMessage());
        }

        Person person = new Person(1, "Giri", dateOfBirth);

        System.out.println(person);
    }

}
