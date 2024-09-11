package DataStructure;


import DataStructure.LinkedList.LL;
import DataStructure.LinkedList.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
//
//        linkedList.insertAtStart(12);
//        linkedList.insertAtStart(123);
//        linkedList.insertAtStart(14);
//        linkedList.insertAtStart(23);
//        linkedList.insertAtEnd(100);
//        linkedList.display();
//        System.out.println("");
//        System.out.println(linkedList.getLength());

//        System.out.println(linkedList.findMiddleNode());

        LL ll = new LL();

        ll.insertFirst(5);
        ll.insertFirst(4);
        ll.insertFirst(3);
        ll.insertFirst(2);
        ll.insertFirst(1);

//        ll.insertRecursion(100,0);
//        ll.inserLast(99);

//        ll.insert(1000, 3);
//        System.out.println(ll.deleteAtFirst());
        ll.display();
        System.out.println();
        ll.reverse();
    }
}
