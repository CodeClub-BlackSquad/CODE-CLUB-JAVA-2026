package Day21;

public class Swap2Numbers
{
    public static void main(String[] args)
    {
        int a = 20;
        int b = 10;

        // a = 20, b = 10

        int temp = a; // temp = 20

        a = b; // a = 10
        b = temp; // b = 20

        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }
}
