import java.util.ArrayList;

public class NumberSeven {

    //7.Two numbers are given. Determine the digits included in the record of both the first and second numbers.

    public int numOne, numTwo;
    public ArrayList<Integer> array = new ArrayList<Integer>();
    public ArrayList<Integer> array2 = new ArrayList<Integer>();

    public NumberSeven() {
        System.out.println("Enter two numbers through enter:");
        numOne = Util.scannerNumber();
        numTwo = Util.scannerNumber();
    }

    public void dividingNumberIntoDigits(int number, ArrayList arrayList){
        int i = 0;
        while (number > 0) {
            arrayList.add(i, number % 10);
            number /= 10;
            i++;
        }
    }

    public void definitionOfNumbers (ArrayList arrayList1, ArrayList arrayList2){
        for (int x = arrayList1.size() - 1; x >= 0; x--) {
            for (int y = arrayList2.size() - 1; y >= 0; y--) {
                if (arrayList1.get(x) == arrayList2.get(y)) {
                    System.out.print(arrayList1.get(x) + ";");
                    arrayList1.remove(x);
                    arrayList2.remove(y);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {

        NumberSeven numberSeven = new NumberSeven();
        numberSeven.dividingNumberIntoDigits(numberSeven.numOne, numberSeven.array);
        numberSeven.dividingNumberIntoDigits(numberSeven.numTwo, numberSeven.array2);
        numberSeven.definitionOfNumbers(numberSeven.array, numberSeven.array2);


    }
}
