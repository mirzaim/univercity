package org.university.core.person.employee;

import org.university.core.person.Course;
import org.university.core.person.Department;
import org.university.core.person.Publication;

import java.util.ArrayList;
import java.util.Calendar;

public class Professor extends AbstractEmployee {
    private ArrayList<Course> courses;
    private ArrayList<Publication> publications;
    private String group;

    public Professor(String group, String position, double basicIncome,
                     String firstName, String lastName, String id, int joiningYear, Department department) {

        super(position, basicIncome, firstName, lastName, id, joiningYear, department);
        basicIncome = 7000;
        courses = new ArrayList<>();
        publications = new ArrayList<>();
        this.group = group;
    }

    @Override
    public double getCurrentIncome() {
        return basicIncome + courses.size() * 10000;
    }

    @Override
    public boolean isPromotable() {
        int count = 0;
        for (Publication publication : publications)
            if (publication.getPublishTime().get(Calendar.YEAR) >= lastPromote.get(Calendar.YEAR))
                count++;
        return count >= 10;
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
