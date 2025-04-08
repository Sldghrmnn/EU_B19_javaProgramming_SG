package day53_Collections_Queue_Set.Queue;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {

        PriorityQueue priority = new PriorityQueue();
        priority.add(12);
        priority.add(15);
        priority.add(5);
        priority.add(6);
        priority.add(25);
        priority.add(35);
        priority.add(35);// duplicate veri kabul eder
        priority.add(600);
        priority.add(46);
        priority.add(345);
        priority.add(123);
        priority.add(-12);

        System.out.println("priority = " + priority);

        //dogal siralama kucukten buyuge sekilde datalari bize verir

        System.out.println(priority.peek()); //cagirip kullanir, listede tutar
        System.out.println(priority.poll()); // cagirip kullanir,listeden de cikarir

        System.out.println(priority);

        System.out.println(priority.peek()); //cagirip kullanir, listede tutar
        System.out.println(priority.poll()); // cagirip kullanir,listeden de cikarir

        System.out.println(priority);

        System.out.println(priority.peek());
        System.out.println(priority.poll());

        System.out.println(priority);

        while (!priority.isEmpty()){
            System.out.println(priority.poll());

            // dogal siralama alfabetik olarak datalari bize verir

            PriorityQueue<String> strs = new PriorityQueue<>();
            strs.add("Zab");
            strs.add("Aab");
            strs.add("Bab");
            strs.add("aab");
            strs.add("Aaa");
            strs.add("Aba");
            strs.add("Aab");//duplicate kabul eder

            System.out.println();
            System.out.println(strs.poll());
            System.out.println(strs.poll());
            System.out.println(strs.poll());
            System.out.println(strs.poll());
            System.out.println(strs.poll());
            System.out.println(strs.poll());
            System.out.println(strs.poll());
        }
    }
}
