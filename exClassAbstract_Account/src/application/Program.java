package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Account> accountList = new ArrayList<>();

        accountList.add(new SavingsAccount(1001,"Alex",500.00,0.01));
        accountList.add(new BusinessAccount(1002,"Maria",1000.0,400.0));
        accountList.add(new SavingsAccount(1003,"Bob",300.00,0.01));
        accountList.add(new BusinessAccount(1004,"Anna",500.0,500.0));

        double sum = 0.0;
        for(Account acc : accountList){
            sum += acc.getBalance();
        }

        System.out.printf("Total balance: %.2f%n",sum);

    }

}
