package org.university.core.person.student;

import org.university.core.person.Department;
import org.university.core.person.Publication;

import java.util.LinkedList;

public class GradStudent extends AbstractStudent {
    private LinkedList<Publication> publications;

    public GradStudent(String firstName, String lastName, String id, int joiningYear, Department department) {
        super(firstName, lastName, id, joiningYear, department);

        publications = new LinkedList<>();
    }

    public void addPublication(Publication publication) {
        publications.add(publication);
    }

    public Publication[] getPublications() {
        return publications.toArray(new Publication[0]);
    }
}
