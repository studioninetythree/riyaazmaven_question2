package za.ac.cput.riyaazmavenq2;

import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.*;

import java.util.Scanner;

/**
 * Created by student on 2015/02/13.
 */
public class TestConversion extends TestCase
{
    @Test
    public void testDectoBin()
    {
        System.out.println("Decimal to Binary");

        int num = 34;
        String binaryNumberString = Integer.toBinaryString(num);
        assertEquals("100010", binaryNumberString);
    }

    @Test
    public void testBintoDec()
    {
        System.out.println("Binary to Decimal");

        String bin = "1001";
        int DecimalNumberString = Integer.parseInt(bin, 2);

        assertEquals(9,DecimalNumberString);
    }

    @Test
    public void testDectoOct()
    {
        int num1 = 23;
        String octalNumberString = Integer.toOctalString(num1);

        assertEquals(27,octalNumberString);
    }

    @Test
    public void testOcttoDec()
    {
        String oct = "27";
        int DecimalNumberString = Integer.parseInt(oct, 2);

        assertEquals("23",DecimalNumberString);
    }

}
