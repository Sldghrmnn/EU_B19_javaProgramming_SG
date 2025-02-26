package day32_MultiDimensionalArrays;

public class C05_Example2 {
    public static void main(String[] args) {

        int [][]numbers = new int[3][3];

        for (int r = 0; r < numbers.length; r++) {
            for (int c = 0; c < numbers[r].length; c++) {
                numbers[r][c] = r+c;
            }
        }
        C03_TwoDimArrayPrintMethods.forIndexPrint(numbers);
    }
}
