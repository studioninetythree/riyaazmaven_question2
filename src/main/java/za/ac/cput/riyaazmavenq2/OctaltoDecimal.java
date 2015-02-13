package za.ac.cput.riyaazmavenq2;

import java.util.Scanner;

/**
 * Created by student on 2015/02/13.
 */
public class OctaltoDecimal
{
    Scanner input;
    String oct;

    public void octaltodecimal()
    {
        System.out.println("Octal to Decimal");
        input = new Scanner(System.in);

        System.out.println("\nEnter A octal number :");
        oct = input.next();
    }

    public void convertOctaltoDecimal() {
        int DecimalNumberString = Integer.parseInt(oct, 2);
        System.out.println("Decimal number  is : " + DecimalNumberString);
    }
}
