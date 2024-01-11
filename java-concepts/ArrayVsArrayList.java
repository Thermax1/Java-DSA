import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsArrayList {

    public static void main(String[] args) {
        //How to initialize arrays
        // Array sizes never change once created
        // String[] friendsArray = new String[4];

        // Another way to initialize array with values.
        String[] friendsArray = {"John", "Chris", "Eric", "Luke"};

        //Initialize ArrayList
        // diamond operator on right is empty these days
        // ArrayLists grow and shrink as you go! They're dynamic
        // ArrayList<String> friendsArrayList = new ArrayList<>();
        
        // Another way to initialize ArrayList with values
        ArrayList<String> friendsArrayList = new ArrayList<>(Arrays.asList("John", "Chris", "Eric", "Luke"));

        // Arrays can hold primitives or Objects
        // ArrayList can ONLY hold objects, but support wrapper types for primitives like Integer, Character, etc.

        System.out.println(friendsArray[1]);
        // get method in ArrayList is like asking for index in regular array
        System.out.println(friendsArrayList.get(1));

        // How to get the size

        System.out.println(friendsArray.length);
        System.out.println(friendsArrayList.size());

        // Add element to end of arrays

        // 1. Arrays can't LOL

        // 2. Array Lists

        friendsArrayList.add("Anthony");
        System.out.println(friendsArrayList.get(4));

        // Change element inside

        System.out.println(friendsArray[0]);
        friendsArray[0] = "Carl";
        System.out.println(friendsArray[0]);

        System.out.println(friendsArrayList.get(0));
        friendsArrayList.set(0, "Carl");
        System.out.println(friendsArrayList.get(0));

        // Remove element

        // Arrays still can't lmao

        // ArrayLists can do it via index or Object if you want

        friendsArrayList.remove("Carl");
        System.out.println(friendsArrayList.get(0)); //Chris now

        // How to print

        System.out.println(friendsArray); // Java gives memory address

        // must use for loop otherwise

        for (String friends: friendsArray) {
            System.out.println(friends);
        }
        System.out.println(friendsArrayList); // prints out the arraylist values! Uses the toString method by default


    }
}