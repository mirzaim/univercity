package org.university.core.person;

import org.university.core.financial_account.AccountingInterface;

import java.util.Calendar;
import java.util.Date;

public final class Statement {
    private String id;
    private double amount;
    private AccountingInterface receiver;
    private Calendar paidDate;

    public Statement(double amount, AccountingInterface receiver) {
        this(amount, receiver, Calendar.getInstance());
    }

    public Statement(double amount, AccountingInterface receiver, Calendar date) {
        id = date.toString() + receiver.getId();
        this.amount = amount;
        this.receiver = receiver;
        paidDate = date;
    }

    public double getAmount() {
        return amount;
    }

    public AccountingInterface getReceiver() {
        return receiver;
    }

    public Calendar getPaidDate() {
        return  paidDate;
    }
}
