public class NumberSix {

    //6. For each natural number between m and n print all divisors except for one and the number itself.
    //m and n are entered from the keyboard.

    public int m, n;

    public void initialization() {
        System.out.println("Enter point m:");
        m = Util.scannerNumber();
        System.out.println("Enter point n:");
        n = Util.scannerNumber();
        if (m > n) {
            initialization();
        }
    }

    public void allDivisors(int m, int n) {
        for (; m <= n; m++) {
            System.out.print("Number " + m + " dividers: ");
            for (int j = 2; j <= m; j++) {
                if (m != j) {
                    if (m % j == 0) {
                        System.out.print(j + " ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        NumberSix numberSix = new NumberSix();
        numberSix.initialization();
        numberSix.allDivisors(numberSix.m, numberSix.n);
    }
}
