package za.ac.cput.riyaazmavenq2;

import java.util.Scanner;

/**
 * Created by student on 2015/02/13.
 */
public class DecimaltoOctal
{
    int num1;
    Scanner input;
    String oct;

    public void decimaltoOct()
    {
        System.out.println("Decimal to Octal\n");
        input = new Scanner(System.in);

        System.out.println("\nEnter a decimal number :");
        num1 = input.nextInt();
    }

    public void convertDecimaltoOctal()
    {
        String octalNumberString = Integer.toOctalString(num1);
        System.out.println("Octal value of " + num1 + " is " + octalNumberString);
    }

}
