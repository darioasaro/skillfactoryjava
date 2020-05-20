package org.example;

import org.example.models.BankAccount;
import org.example.models.Manager;
import org.example.models.UserBank;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
         BankAccount account = new BankAccount("1234");
         Thread t1 = new Thread(new UserBank("Dario",10000.00,125000.00,account),"User-Dario");
         Thread t2 = new Thread(new UserBank("Luciana",12000.00,200000.00,account),"User-Luciana");
         Thread t3 = new Thread(new Manager(account),"Manager");


        t2.start();
        t3.start();
        t1.start();



    }
}
