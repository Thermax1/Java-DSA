# .equals vs == in Java

    public class EqualsTutorial {
        public static void main(String[] args) {


            String string1 = new String("hello")
            String string2 = new String("hello")

            if (int1 == int2) {
                System.out.println("Equal")
            }
            else {
                System.out.println("Not equal")
            }
        }
    }

- The strings will NOT be equal if we use `==`

- Java compares the memory location when using `==`
    - New objects get different locations, so they're not equal
    - It worked for the primitive int, float, etc, BECAUSE they refer to the actual VALUE

## What about the object types AKA types that AREN'T primitive

- We use the `.equals(other string here)`
    - `string1.equals(string2)`
    - compares the content of the strings, char by char

- For custom objects (classes like Dog), you want to create your own equals method
    - `public boolean equals(Object obj)`

- String literals can use `==` to save memory, unless you create a `new String` 