package Day37;

import java.util.Scanner;

public class SumOfDigits
{
    static int digitSum(int num)
    {
        int sum = 0;

        while(num != 0)
        {
            int rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }

        return sum;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int sum = digitSum(num);

        System.out.println(sum);
    }
}
