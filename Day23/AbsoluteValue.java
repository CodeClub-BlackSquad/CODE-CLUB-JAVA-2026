package Day23;

import java.util.Scanner;

public class AbsoluteValue
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if(num < 0)
        {
            num = -num;
        }

        System.out.println("Absolute Value: " + num);
    }
}
