import java.util.Scanner;

public class LL2 {

    static Scanner sc = new Scanner((System.in));
    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }

    }


    static void addAtBeginning() {
        System.out.println("Enter data to add at beginning");
        int inputData = sc.nextInt();
        Node toInsert = new Node(inputData);

        if(head == null){
            head = toInsert;
        } else {
            Node temp = head;
            head = toInsert;
            toInsert.next = temp;
        }
    }


    static void addAtEnd() {
        System.out.println("Enter data to add at end");
        int d = sc.nextInt();
        Node toInsert = new Node(d);

        if(head == null) {
            head = toInsert;
        } else {
            Node t = head;
            while(t.next != null) {
                t = t.next;
            }
            t.next = toInsert;
        }
    }


    static void addAtIndex() {
        System.out.println("Enter location:- ");
        int index = sc.nextInt();
        System.out.println("Enter data to add at " + index + "'nd index");
        int data = sc.nextInt();

        Node newNode = new Node(data);
        if(index > getLength()) {
            System.out.println("Location not found.");
        } else {
            int count = 0;
            Node temp = head;
            for(int i = 1; i < index - 1; i++) {
                temp = temp.next;
                break;
            }
            Node t2 = temp.next;
            temp.next = newNode;
            newNode.next = t2;
        }
    }


    static void deleteAtPos() {
        System.out.println("Enter position(0 for head) :- ");
        int pos = sc.nextInt();
        Node temp = head;
        if(pos == 0) {
            head = head.next;
        } else {
            for(int i = 0; i < pos-1; i++) {
                temp = temp.next;
            }
            Node t = temp.next;
            temp.next = t.next;
            t = null;
        }
    }

    static Node goToLast() {
        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        return temp;
    }


    static void reverse() {
        Node temp = head;
        Node prev = null;
        Node curr = temp;
        Node next = null;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        temp = prev;
        while(prev != null) {
            System.out.println(prev.data + " ");
            prev = prev.next;
        }

    }




    static void showList() {
        if(head == null) {
            System.out.println("List is empty");
        } else {
            Node t = head;
            while(t != null) {
                System.out.print(t.data + " ");
                t = t.next;
            }
            System.out.println();
        }
    }

    static int getLength() {
        int length = 0;
        if(head == null) {
            System.out.println("Length : 0");
        } else {
            Node t = head;
            while(t != null) {
                length++;
                t = t.next;
            }
            System.out.println("Length : " + length);
        }
        return length;
    }

    public static void main(String[] args) {

        int choice;
        boolean i = true;


        while (i) {
            System.out.println("\n//*****************************//\n");
            System.out.println("1. for add at beginning");
            System.out.println("2. for add at end");
            System.out.println("3. for add at index");
            System.out.println("4. for display list");
            System.out.println("5. fot get Length");
            System.out.println("6. Delete at specific position");
            System.out.println("7. Delete from front");
            System.out.println("8. Delete from end");
            System.out.println("9. Reverse the list");
            System.out.println("10. for exit");
            System.out.println("\n//*****************************//\n");
            System.out.println("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: addAtBeginning(); break;
                case 2: addAtEnd(); break;
                case 3: addAtIndex(); break;
                case 4: showList(); break;
                case 5: getLength(); break;
                case 6: deleteAtPos(); break;
                case 9: reverse(); break;
                case 10: i = false;
            }
        }


    }
}
