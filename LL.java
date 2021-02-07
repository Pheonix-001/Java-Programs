import java.util.Scanner;

public class LL {


    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static Node head = null;

    static void insertAtBeginning()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data: ");
        int da = sc.nextInt();
        Node t = new Node(da);
        if(head==null)
        {
            head = t;
        } else {
            Node temp = head;
            head = t;
            t.next = temp;
        }
    }
    static void insertAtEnd() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data: ");
        int da = sc.nextInt();
        Node t = new Node(da);
        if (head == null) {
            head = t;
        } else {
            Node temp = head;

            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=t;
        }

    }
    static void display()
    {
        if(head==null)
            System.out.println("lis is empty");
        else
        {
            Node t=head;
            while(t!=null)
            {
                System.out.println(" "+t.data);
                t=t.next;
            }
        }
    }
   static void  length()
  {
      int l=0;
      Node curr=head;
      if(head==null)
          System.out.println("list is empty");
      else {
          while (curr != null) {
              l++;
              curr = curr.next;
          }
          System.out.println("number of nodes :"+l);
      }

  }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice;
        boolean i=true;
        while(i)
        {
            System.out.println("1.insert node at beginning");
            System.out.println("2.display ");
            System.out.println("3.insert at end");
            System.out.println("4.find number of nodes:");
            System.out.println("7.exit");
            System.out.println("enter your choice :");
            choice= sc.nextInt();
            switch (choice)
            {
                case 1:
                    insertAtBeginning();break;
                case 2:
                    display();break;
                case 3:
                    insertAtEnd();break;
                case 4:
                    length();break;
                case 7:
                    i=false;break;
            }
        }
    }
}
