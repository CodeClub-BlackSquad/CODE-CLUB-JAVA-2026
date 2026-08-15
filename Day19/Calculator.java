package Day19;

import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args)
    {
        int num1, num2;
        char operator;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        num1 = sc.nextInt();

        System.out.print("Enter Second Number: ");
        num2 = sc.nextInt();

        System.out.print("Enter Operation (+,-,*,/,%): ");
        operator = sc.next().charAt(0);

        int result;

        if(operator == '+')
        {
            result = num1 + num2;
        }
        else if(operator == '-')
        {
            result = num1 - num2;
        }
        else if(operator == '*')
        {
            result = num1 * num2;
        }
        else if(operator == '/')
        {
            result = num1 / num2;
        }
        else if(operator == '%')
        {
            result = num1 % num2;
        }
        else
        {
            result = -1;
            System.out.println("Operation not supported");
        }

        System.out.println(num1 + " " + operator + " " + num2 +" = "+ result);

    }
}
