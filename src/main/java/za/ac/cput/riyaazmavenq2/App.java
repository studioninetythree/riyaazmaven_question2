package za.ac.cput.riyaazmavenq2;

import java.util.Scanner;

public class App {

    public static void main(String[] args)
    {
        DecimaltoBinary dtb = new DecimaltoBinary();
        BinarytoDecimal btd = new BinarytoDecimal();
        DecimaltoOctal dto = new DecimaltoOctal();
        OctaltoDecimal otd =  new OctaltoDecimal();

        Scanner input = new Scanner(System.in);

        int choice;

        System.out.println("Enter your choice: \n1.Decimal to binary\n2.Binary to decimal\n3.Decimal to Octal\n4.Octal to Decimal\n5.Exit");
        choice = input.nextInt();

        while (choice != 5) {
            switch (choice) {
                case 1:
                    dtb.decimaltobinary();
                    dtb.convertDecimaltoBinary();
                    break;

                case 2:
                    btd.binarytodecimal();
                    btd.convertBinarytoDecimal();
                    break;

                case 3:
                    dto.decimaltoOct();
                    dto.convertDecimaltoOctal();
                    break;

                case 4:
                    otd.octaltodecimal();
                    otd.convertOctaltoDecimal();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Error: Exiting...");
                    System.exit(0);
                    break;
            }
            System.out.println("Enter your choice: \n1.Decimal to binary\n2.Binary to decimal\n3.Decimal to Octal\n4.Octal to Decimal\n5.Exit");
            choice = input.nextInt();

        }

    }

}