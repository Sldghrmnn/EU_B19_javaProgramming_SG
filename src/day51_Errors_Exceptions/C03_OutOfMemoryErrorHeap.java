package day51_Errors_Exceptions;

public class C03_OutOfMemoryErrorHeap {
    public static void main(String[] args) {

        System.out.println("I declared a big size array of int.");

        int[] bigArray = new int[10];
       // int[] bigArray = new int[100];
        //int[] bigArray = new int[1000];
       // int[] bigArray = new int[10000];
       // int[] bigArray = new int[100000];
       // int[] bigArray = new int[1_000_000_000];

        try {
            bigArray = new int[1_500_000_000];
        }catch (OutOfMemoryError e){
            System.out.println("Hata olustu :"+e.getMessage());
            bigArray = new int[1_000_000_000];
        }
        System.out.println("bigArray.length = " + bigArray.length);

        System.out.println("Program calismaya devam ediyor...");
    }
}
