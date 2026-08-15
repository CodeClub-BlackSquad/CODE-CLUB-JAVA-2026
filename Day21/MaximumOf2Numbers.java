package Day21;

import java.util.Scanner;

public class MaximumOf2Numbers
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int num1, num2;

        num1 = sc.nextInt();

        num2 = sc.nextInt();

        if(num1 > num2)
        {
            System.out.println("num1 is maximum");
        }
        else if(num2 > num1)
        {
            System.out.println("num2 is maximum");
        }
        else
        {
            System.out.println("Both are equal");
        }
    }
}
