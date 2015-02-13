package za.ac.cput.riyaazmavenq2;

import java.util.Scanner;

/**
 * Created by student on 2015/02/13.
 */
public class BinarytoDecimal
{
    Scanner input;
    String binary;

    public void binarytodecimal() {
        System.out.println("Binary to Decimal");
        input = new Scanner(System.in);

        System.out.println("\nEnter A binary number :");
        binary = input.next();
    }

    public void convertBinarytoDecimal() {
        int DecimalNumberString = Integer.parseInt(binary, 2);
        System.out.println("Decimal number  is : " + DecimalNumberString);
    }
}
