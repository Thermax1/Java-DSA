package datastructures.hash;

public class Main {

    public static void main(String[] args) {
        HashTable myHash = new HashTable();

        myHash.set("nails",100);
        myHash.set("tile",50);
        myHash.set("lumber",80);

        myHash.set("bolts",200);
        myHash.set("screws",200);

        myHash.set("glasses", 20);

//        System.out.println(myHash.get("bolts"));
//        System.out.println(myHash.get("tiles")); //will return 0

        System.out.println(myHash.keys());



    }

}
