package DataStructure.LinkedList;

import java.util.*;
import java.util.LinkedList;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    class Node {

        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }

        Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    public void insertFirst(int val) {

        Node newNode = new Node(val);

        newNode.next = head;
        head = newNode;

        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void inserLast(int val){

        Node newNode = new Node(val);

        if(tail == null){
            insertFirst(val);
            return;
        }
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public void insert(int val, int index) {

        if(index == 0) {
            insertFirst(val);
            return;
        }

        if (index == size) {
            inserLast(val);
        }
        Node newNode = new Node(val);
        Node temp = head;
        for(int i = 1; i < index; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }
    
    public int deleteAtFirst() {
        int val = head.val;
         head = head.next;

         if(head == null){
             tail = null;
         }
         size--;
         return val;
    }

//    public void deleteLast() {
//
//        while()
//    }

    public void insertRecursion(int val, int index) {

        if (index == 0) {
            Node newNode = new Node(val);
            newNode.next = head;
            head = newNode;
            return;
        }

        helper(head, val, index, 0);
    }

    public void helper(Node head, int val, int index, int i) {




        if(index == 1){
            Node newNode = new Node(val);
            newNode.next = head.next;
            head.next = newNode;
            return;
        }
        helper(head.next, val, index, i + 1);
    }

    public void reverse() {

        Node temp = head;
        List<Node> list = new ArrayList<>();
        list.add(temp);
        while (temp.next != null) {
            temp = temp.next;
            list.add(temp);
        }

        System.out.println();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).val);
        }

        int start = 0;
        int end = list.size() - 1;
        Node third;
        while (start <= end) {
            third = list.get(start);
            list.set(start, list.get(end));
            list.set(end, third);
            start++;
            end--;
        }
        System.out.println("In reverse: ");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).val);
        }
        LinkedList<Node> linkedList = new LinkedList<>(list);

        System.out.println("LL: ");
        for (Node node : linkedList) {
            System.out.print(node.val + "->");
        }
    }

    public void display() {

        Node temp = head;

        while(temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.print("END");
    }
}
