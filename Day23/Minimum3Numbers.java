package Day23;

import java.util.Scanner;

public class Minimum3Numbers
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int a, b, c;

        System.out.print("Enter 1st number: ");
        a = sc.nextInt();

        System.out.print("Enter 2nd number: ");
        b = sc.nextInt();

        System.out.print("Enter 3rd number: ");
        c = sc.nextInt();

        int min = a;

        if( b < min )
        {
            min = b;
        }

        if( c < min )
        {
            min = c;
        }

        System.out.println("Minimum value: " + min);
    }
}
