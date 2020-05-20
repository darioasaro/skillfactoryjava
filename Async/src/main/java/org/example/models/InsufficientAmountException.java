package org.example.models;

public class InsufficientAmountException extends RuntimeException {
    public InsufficientAmountException(){
        super("Not Allowed Operation, not enough funds");
    }
}
