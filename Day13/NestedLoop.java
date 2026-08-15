package Day13;

public class NestedLoop
{
    public static void main(String[] args)
    {
        int n = 3;

        for( int i = 1 ; i <= n ; i++ )
        {
            // Nested loop
            for( int j = 1 ; j <= n  ; j++ )
            {
                System.out.printf("i = %d, j = %d\n", i, j);
            }
        }
    }
}
