package org.university.core.person.employee;

import org.university.core.person.Department;
import org.university.core.person.Person;
import org.university.core.person.Statement;

import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;

public abstract class AbstractEmployee extends Person {
    private LinkedList<Statement> bankStatement;
    private String position;
    protected Calendar lastPromote;
    protected double basicIncome;

    public AbstractEmployee(String position, double basicIncome,
                            String firstName, String lastName, String id, int joiningYear, Department department) {
        super(firstName, lastName, id, joiningYear, department);
        this.position = position;
        this.basicIncome = basicIncome;

        lastPromote = Calendar.getInstance();
        bankStatement = new LinkedList<>();
    }

    public abstract double getCurrentIncome();

    public abstract boolean isPromotable();

    public void addBankStatement(Statement statement) {
        bankStatement.add(statement);
    }

    public Statement[] getBankStatement() {
        return bankStatement.toArray(new Statement[0]);
    }

    public String getPosition() {
        return position;
    }

    public void setBasicIncome(double basicIncome) {
        this.basicIncome = basicIncome;
    }
}
