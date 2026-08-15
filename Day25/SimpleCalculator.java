package Day25;

import java.util.Scanner;

public class SimpleCalculator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int num1, num2;

        System.out.print("Enter first number: ");
        num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        num2 = sc.nextInt();

        System.out.print("Enter a valid operation ( + , - , * , / , % ): ");
        char opt = sc.next().charAt(0);

        int res;

        switch (opt)
        {
            case '+' :
                res = num1 + num2;
                break;

            case '-':
                res = num1 - num2;
                break;

            case '*':
                res = num1 * num2;
                break;

            case '/':
                res = num1 / num2;
                break;

            case '%':
                res = num1 % num2;
                break;

            default:
                res = -1;
                System.out.println("Invalid operator");
        }

        System.out.println(res);
    }
}
