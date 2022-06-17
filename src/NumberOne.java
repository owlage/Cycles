public class NumberOne {

    //1.Write a program where the user enters any positive integer. And the program sums up all the numbers from
    //1 up to the number entered by the user.

    int UserEnteredNumber;

    public int sumOfNumbers(int enteredNumber){
        int count = 0;
        for(int i = 0; i <= enteredNumber; i++){
            count += i;
        }
        return count;
    }

    public static void main(String[] args) {

        NumberOne numberOne = new NumberOne();
        numberOne.UserEnteredNumber = Util.scannerNumber();

        System.out.println("The sum of all numbers from 1 to " + numberOne.UserEnteredNumber + " = " +
                numberOne.sumOfNumbers(numberOne.UserEnteredNumber) );

    }
}
