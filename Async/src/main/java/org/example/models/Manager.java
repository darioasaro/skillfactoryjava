package org.example.models;

public class Manager implements Runnable {
    private BankAccount account;
    private Integer quantity;

    public Manager(BankAccount account) {
        this.account = account;
        quantity = 0;

    }

    private synchronized Double getBalance() {

        return account.getBalance();
    }

    @Override
    public void run() {
        while (quantity < 4 && account.isInBalance()) {
            synchronized (account) {
                try {
                    System.out.println("Blocked account for 10 seconds");

                     Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(" Total Balance for account : " + account.getAccountNumber() + " is: $" + getBalance());
            }

            quantity ++;
            account.setInBalance(false);
            account.notify();

        }
    }
}