package org.example;
import java.util.Scanner;
public class BankAcc
{
    String name;
    int accno;
    int balance;
    Scanner s=new Scanner(System.in);
    Scanner c=new Scanner(System.in);
    BankAcc()
    {
        System.out.println("enter name:");

        String a=c.next();
        System.out.println("enter account no:");
        int b=s.nextInt();
        name=a;
        accno=b;
        balance=0;
    }
    void show()
    {
        System.out.println("name:" + name + " " + "acc no:" + accno + " " + "balance:" +balance);
    }
    void deposit()
    {
        System.out.println("money you want to deposit");
        int a=s.nextInt();
        balance=balance+a;
        System.out.println("your money has been credited");
        System.out.println("what you want to do now?\n 1.deposit \n2.withdrawl \n3.exit");
        System.out.println("select:");
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
        System.out.println("money you want to withdrawl");
        int b=s.nextInt();
        if (b>balance)
        {
            System.out.println("you dont have enough money to withdrawl");
        }
        else
        {
            balance=balance-b;
        }
        System.out.println("your money has been debited");
        System.out.println("what you want to do now?\n 1.deposit \n2.withdrawl \n3.exit");
        System.out.println("select:");
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
