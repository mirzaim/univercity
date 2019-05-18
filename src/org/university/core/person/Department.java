package org.university.core.person;

import java.util.ArrayList;

public class Department {
    private String name;
    private ArrayList<Course> courses = new ArrayList<>();
    public Department(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void addCourse(Course course){
        courses.add(course);
    }
}
