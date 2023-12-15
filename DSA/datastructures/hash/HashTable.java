package datastructures.hash;

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
            System.out.println(i + ":");
            Node temp = dataMap[i];
            while(temp != null) {
                System.out.println(" {" + temp.key + "= " + temp.value + "}");
                temp = temp.next;
            }
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
}
