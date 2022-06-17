import java.math.BigDecimal;

public class NumberFour {

    //4.Write a program to find the product of the squares of the first two hundred numbers.

    static BigDecimal productsOfSquares(){
        BigDecimal multiply1 = new BigDecimal("1");
        BigDecimal sum = new BigDecimal("1");
        int a;

        for(int i = 1; i <=200; i++){
            a = i;
            BigDecimal num =  BigDecimal.valueOf(a);
            multiply1 = num.multiply(num);
            sum = sum.multiply(multiply1);
            i++;
        }
        return sum;
    }

    public static void main(String[] args) {

        System.out.printf("%e%n", NumberFour.productsOfSquares());

    }
}
