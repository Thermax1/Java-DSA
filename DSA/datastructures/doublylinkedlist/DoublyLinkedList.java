package datastructures.doublylinkedlist;

public class DoublyLinkedList {

    private Node head;
    private Node tail; // can point to a node now, so can head
    private int length;

    class Node { //inner class or nested class. This is so if we NEED TO IN THE FUTURE make this its own class, we are able to do so. Will do for other sections as well.
        int value;
        Node next; // this variable next of type Node can point to a Node
        Node prev;

        Node(int value) { //this a constructor of class Node. It is called when we create a Node object
            this.value = value; //this.value is the int value from class Node. The value on the RIGHT side of the = sign is from whatever value is put in
        }
    }

    public DoublyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        length++;
    }

    public Node removeLast() {
        if(length == 0) return null;
        Node temp = tail;
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            tail = temp.prev;
            temp.prev = null;
            tail.next = null;
        }
        length--;
        return temp;

    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if(length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst() {
        if(length == 0) return null;
        Node temp = head;
        if(length == 1) {
            head = null;
            tail = null;
        } else {
            head = temp.next;
            temp.next = null;
            head.prev = null;
        }
        length--;
        return temp;
    }

    public Node get(int index) {
        if(index < 0 || index >= length) return null;
        Node temp = head;
        // if index is in first half
        if(index < length / 2){
            for(int i = 0; i < index;i++) {
                temp = temp.next;
            }
        } else { //if index is in second half of double linked list
            temp = tail;
            for(int i = length - 1;i > index; i--) {
                temp = temp.prev;
            }
        }
        return temp;
    }

    public boolean set(int index, int value) {
        Node temp = get(index);
        if(temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value) {
        if(index < 0 || index > length) return false;
        if(index == 0) {
            prepend(value);
            return true;
        }
        if(index == length) {
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node before = get(index-1);
        Node after = before.next;
        newNode.prev = before;
        newNode.next = after;
        before.next = newNode;
        after.prev = newNode;
        length++;
        return true;
    }

    public Node remove(int index) {
        if(index < 0 || index >= length) return null;
        if(index == 0) return removeFirst();
        if(index == length - 1) return removeLast();
        Node temp = get(index);
        temp.next.prev = temp.prev;
        temp.prev.next = temp.next;
        temp.next = null;
        temp.prev = null;
        length--;
        return temp;
    }

}
