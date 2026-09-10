package Day31;

import java.util.Scanner;

public class PalindromeOrNot
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to check if it is a palindrome or not: ");
        int num = sc.nextInt();

        int temp = num; // copy

        int rev = 0;

        while(num != 0)
        {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }

        num = temp; // preserving original value

        if(num == rev)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a palindrome");
        }
    }
}
