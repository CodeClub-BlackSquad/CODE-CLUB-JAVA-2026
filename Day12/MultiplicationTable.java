package Day12;

public class MultiplicationTable
{
    public static void main(String[] args)
    {
        /*
        a = 1 to 6, b = 5, 10, ... 30

            b = a * 5;

        a + " x 5 = " + b
        */


        int multiple = 97;

        for (int a = 1; a <= 6; a++ )
        {
            int b = a * multiple;
            System.out.printf("%d x %d = %d\n", a, multiple, b); // Concatenation
        }

        /*
        a x 5 = b


        1 x 5 = 5
        2 x 5 = 10
        3 x 5 = 15
        4 x 5 = 20
        5 x 5 = 25
        6 x 5 = 30

         */

//        System.out.println( a + " x 5 = " + b );



    }
}
