package datastructures.hash;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class HashTable {
    private int size = 7;
    private Node[] dataMap;

    class Node {
        Node next;
        int value;
        String key;

        Node(String key, int value) {
            this.value = value;
            this.key = key;
        }
    }

    public HashTable() {
        dataMap = new Node[size];
    }

    public void printTable() {
        for(int i = 0; i < dataMap.length;i++) {
            System.out.print(i + ":");
            Node temp = dataMap[i];
            while(temp != null) {
                System.out.print(" {" + temp.key + "=" + temp.value + "}");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    private int hash(String key) { //only to be used in other methods here
        int hash = 0;
        char[] keyChars = key.toCharArray();
        for (int i = 0;i <keyChars.length;i++) {
            int asciiValue = keyChars[i];
            hash = (hash + asciiValue * 23) % dataMap.length; //23 is a prime number, leading to more reandom number. We use modulo (7) so it will be from 0 to 6, allowing us to always access our address space
        }
        return hash;
    }

    public void set(String key, int value) { // O(1)
        int index = hash(key);
        Node newNode = new Node(key, value);
        if(dataMap[index] == null) { //current index is empty
            dataMap[index] = newNode; //this Node now points to our newNode at 6.
        } else {
            Node temp = dataMap[index]; //each dataMap[index] is its own LinkedList
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode; // gets added to dataMap at correct spot
        }
    }

    public int get(String key) { // O(1)
        int index = hash(key);
        Node temp = dataMap[index];
        while(temp != null) {
            if(temp.key == key) return temp.value;
            temp = temp.next;
        }
        return 0;
    }

    public ArrayList keys() {
        ArrayList<String> allKeys = new ArrayList<>();
        for(int i = 0; i < dataMap.length;i++) {
            Node temp = dataMap[i];
            while(temp != null) {
                allKeys.add(temp.key);
                temp = temp.next;
            }
        }
        return allKeys;
    }
}
