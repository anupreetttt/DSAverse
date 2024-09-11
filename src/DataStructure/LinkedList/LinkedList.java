package DataStructure.LinkedList;

public class LinkedList {

    private Node head;
    private Node tail;
    private int size;

    private class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
    public LinkedList() {
        this.size = size;
    }

    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
    }

    public int getLength() {
        Node tempNode = head;
        int count = 0;

        if (tempNode == null) {
            System.out.println("No list available");
            return -1;
        }
        while (tempNode != null){
            tempNode = tempNode.next;
            count++;
        }
//        System.out.println(count);
        return count;
    }

    public int findMiddleNode(){
        int middle = getLength()/2;
        Node temp = head;

//        if (temp == null) {
//            System.out.println("No list available");
//            return -1;
//        }

        int i = 0;
        while (i < middle ){
            temp = temp.next;
            i++;
        }
        return temp.value;
    }
    public void insertAtIndex(int val, int index){
        if (index == 0) {
            insertAtStart(val);
            return;
        }
        if (index == size) {
            insertAtEnd(val);
        }

        Node temp = head;
        for (int i = 1; i <index; i++) {

        }
    }
    public void insertAtStart(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;

        if (tail == null) {
            tail = head;
        }

        size += 1;
    }

    public void insertAtEnd(int val) {
        if (tail == null) {
            insertAtStart(val);
            return;
        }
        Node newNode = new Node(val);
        tail.next = newNode;
        tail = newNode;
    }

}
