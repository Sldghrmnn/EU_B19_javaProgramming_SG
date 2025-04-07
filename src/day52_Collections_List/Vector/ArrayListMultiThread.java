package day52_Collections_List.Vector;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ArrayListMultiThread {
    public static void main(String[] args) throws InterruptedException {

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> vector = new Vector<>();

        arrayList.add(123);
        arrayList.add(23);
        arrayList.add(121456);
        System.out.println("arrayList = " + arrayList);

        System.out.println();
        vector.add(6352746);
        vector.add(11324);
        vector.add(12);
        System.out.println("vector = " + vector);


        //Multi-Thread element adding to Arraylist and Vector

        List<Integer> multiThreadArrayList = new ArrayList<>();
        List<Integer> multiThreadVector = new Vector<>();

        //Two thread created t1 and t2
        // Each thread adds element to same Arraylist

        Thread t1 = new Thread(()-> {
            int counter = 0;
            System.out.println("Thread -1");
            for (int i = 0; i < 1_000_000; i++) {
                multiThreadArrayList.add(i);
                counter++;
            }
            System.out.println("Number of element that added Thread 1 :"+counter);
        });

        Thread t2 = new Thread(()-> {
            int counter = 0;
            System.out.println("Thread -2");
            for (int i = 0; i < 1_000_000; i++) {
                multiThreadArrayList.add(i);
                counter++;
            }
            System.out.println("Number of element that added Thread 2 :"+counter);
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("multiThreadArrayList.size() = " + multiThreadArrayList.size());

         //Two thread created t1 and t2
        // Each thread adds element to same Vactor

        System.out.println("Vector multi-Thread");

        t1 = new Thread(() ->{
            int counter = 0;
            for (int i = 0; i < 1_000_000; i++) {
                multiThreadVector.add(i);
                counter++;
            }
            System.out.println("Vector Thread -1 number of adding "+counter);
        });

        t2 = new Thread(() ->{
            int counter = 0;
            for (int i = 0; i < 1_000_000; i++) {
                multiThreadVector.add(i);
                counter++;
            }
            System.out.println("Vector Thread -2 number of adding "+counter);
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("multiThreadVector.size() = " + multiThreadVector.size());


    }
}
