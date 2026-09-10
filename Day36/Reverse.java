package Day36;

public class Reverse
{
    static int reverse(int num)
    {
        int rev = 0;

        while(num != 0)
        {
            int rem = num%10;
            rev = (rev * 10) + rem;
            num = num/10;
        }

        return rev;
    }

    public static void main(String[] args)
    {
        int num1 = 725;
        int num2 = 1234;
        int num3 = 987;
        System.out.println(reverse(num1));
        System.out.println(reverse(num2));
        System.out.println(reverse(num3));
    }
}
