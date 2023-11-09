package datastructures.linkedlist;

public class LinkedList {
    private Node head;
    private Node tail; // can point to a node now, so can head
    private int length;

    class Node { //inner class or nested class. This is so if we NEED TO IN THE FUTURE make this its own class, we are able to do so. Will do for other sections as well.
        int value;
        Node next; // this variable next of type Node can point to a Node

        Node(int value) { //this a constructor of class Node. It is called when we create a Node object
            this.value = value; //this.value is the int value from class Node. The value on the RIGHT side of the = sign is from whatever value is put in
        }
    }

    public LinkedList(int value) { //constructor that gets called when LinkedList is called
        Node newNode = new Node(value); //new keyword allows us to run CONSTRUCTOR of the Node class
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        System.out.println("Head: " + head.value);
    }

    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
            tail = newNode;
        } else {
            Node temp = head;
            while(temp.next != null)
                temp = temp.next;
            temp.next = newNode;
        }
        length += 1;
    }

    public Node removeLast() {
        if(length == 0)
            return null;
        Node temp = head;
        Node pre = head;
        while(temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        pre.next = null;
        length -= 1;
        if(length == 0){
            head = null;
            tail = null;
        }
        return temp;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length += 1;
    }

    public Node removeFirst() {
        if(length == 0)
            return null;
        Node temp = head;
        head = head.next;
        temp.next = null;
        length -= 1;
        if(length == 0){
            head = null;
            tail = null;
        }
        return temp;
    }

    public Node get(int index) {
        if(index < 0 || index >= length)
            return null;
        Node temp = head;
        for(int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public boolean set(int index, int value) {
        Node temp = get(index); //checks if out of bounds for you
        if (temp != null) { //will only run if in bounds
            temp.value = value;
            return true;
        }
        return false; //out of bounds from the start
    }

    public boolean insert(int index, int value) {
        if (index < 0 || index > length) {
            return false;
        }

        if (index == 0) {
            prepend(value);
            return true;
        } else if (index == length) {
            append(value);
            return true;
        } else {
            Node newNode = new Node(value);
            Node pre = get(index - 1);
            Node temp = pre.next;
            pre.next = newNode;
            newNode.next = temp;
            length++;
            return true;
        }
    }

    public Node remove(int index) {
        if(index < 0 || index >= length) return null;
        else if(index == 0) return removeFirst();
        else if(index == length - 1) return removeLast();
        else {
            Node pre = get(index - 1);
            Node temp = pre.next;
            pre.next = temp.next;
            temp.next = null;
            length--;
            return temp;
        }
    }

    public void reverse() {
        Node temp = head;
        head = tail;
        tail = temp;
        Node before = null;
        Node after = temp.next;
        while(temp != null) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }


}
