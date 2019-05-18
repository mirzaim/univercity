package org.university.core.person;

import org.university.core.person.employee.Professor;
import org.university.core.person.student.AbstractStudent;
import org.university.core.person.student.GradStudent;

import java.util.ArrayList;

public class Course {
    private String name;
    private Professor instructor;
    private ArrayList<AbstractStudent> students = new ArrayList<>();
    private GradStudent teacherAssistance;


    public GradStudent getTeacherAssistance() {
        return teacherAssistance;
    }

    public void setTeacherAssistance(GradStudent teacherAssistance) {
        this.teacherAssistance = teacherAssistance;
    }

    public Course(String name, Professor instructor) {
        this.name = name;
        this.instructor = instructor;
    }

    public String getName() {
        return name;
    }

    public Professor getInstructor() {
        return instructor;
    }

    public ArrayList<AbstractStudent> getStudents() {
        return students;
    }

    public void addStudent(AbstractStudent student) {
        this.students.add(student);
    }
}
