package org.example.models;

public class UserBank implements Runnable {
    private Double extraccion;
    private Double deposite;
    private BankAccount account;
    private String name;

    public String getName() {
        return name;
    }

    public UserBank(String name, Double extraccion, Double deposite, BankAccount account) {
        this.extraccion = extraccion;
        this.deposite = deposite;
        this.account = account;
        this.name = name;

    }

    public Double getExtraccion() {
        return extraccion;
    }

    public void setExtraccion(Double extraccion) {
        this.extraccion = extraccion;
    }

    public Double getDeposite() {
        return deposite;
    }

    public void setDeposite(Double deposite) {
        this.deposite = deposite;
    }


    @Override
    public void run() {

        try {
            while(account.isInBalance()) {
            account.wait();
            }
            if(!account.isInBalance()) {
                account.deposite(getDeposite());
            }
            if(!account.isInBalance()) {
                account.extract(getExtraccion());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
