# Main Method

## Why do we write it that way?

    public class MainMethodExplanation {
        public static void main (String[] args) {}
    }

- The JRE has to call the class `MainMethodExplanation`
    - `MainMethodExplanation.main(args);`
        - Like that ^^^


## Why is it `public`

- It is `public` because the JRE has to be able to call it. `private` or `protected` would block the JRE from calling it.

## Why is it `static`

- First, the `static` method refers to calling a class without needing an instance of that class.
    - The JRE doesn't create an instance of `main`, it just runs it on the class
    - It will not do `MainMethodExplanation explain = new Main blah blah`

## Why is it `void`

- `void` refers to your return type. The `main` method returns nothing

## Why is it called `main`

- It just is, LOL

## What is the String array called args? AKA `String[] args`

- You can add `args` as needed, depending on the program
- Example: `System.out.println(args[0])`
- Will take the argument you pass via command line or if you specify in your IDE