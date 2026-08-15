package Day24;

import java.util.Scanner;

public class DayCalculator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int day = sc.nextInt();


        switch(day)
        {
            case 1 :
                System.out.println("Sunday");
                System.out.println("Dhamo");
                break;

            case 2 :
                System.out.println("Monday"); // sout
                break;

            case 3 :
                System.out.println("Tuesday");
                break;

            case 4 :
                System.out.println("Wednesday");
                break;

            case 5 :
                System.out.println("Thursday");
                break;

            case 6 :
                System.out.println("Friday");
                break;

            case 7 :
                System.out.println("Saturday");
                break;

            default :
                System.out.println("Invalid");
        }
    }
}
