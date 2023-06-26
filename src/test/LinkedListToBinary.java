package test;

public class LinkedListToBinary {

    public static void main(String args[]) {
        LinkedListEx1 li= new LinkedListEx1();

//        li.head = new LinkedListEx.Node(1);
//        li.head.next = new LinkedListEx.Node(1);
//        li.head.next.next = new LinkedListEx.Node(0);
//        li.head.next.next.next = new LinkedListEx.Node(1);

        int num= li.head.data;
        while(li.head.next!=null) {
       //   num=num*2+li.head.next.data;
            num=(num<<1)|li.head.next.data;
         li.head=li.head.next;
        }
System.out.println(num);
    }
}

class LinkedListEx1 {
    Node head;
     static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data= data;
            next = null;
        }
    }
}

