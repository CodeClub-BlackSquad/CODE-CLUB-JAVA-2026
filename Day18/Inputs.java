package Day18;

import java.util.Scanner;

public class Inputs
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

//        System.out.print("Are you eligible to vote? ");
//
//        boolean eligibility = sc.nextBoolean(); // true / false
//
//        if(eligibility)
//        {
//            System.out.println("You are eligible to vote");
//        }
//        else
//        {
//            System.out.println("You are not eligible to vote");
//        }

        char grade = sc.next().charAt(0); // "1234"

        System.out.print(grade);

    }
}
