package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {

        Account account = new Account(1001,"Regi",1000.0);
        BusinessAccount businessAccount = new BusinessAccount(1002,"Maria",0.0,500.0);

        // UPCASTING
        // converter o objeto da subclase para superclasse
        Account acc1 = businessAccount;
        Account acc2 = new BusinessAccount(1003,"Bob",0.0,500.0);
        Account acc3 = new SavingsAccount(1004,"Anna",0.0,0.01);

        // Downcasting
        // converter,fazer o casting da superclasse para subclase
        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);

        if(acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }

        if(acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }



    }

}
