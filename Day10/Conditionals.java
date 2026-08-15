package Day10;

public class Conditionals
{
    public static void main(String[] dhamo)
    {
        int age = 16;

        // age >= 18

        boolean condition = age >= 18;

        System.out.println(condition);

        if( condition )
        {
            System.out.println("You are eligible to vote");
        }

        else
        {
            System.out.println("You are not eligible to vote");
        }
    }
}
