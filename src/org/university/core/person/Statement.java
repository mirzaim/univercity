package org.university.core.person;

import org.university.core.financial_account.AccountingInterface;

public final class Statement {
    private double amount;
    private AccountingInterface receiver;

    public Statement(double amount, AccountingInterface receiver) {
        this.amount = amount;
        this.receiver = receiver;
    }

    public double getAmount() {
        return amount;
    }

    public AccountingInterface getReceiver() {
        return receiver;
    }
}
