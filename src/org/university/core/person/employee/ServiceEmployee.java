package org.university.core.person.employee;

import org.university.core.person.Department;

import java.util.Calendar;

public class ServiceEmployee extends AbstractEmployee {

    public ServiceEmployee(String position, double basicIncome,
                           String firstName, String lastName, String id, int joiningYear, Department department) {
        super(position, basicIncome, firstName, lastName, id, joiningYear, department);
        basicIncome = 3000;
    }

    @Override
    public double getCurrentIncome() {
        return basicIncome;
    }

    @Override
    public boolean isPromotable() {
        return Calendar.getInstance().get(Calendar.YEAR) - lastPromote.get(Calendar.YEAR) >= 3;
    }

}
