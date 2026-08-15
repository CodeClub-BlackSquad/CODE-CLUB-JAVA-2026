package Day9;

public class RelationalOperators
{
    public static void main(String[] args)
    {
        int num1, num2, num3, num4;

        num1 = 10;
        num2 = 10;

        boolean isEqual = ( num1 == num2 ); // 10 == 10 -> true

        num3 = 20;
        num4 = 30;

        boolean isNotEqual = num3 != num4; // 20 != 20 -> false

        boolean isLessThan = num3 < num4;

        boolean isLessThanOrEqualTo = num3 <= num4; // 30 <= 20 -> false

        boolean isGreaterThan = num3 > num4; // 20 > 20 -> false

        boolean isGreaterThanOrEqualTo = num3 >= num4; // 20 >= 30

        System.out.println(isGreaterThanOrEqualTo);  // hard coding
    }
}
