package day53_Collections_Queue_Set.Queue;

import java.util.ArrayDeque;

public class ArrayDequeueExample {
    public static void main(String[] args) {

        ArrayDeque<Integer> arrayDequeue = new ArrayDeque<>();

        arrayDequeue.add(20);
        arrayDequeue.add(10);
        arrayDequeue.add(15);
        arrayDequeue.add(5);
        arrayDequeue.add(15);// duplicate izin verir

        System.out.println("arrayDequeue = " + arrayDequeue);

        //listedeki ilk elemani secebiliyoruz
        System.out.println("arrayDequeue.peekFirst() = " + arrayDequeue.peekFirst());
        System.out.println("arrayDequeue = " + arrayDequeue);

        //listedeki son elemani secebiliyoruz
        System.out.println("arrayDequeue.peekLast() = " + arrayDequeue.peekLast());
        System.out.println("arrayDequeue = " + arrayDequeue);
        System.out.println();

        //ilk elemani getirme ve silerek listeyi yenileme
        System.out.println("arrayDequeue.pollFirst() = " + arrayDequeue.pollFirst());
        System.out.println("arrayDequeue = " + arrayDequeue);

        //son elemani getirme ve silerek listeyi yenileme
        System.out.println("arrayDequeue.pollLast() = " + arrayDequeue.pollLast());
        System.out.println("arrayDequeue = " + arrayDequeue);

        System.out.println("------------------------------------");

        //ilk siraya eleman ekleme
        arrayDequeue.addFirst(30);
        System.out.println("arrayDequeue = " + arrayDequeue);

        //son siraya eleman ekleme
        arrayDequeue.addLast(26);
        System.out.println("arrayDequeue = " + arrayDequeue);

        //clears the list
        arrayDequeue.clear();
        System.out.println("arrayDequeue = " + arrayDequeue);

    }
}
