package org.example;
import java.util.Scanner;
import java.util.logging.*;
public class BankAcc
{
    String name;
    int accno;
    int balance;
    Logger l=Logger.getLogger("tyler");
    Scanner s=new Scanner(System.in);
    Scanner c=new Scanner(System.in);
    BankAcc()
    {
        l.info("enter name:");

        String a=c.next();
        l.info("enter account no:");
        int b=s.nextInt();
        name=a;
        accno=b;
        balance=0;
    }
    void show()
    {
        l.log(Level.INFO, () ->"name:" + name + " " + "acc no:" + accno + " " + "balance:" +balance);
    }
    void deposit()
    {
        l.info("money you want to deposit");
        int a=s.nextInt();
        balance=balance+a;
        l.info("your money has been credited");
        l.info("what you want to do now?\n 1.deposit \n2.withdrawl \n3.exit");
        l.info("select:");
        int sel=s.nextInt();
        if (sel==1)
        {
            deposit();
        }
        if (sel==2)
        {
            withdrawl();
        }
        if (sel==3)
        {
            show();
        }
    }
    void withdrawl()
    {
        l.info("money you want to withdrawl");
        int b=s.nextInt();
        if (b>balance)
        {
            l.info("you dont have enough money to withdrawl");
        }
        else
        {
            balance=balance-b;
        }
        l.info("your money has been debited");
        l.info("what you want to do now?\n 1.deposit \n2.withdrawl \n3.exit");
        l.info("select:");
        int sel=s.nextInt();
        if (sel==1)
        {
            deposit();
        }
        if (sel==2)
        {
            withdrawl();
        }
        if (sel==3)
        {
            show();
        }
    }
    public static void main(String[] args)
    {
        BankAcc ragul=new BankAcc();
        ragul.deposit();
    }
}
