public class NumberTwo {

    //2. Calculate the values [а,b] of the function on the segment [a, b] with step h:

    public double a, b, h;

    public NumberTwo() {
        System.out.println("Enter the length of the segment");
        System.out.println("Enter start point:");
        a = Util.scannerDoubleNumber();
        System.out.println("Enter end point:");
        b = Util.scannerDoubleNumber();
        System.out.println("Enter step:");
        h = Util.scannerDoubleNumber();
    }

    public void functionValues(double a, double b, double h){
        double y;
        for (; a <= b; a += h) {
            if (a > 2) {
                y = a;
            } else {
                y = a * (-1);
            }
            System.out.println("At х = " + a + " у = " + y);
        }
    }

    public static void main(String[] args) {

        NumberTwo numberTwo = new NumberTwo();

        numberTwo.functionValues(numberTwo.a, numberTwo.b, numberTwo.h);
    }
}
