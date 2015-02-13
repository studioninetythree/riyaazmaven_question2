package za.ac.cput.riyaazmavenq2;

import java.util.Scanner;

/**
 * Created by student on 2015/02/13.
 */
public class DecimaltoBinary
{
    int num;
    Scanner input;

    public void decimaltobinary() {
        System.out.println("Decimal to Binary");
        System.out.println("Enter a decimal number: ");
        num = input.nextInt();
    }


    public void convertDecimaltoBinary()
    {
        String binaryNumberString = Integer.toBinaryString(num);
        System.out.println("Binary value of " + num + " is " + binaryNumberString);
    }
}
