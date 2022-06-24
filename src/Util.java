import java.util.Scanner;

public class Util {

    static private int numOne;
    static private double numDoubOne;

    public static int scannerNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number greater than zero");
        if (scanner.hasNextInt()) {
            numOne = scanner.nextInt();
            if (numOne < 1) {
                System.out.println("Please enter a number greater than zero");
                scannerNumber();
            }
        } else {
            System.out.println("Please enter a number greater than zero or you have entered a number greater than 2147483647");
            scannerNumber();
        }
        scanner.close();
        return numOne;
    }

    public static double scannerDoubleNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        if (scanner.hasNextDouble()) {
            numDoubOne = scanner.nextDouble();
        } else {
            System.out.println("Please enter a number greater than zero or you have entered a number greater than 2147483647");
            scannerDoubleNumber();
        }
        scanner.close();
        return numDoubOne;
    }
}
