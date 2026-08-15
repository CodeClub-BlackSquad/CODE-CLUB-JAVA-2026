package Day21;

import java.util.Scanner;

public class MaximumBetween2Numbers
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int num1, num2;

        num1 = sc.nextInt();

        num2 = sc.nextInt();

        int maximum = num1;

        if(num2 > maximum)
        {
            maximum = num2;
        }

        /*
        int maximum = -1;

        if(num1 > maximum)
        {
            maximum = num1;
        }

        if(num2 > maximum)
        {
            maximum = num2;
        }

         */

        System.out.println(maximum);
    }
}
