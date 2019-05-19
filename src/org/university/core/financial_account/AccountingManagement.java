package org.university.core.financial_account;

import org.university.core.person.Person;
import org.university.core.person.Statement;
import org.university.core.person.employee.AbstractEmployee;

import java.util.ArrayList;

public class AccountingManagement {
    private ArrayList<Account> accounts;
    private ArrayList<Statement> paidStatements;

    public AccountingManagement() {
        accounts = new ArrayList<>();
        paidStatements = new ArrayList<>();
    }

    public void makeAccount(AbstractEmployee person) {
        accounts.add(new Account(person, 0));
    }

    public Statement[] getPaidStatements() {
        return paidStatements.toArray(new Statement[0]);
    }

    public void settle() {
        for (Account account : accounts)
            account.checkout();
    }


    public final class Account {
        private final AbstractEmployee owner;
        private double balance;

        public Account(AbstractEmployee owner, double balance) {
            this.owner = owner;
            this.balance = balance;
        }

        public void checkout() {
            Statement statement = new Statement(owner.getCurrentIncome(), owner);
            paidStatements.add(statement);
            balance += statement.getAmount();
        }

        public AbstractEmployee getOwner() {
            return owner;
        }

        public double getBalance() {
            return balance;
        }
    }
}
