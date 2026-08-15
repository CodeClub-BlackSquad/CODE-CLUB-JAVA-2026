package Day14;

public class Continue
{
    public static void main(String[] args)
    {
        // continue

        // 1 to 10 print
        // num % 3 == 0 - skip

        for(int i = 1; i <= 10; i++)
        {
            if(i % 3 == 0)
            {
                return;
            }

            System.out.println(i);
        }

        System.out.println("Out of loop");
    }
}
