package Day33;

public class Methods
{
    static void run(String name, int age)
    {
        System.out.println(name + " is running, she is " + age);
    }

    static int addTwoNumbers(int a , int b)
    {
        return a + b;
    }

    public static void main(String[] args)
    {
        int sum = addTwoNumbers(10, 20);
        System.out.println(sum);
    }
}
