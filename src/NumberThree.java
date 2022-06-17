public class NumberThree {

    //3.Find the sum of the squares of the first hundred numbers.

    static public long sumOfSquares(){
        long sum = 0;
        for (int i = 1; i <= 100; i++){
            sum = (long) (Math.pow( i, 2 ) + sum);
        }
        return sum;
    }

    public static void main(String[] args) {

        System.out.println("Sum of squares = " + NumberThree.sumOfSquares());

    }
}
