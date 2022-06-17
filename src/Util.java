import java.util.Scanner;

public class Util {

    static Scanner scanner = new Scanner(System.in);
    static private int numOne;
    static private double numDoubOne;

    public static int scannerNumber() {
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
        return numOne;
    }

    public static double scannerDoubleNumber() {
        System.out.println("Please enter a number");
        if (scanner.hasNextDouble()) {
            numDoubOne = scanner.nextDouble();
        } else {
            System.out.println("Please enter a number greater than zero or you have entered a number greater than 2147483647");
            scannerDoubleNumber();
        }
        return numDoubOne;
    }
}
