package com.java;

public class Student {

    private int studentId;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public Student() {
        System.out.println("This is the non-parameterized constructor");
    }

    public Student(int studentId) {
        this.setStudentId(studentId);

        System.out.println("The student ID is set as: " + this.getStudentId());
    }
    
    public static void main(String[] args) {
        Student student = new Student();

        Student student2 = new Student(110);
    }
    
}
