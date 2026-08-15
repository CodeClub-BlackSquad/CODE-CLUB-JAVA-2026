package Day19;

import java.util.Scanner;

public class MarksheetGenerator
{
    public static void main(String[] args)
    {
        /*
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student Name:");
        String name = sc.nextLine();

        System.out.println("Tamil:");
        int tamil = sc.nextInt();

        System.out.println("English:");
        int english = sc.nextInt();

        System.out.println("Maths:");
        int maths = sc.nextInt();

        System.out.println("Science:");
        int science = sc.nextInt();

        System.out.println("Social Science:");
        int social = sc.nextInt();

        int total = tamil + english + maths + science + social;
        double average = total / 5.0;
        double percentage = (total / 500.0) * 100;

        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);
        System.out.println("Percentage: " + percentage + "%");

         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the student: ");
        String name=sc.nextLine();
        System.out.print("Enter marks scored in Tamil:");
        int tamil=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter marks scored in English:");
        int english=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter marks scored in Maths:");
        int maths=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter marks scored in Science:");
        int science=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter marks scored in Social Science:");
        int socialscience=sc.nextInt();
        sc.nextLine();
        int total=tamil+english+maths+science+socialscience;
        double average=total/5.0;
        sc.nextLine();
        double percentage=(total/500.0)*100;
        System.out.println("         Student Report");
        System.out.println("Student name: "+name);
        System.out.println("Total marks: "+total);
        System.out.println("Average: "+average);
        System.out.println("Percentage: "+percentage+"%");
    }
}