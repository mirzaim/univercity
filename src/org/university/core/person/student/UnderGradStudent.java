package org.university.core.person.student;

import org.university.core.person.Department;

public class UnderGradStudent extends AbstractStudent {
    public UnderGradStudent(String firstName, String lastName, String id, int joiningYear, Department department) {
        super(firstName, lastName, id, joiningYear, department);
    }
}
