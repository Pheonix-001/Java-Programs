package stack;

import org.w3c.dom.ls.LSOutput;

import java.util.EmptyStackException;
import java.util.Stack;

public class Test {

    public static void main(String[] args) {

        Stack<Integer> s1 = new Stack<>();

        for (int i = 0; i < 10; i++) {

            s1.push(i);
        }
        System.out.println(s1);

        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1);

        System.out.println(s1.peek());
        System.out.println(s1.peek());
        System.out.println(s1.peek());
        System.out.println(s1);

        s1.add(0, 34);
        System.out.println(s1);

        s1.push(23);
        System.out.println(s1);

        // it returns index if found else -1
        System.out.println(s1.search(34));
        System.out.println(s1.search(11));

        System.out.println(s1.empty());

        s1.clear();
        System.out.println(s1);


        try{
            s1.pop();
        }
        catch (EmptyStackException e) {
            System.out.println("Stack is empty");
            System.out.println(e);
        }

    }
}
