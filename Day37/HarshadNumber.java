package Day37;

import java.util.Scanner;

public class HarshadNumber
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

    static boolean isHarshadNumber(int num)
    {
        int sum = digitSum(num);
        return num % sum == 0;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        boolean result = isHarshadNumber(num);

        if(result)
        {
            System.out.println(num + " is a Harshad number");
        }
        else
        {
            System.out.println(num + " is Not a Harshad number");
        }

    }
}
