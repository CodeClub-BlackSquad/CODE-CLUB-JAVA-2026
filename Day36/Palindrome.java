package Day36;

public class Palindrome
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

    static boolean isPalindrome(int num)
    {
        int rev = reverse(num);

        return (num == rev);
    }

    public static void main(String[] args)
    {
        int num = 12321;

        boolean result = isPalindrome(num);

        System.out.println(result);

    }
}
