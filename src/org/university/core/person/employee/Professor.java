package org.university.core.person.employee;

import org.university.core.person.Course;
import org.university.core.person.Department;

import java.util.ArrayList;

public class Professor extends AbstractEmployee {
    private ArrayList<Course> courses;
    private String group;

    public Professor(String group, String position, double basicIncome,
                     String firstName, String lastName, String id, int joiningYear, Department department) {

        super(position, basicIncome, firstName, lastName, id, joiningYear, department);

        courses = new ArrayList<>();
        this.group = group;
    }

    @Override
    public double getCurrentIncome() {
        return 0;
    }

    @Override
    public boolean isPromotable() {
        return false;
    }

    public Course[] getCourses() {
        return courses.toArray(new Course[0]);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public String getGroup() {
        return group;
    }
}
