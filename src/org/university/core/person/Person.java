package org.university.core.person;

public class Person {
    protected String firstName;
    protected String lastName;
    protected String id;
    protected int joiningYear;
    protected Department department;

    public Person(String firstName, String lastName, String id, int joiningYear, Department department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.joiningYear = joiningYear;
        this.department = department;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getId() {
        return id;
    }

    public int getJoiningYear() {
        return joiningYear;
    }

    public Department getDepartment() {
        return department;
    }
}
