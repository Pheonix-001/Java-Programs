package Deque;

import java.util.*;

public class Array_Deque {

    public static void main(String[] args) {

        Deque<String> dq = new ArrayDeque<>();

        dq.offer("A");
        dq.offer("B");
        dq.offer("C");

        System.out.println(dq);

        dq.push("D");
        dq.push("E");

        System.out.println(dq);

        dq.addFirst("F");
        dq.addFirst("G");

        System.out.println(dq);

        dq.addLast("H");
        dq.addLast("I");

        System.out.println(dq);

        System.out.println(dq.pop());
        System.out.println(dq.pop());

        System.out.println(dq.element());

        System.out.println(dq.poll());
        System.out.println(dq.poll());

        System.out.println(dq);

    }
}
