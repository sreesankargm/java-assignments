package com.java;

public class Course {

    private int courseCode;
    private String courseTitle;

    private final String STUDYPROGRAM = "PROGRAM1";

    public int getCourseCode() {
        return courseCode;
    }
    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }
    public String getCourseTitle() {
        return courseTitle;
    }
    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    @Override
    public String toString(){
        return "Course code: " + this.getCourseCode() + ", Course Title: " + this.getCourseTitle() + ", Study Program: " + this.STUDYPROGRAM;
    }

    public Course(int courseCode, String courseTitle) {
        this.setCourseCode(courseCode);
        this.setCourseTitle(courseTitle);
    }

    public static void main(String[] args) {
        Course course = new Course(1234, "This is the course title");

        System.out.println(course);

        Course course2 = new Course(2345, "This is the second course title");

        System.out.println(course2);
    }
    
    
}
