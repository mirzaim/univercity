package org.university.core.person.employee;

import org.university.core.person.Department;

public class ServiceEmployee extends AbstractEmployee{

    public ServiceEmployee(String position, double basicIncome,
                           String firstName, String lastName, String id, int joiningYear, Department department) {
        super(position, basicIncome, firstName, lastName, id, joiningYear, department);
    }

    @Override
    public double getCurrentIncome() {
        return 0;
    }

    @Override
    public boolean isPromotable() {
        return false;
    }

}
