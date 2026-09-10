package Day27;

import java.util.Scanner;

public class SumNnumbers
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number N: ");
        int N = sc.nextInt();

        int count = 0;

        for(int i = 1; i <= N; i++)
        {
            if(i % 3 == 0)
            {
                count++;
            }
        }

        System.out.println(count);

    }
}
