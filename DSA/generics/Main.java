package generics;

/*
Generics: Enable types (classes and interfaces) to be parameters when defining:
1. Classes, Interfaces, and Methods
2. A benefit is to eliminate the need to create multiple version of methods or classes for various data types
3. Use 1 version for ALL reference data types
*/
public class Main {

    public static void main(String[] args) {

        // example of reference types using Wrapper class
        Integer[] intArray = {1,2,3,4,5};
        Double[] doubleArray = {5.5,4.4,3.3,2.2,1.1};
        Character[] charArray = {'H','E','L','L','O'};
        String[] stringArray = {"B","Y","E"};

        //displayArray(intArray); Only for Integer[]
    }

    // Normally, you'd have to create methods for EACH one. Inefficient. Example below cause doing all  4 is redundant

//    public static void displayArray(Integer[] array) {
//        for(Integer x: array) {
//            System.out.println(x+" ");
//        }
//    }


}
