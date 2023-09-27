import java.util.Scanner;
import java.lang.Math;

public class Calculator {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        //continious loop that will display the program converter options
        while (true) {
            System.out.println("Programmer Converter Menu:");
            System.out.println("1. Hex to Dec");
            System.out.println("2. Dec to Hex");
            System.out.println("3. Oct to Dec");
            System.out.println("4. Dec to Oct");
            System.out.println("5. Bin to Dec");
            System.out.println("6. Dec to Bin");
            System.out.println("7. Bitwise AND");
            System.out.println("8. Bitwise OR");
            System.out.println("9. Bitwise XOR");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    hexToDec(scanner);
                    break;
                case 2:
                    decToHex(scanner);
                    break;
                case 3:
                    octToDec(scanner);
                    break;
                case 4:
                    decToOct(scanner);
                    break;
                case 5:
                    binToDec(scanner);
                    break;
                case 6:
                    decToBin(scanner);
                    break;
                case 7:
                    bitwiseAnd(scanner);
                    break;
                case 8:
                    bitwiseOr(scanner);
                    break;
                case 9:
                    bitwiseXor(scanner);
                    break;
                case 0:
                    System.out.println("Exiting the Programmer Converter. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }


    private static void hexToDec(Scanner scanner) {
        System.out.print("Enter a hexadecimal number: ");
        String hexString = scanner.nextLine();
        try {
            int decimal = Integer.parseInt(hexString, 16);
            System.out.println("Decimal: " + decimal);
        } catch (NumberFormatException e) {
            System.out.println("Invalid hexadecimal input.");
        }
    }

    private static void decToHex(Scanner scanner) {
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        String hexString = Integer.toHexString(decimal);
        System.out.println("Hexadecimal: " + hexString.toUpperCase());
    }
    private static void octToDec(Scanner scanner) {
        System.out.print("Enter an octal number: ");
        String octString = scanner.nextLine();
        try {
            int decimal = Integer.parseInt(octString, 8);
            System.out.println("Decimal: " + decimal);
        } catch (NumberFormatException e) {
            System.out.println("Invalid octal input.");
        }
    }
    private static void decToOct(Scanner scanner) {
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        String octString = Integer.toOctalString(decimal);
        System.out.println("Octal: " + octString);
    }
    private static void binToDec(Scanner scanner) {
        System.out.print("Enter a binary number: ");
        String binString = scanner.nextLine();
        try {
            int decimal = Integer.parseInt(binString, 2);
            System.out.println("Decimal: " + decimal);
        } catch (NumberFormatException e) {
            System.out.println("Invalid binary input.");
        }
    }
    private static void decToBin(Scanner scanner) {
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        String binString = Integer.toBinaryString(decimal);
        System.out.println("Binary: " + binString);
    }
    private static void bitwiseAnd(Scanner scanner) {
        System.out.print("Enter the first decimal number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second decimal number: ");
        int num2 = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        int result = num1 & num2;
        System.out.println("Bitwise AND Result: " + result);
    }
    private static void bitwiseOr(Scanner scanner) {
        System.out.print("Enter the first decimal number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second decimal number: ");
        int num2 = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        int result = num1 | num2;
        System.out.println("Bitwise OR Result: " + result);
    }
    private static void bitwiseXor(Scanner scanner) {
        System.out.print("Enter the first decimal number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second decimal number: ");
        int num2 = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        int result = num1 ^ num2;
        System.out.println("Bitwise XOR Result: " + result);
    }

}

