package vector;

import java.util.ArrayList;
import java.util.Vector;

public class VectorMethods {

    public static void main(String[] args) {

        // creating vector with initial capacity and increment num when capacity goes out
        Vector<String> v = new Vector<>(5, 3);

        v.add("jayant");
        v.add("aman");
        v.add("rohit");
        v.add("akash");
        v.add("rahul");
        v.add("shivam");

        System.out.println("size of v vector " + v.size());
        System.out.println("capacity of v vector " + v.capacity());



        // By default vector initial capacity = 10, and capacity increment = 10
        Vector<String> v2 = new Vector<>();

        v2.add("jayant");
        v2.add("aman");
        v2.add("rohit");
        v2.add("akash");
        v2.add("rahul");
        v2.add("shivam");
        v2.add("ajay");
        v2.add("vivek");
        v2.add("ram");
        v2.add("shyam");
        v2.add("anuj");

        System.out.println("size of v2 vector " + v2.size());
        System.out.println("capacity of v2 vector " + v2.capacity());



        // adding v2 elements in v vector
        v.addAll(v2);

        System.out.println(v);
        System.out.println(v.size());
        ArrayList al = new ArrayList();
        al.addAll(v);
        System.out.println(al);

        System.out.println(v.getClass().getName());
        System.out.println(al.getClass().getName());


        // rest all methods of ArrayList class ..........................




    }
}
