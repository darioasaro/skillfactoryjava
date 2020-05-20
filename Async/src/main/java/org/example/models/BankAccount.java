package org.example.models;

public class BankAccount {
    private  Double balance = 500000.00;
    private  String accountNumber;

    public boolean isInBalance() {
        return inBalance;
    }

    public void setInBalance(boolean inBalance) {
        this.inBalance = inBalance;
    }

    private boolean inBalance;

    public BankAccount(String number){
        this.accountNumber = number;
    }

    public synchronized void deposite(Double mount) throws InterruptedException {

        System.out.println(Thread.currentThread().getName());
        System.out.println("Previous balance: $"+balance);
        System.out.println("Depositing: $"+mount);
        balance+=mount;
        System.out.println("Your balance is: $"+balance);
        setInBalance(true);
        wait();



    }
    private boolean checkBalance(Double mount){
        return balance > mount;
    }

    public synchronized  void extract(Double mount) throws InsufficientAmountException, InterruptedException {

        System.out.println(Thread.currentThread().getName());
        System.out.println("Extracting: $"+mount);
        if(checkBalance(mount)){
            balance-=mount;
            System.out.println("Your balance is: $"+balance);
            setInBalance(true);
        }
        else{
           throw  new InsufficientAmountException();
        }

    }

    public synchronized Double getBalance() {
        System.out.println(Thread.currentThread().getName());
        return balance;
    }

    public synchronized String getAccountNumber() {
        return accountNumber;
    }
}
