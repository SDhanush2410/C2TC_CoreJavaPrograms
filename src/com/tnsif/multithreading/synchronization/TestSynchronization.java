package com.tnsif.multithreading.synchronization;

class BankAccount {
    int balance = 1000;

    synchronized void withdraw(int amount) {

        System.out.println(Thread.currentThread().getName() + " wants to withdraw " + amount);

        if (balance >= amount) {
            System.out.println("Processing withdrawal...");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

class Customer extends Thread {
    BankAccount account;

    Customer(BankAccount account, String name) {
        super(name);
        this.account = account;
    }
    
    @Override
    public void run() {
        account.withdraw(600);
    }
}

public class TestSynchronization {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount();

        Customer c1 = new Customer(acc, "Customer-1");
        Customer c2 = new Customer(acc, "Customer-2");

        c1.start();
        c2.start();
    }
}
