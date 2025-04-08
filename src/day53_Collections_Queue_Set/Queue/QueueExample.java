package day53_Collections_Queue_Set.Queue;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        //dont jump the queue.----queue (sira) demektir.


        Queue<String> que = new LinkedList<>();
        que.add("Cemil");
        que.add("Ahmet");
        que.add("Mehmet");
        que.add("Beyza");

        System.out.println("que = " + que); //que = [Cemil, Ahmet, Mehmet, Beyza]

        //FIFO---> first in - first out

        String name = que.remove().toLowerCase().trim();

        System.out.println("name = " + name);
        System.out.println("que = " + que);  //que = [Ahmet, Mehmet, Beyza]

        //FIFO -first out- removes first element from the list

        name = que.poll();
        System.out.println("name = " + name);

        System.out.println("que = " + que); //que = [Mehmet, Beyza]


        // gets the first element in the order
        name = que.peek();     // listedeki cagirdigimiz elemani cagirir kullanmamiza izin verir ancak listeden silmez
        System.out.println("name = " + name);

        System.out.println("que = " + que); //que = [Mehmet, Beyza] lisede degisiklik yapmaz

        // Difference between poll and remove

        que.poll();
        System.out.println("que = " + que);
        que.poll();
        System.out.println("que = " + que);
        que.poll();
        System.out.println("que = " + que);

        try {
            que.remove();
        } catch (NoSuchElementException e) {
            System.out.println("Hopp! your list is empty");
        }

    }
}
