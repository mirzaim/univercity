package org.university.core.person.employee;

import org.university.core.person.Statement;

import java.util.LinkedList;

public abstract class AbstractEmployee {
    private LinkedList<Statement> bankStatement;
    private String position;
    protected double basicIncome;

    public AbstractEmployee(String position, double basicIncome) {
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
