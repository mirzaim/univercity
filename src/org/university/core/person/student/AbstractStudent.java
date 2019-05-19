package org.university.core.person.student;

import org.university.core.person.Course;
import org.university.core.person.Department;
import org.university.core.person.Person;

import java.util.LinkedList;

public class AbstractStudent extends Person {
    private LinkedList<Course> pastCourses;

    public AbstractStudent(String firstName, String lastName, String id, int joiningYear, Department department) {
        super(firstName, lastName, id, joiningYear, department);
        pastCourses = new LinkedList<>();
    }

    public Course[] getPastCourses() {
        return pastCourses.toArray(new Course[0]);
    }

    public void addPastCourse(Course course) {
        pastCourses.add(course);
    }
}
