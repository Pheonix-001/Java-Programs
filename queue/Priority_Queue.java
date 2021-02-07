package queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Priority_Queue {

    public static void main(String[] args) {

        PriorityQueue<String> pq = new PriorityQueue<>();

        pq.add("Z");
        pq.add("B");
        pq.add("J");
        pq.add("C");
        pq.add("A");

        System.out.println(pq);
//        System.out.println(pq.peek());
//        System.out.println(pq.poll());
//        System.out.println(pq.peek());
//        System.out.println(pq.poll());
//        System.out.println(pq);


        Iterator itr = pq.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
