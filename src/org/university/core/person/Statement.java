package org.university.core.person;

public final class Statement {
    private double amount;
    private Person receiver;

    public Statement(double amount, Person receiver) {
        this.amount = amount;
        this.receiver = receiver;
    }

    public double getAmount() {
        return amount;
    }

    public Person getReceiver() {
        return receiver;
    }
}
