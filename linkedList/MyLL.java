package linkedList;

public class MyLL {

    Node head;

    void add(int data) {
        Node addData = new Node(data);

        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = addData;
    }




    static class Node{
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }

    }

}
