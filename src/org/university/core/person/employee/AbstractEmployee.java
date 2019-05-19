package org.university.core.person.employee;

import org.university.core.person.Department;
import org.university.core.person.Person;
import org.university.core.person.Statement;

import java.util.LinkedList;

public abstract class AbstractEmployee extends Person {
    private LinkedList<Statement> bankStatement;
    private String position;
    protected double basicIncome;

    public AbstractEmployee(String position, double basicIncome,
                            String firstName, String lastName, String id, int joiningYear, Department department) {
        super(firstName, lastName, id, joiningYear, department);
        this.position = position;
        this.basicIncome = basicIncome;

        bankStatement = new LinkedList<>();
    }


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
