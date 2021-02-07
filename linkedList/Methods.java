package linkedList;

import javax.sound.sampled.Line;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Methods {

    public static void main(String[] args) {

//        LinkedList<String> ll = new LinkedList<>();
//
//        // To add element in LinkedList
//        ll.add("Java");
//        ll.add("hello");
//        ll.add("world");
//        // Add on given index
//        ll.add(0, "love");
//        ll.add(0, "I");
//
//        System.out.println(ll.toString());
//
//        // Create a iterator object to iterate LinkedList
//        Iterator<String> itr = ll.iterator();
//
//        // Iterate iterator object
//        while(itr.hasNext()) {
//            System.out.println(itr.next());
//        }
//
//        // remove index
//        ll.remove(3);
//        // remove LinkedList element
//        ll.remove("hello");
//        System.out.println(ll.toString());
//
//        LinkedList<String> names = new LinkedList<>();
//
//        names.add("Ravi");
//        names.add("subham");
//        names.add("vijay");
//        names.add("aman");
//
//        System.out.println(names.toString());
//        // Add all element that are exist in names list
//        ll.addAll(names);
//        System.out.println(ll.toString());
//
//        // Remove add names existence element from ll list
//        ll.removeAll(names);
//        System.out.println(ll.toString());
//
//        ll.removeLast();
//        System.out.println(ll.toString());
//
//        ll.removeFirst();
//        System.out.println(ll.toString());
//
//        ll.set(1, "Python");
//        System.out.println(ll.toString());
//
//        ll.clear();
//        System.out.println(ll.toString());


        LinkedList<String> names = new LinkedList<>();

        names.add("suraj");
        names.add("abhi");
        names.add("shivam");
        names.add("aman");
        names.add("vivek");
        names.add("suman");

        listIterator(names);
//        System.out.println("After reversing a list : ");
//        reverseList(names);


        Collections.sort(names);
        System.out.println("After sorting list : ");
        listIterator(names);






    }


    static void listIterator(LinkedList<String> l) {

        Iterator itr = l.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    static void reverseList(LinkedList<String> l) {

        Iterator i = l.descendingIterator();

        while(i.hasNext()) {
            System.out.println(i.next());
        }

    }
}

