package day32_MultiDimensionalArrays;

public class C07_RaggedJagged {
    public static void main(String[] args) {

        int [][] numbers = new int[5][];


        numbers[0] = new int[]{2,5};
        numbers[1] = new int[]{12,58,98,322,33};
        numbers[2] = new int[]{2,5,1};
        numbers[3] = new int[]{2,5,11,22};
        numbers[4] = new int[]{2};

        // for i ile yazdirma

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.println(numbers[i][j]+" ");
            }
            System.out.println();
        }
    }
}
