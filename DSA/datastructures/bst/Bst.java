package datastructures.bst;

public class Bst {

    Node root; //not private because we want it to be visible in Main.java

    class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }

//        public Bst(int value) { one way to do it where it creates the first node
//            Node newNode = new Node(value);
//            root = newNode;
//        }

//        public Bst() { redundant and not needed as well. Root already points to null. SO YOU DON'T NEED CONSTRUCTOR
//            root = null;
//        }
    }

    public boolean insert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return true;
        }
        Node temp = root;
        while (true) {
            if (newNode.value == temp.value) return false;
            if (newNode.value < temp.value) {
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            } else {
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }

        public boolean contains() {

        }
    }


}
