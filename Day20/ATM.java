package Day20;

import java.util.Scanner;

public class ATM
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Account Balance:");
        double balance = sc.nextDouble();
        System.out.print("Enter the Withdrawal Amount:");
        double withdraw = sc.nextDouble();
        if(balance>=withdraw)
        {
            System.out.println("Withdrawal Successful");
            System.out.println(balance-withdraw);
        }
        else
        {
            System.out.println("Insufficient Balance");
        }
        System.out.println("Final balance: " + balance);
    }
}
