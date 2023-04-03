import java.awt.*;

import java.util.Arrays;

// This class can be called anything
public class Main{


    // private means only things in this class can access this
    private static int add(int numberOne, int numberTwo){
        return numberOne + numberTwo;
    } 



    // Main entry point of Java Program but this name is important
    public static void main(String args[]){
        /*
         * Primitive Types
         */
        System.out.println("## Primitive Types ##");
        // Allow us to store simple values
        int number1 = 20;
        int number2 = 20;
        // System.out.println(number1 + number2)
        int result = number1 + number2;
        System.out.println(result);


        // Naming convention -> Camel case
        // Can also use float
        double pi = 3.14;
        boolean isAdult = true;
        char a = 'A';

        // Can use underscores for numeric literals for readbility 
        int amount = 1_000_000_008;
        // This will still print as normal
        System.out.println(amount);
        // Also works the same for floating points and doubles
        double amount2 = 1_008.31;
        System.out.println(amount2);


        /*
         * Arthimetic Operation 
         */
        System.out.println("\n## Arithmetic Operators ##");
        int numberOne = 10;
        int numberTwo = 3;
        System.out.println(numberOne + numberTwo);
        System.out.println(numberOne - numberTwo);
        System.out.println(numberOne * numberTwo);
        System.out.println(numberOne / numberTwo);
        System.out.println(numberOne % numberTwo);
        // BIMDAS applies
        System.out.println((2+2)*(3/1)*4);

        /*
         * Icrement and Decrement Operators
         */
        System.out.println("\n## Increment & Decrement ##");
        int numOne = 0;
        // This will return 0 and then increment
        System.out.println(numOne++);
        // The incremented value
        System.out.println(numOne);

        int numTwo = 0;
        // Increment and then return
        System.out.println(++numTwo);
        // Same val as above
        System.out.println(numTwo);

        int numThree = 1;
        // Return 1 and then decrement
         System.out.println(numThree--);
         // The decremented value
         System.out.println(numThree);
 
         int numFour = 1;
         // Increment and then return
         System.out.println(--numTwo);
         // Same val as above
         System.out.println(numTwo);

        /*
         * Comparison Operators
         */
        System.out.println("\n## Comparison Operators##");
        System.out.println(10<10);
        System.out.println(10<=10);
        System.out.println(10>10);
        System.out.println(10>=10);
        System.out.println(10==10);
        System.out.println(10!=10);

        /*
         * Shorthand Reassignment
         */
        System.out.println("\n## Shorthand Assignment ##");
        int numberFive = 2;
        numberFive += 5;
        System.out.println(numberFive);
        // Can also use other mathmetical operators
        int numberSix = 10;
        numberSix %= numberFive;
        System.out.println(numberSix);

        /*
         * Strings
         */
        System.out.println("\n## Strings ##");
        String name = "Nisarg";
        String code = "1";
        String brand = name + " " + code;
        System.out.println(brand);
        System.out.println(brand.toUpperCase());
        System.out.println(brand.toLowerCase());
        System.out.println(brand.substring(0,6));
        System.out.println(" ".isEmpty());
        System.out.println("".isEmpty());
        System.out.println("".isBlank());
        System.out.println("  a  ".trim());

        /*
         * Reference Types and Objects
         */
        System.out.println("\n## Reference Types and Objects ##");
        // Used for storing complex values e.g., coordinates
        Point pointA = new Point(10,10);
        System.out.println("pointA = " + pointA);
        // Comes with these methods
        pointA.move(10,12);
        System.out.println("pointA = " + pointA);
        // Difference between primitives and reference types is that value of primitive are stored in the stack but for objects they are allocated memory in the heap and referenced in the stack
        
        /*
         * Arrays
         */
        System.out.println("\n## Arrays ##");
        // Specifies the number of values it can have
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 33;
        numbers[2] = 6;
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);

        // Arrays have fixed size

        // Another way to create arrays and assign values
        // Arrays can be any data type
        int[] numbersTwo = {0, 5, 6, 7, 8, 9};
        System.out.println("Before: " + Arrays.toString(numbersTwo));
        numbersTwo[1] = 55;
        System.out.println("After: " + Arrays.toString(numbersTwo));

        /*
         * Nulls and 0's in Arrays
         */
        System.out.println("\n## Nulls and 0's in Arrays ##");
        // For primitive types, empty indexes are filled with 0
        int[] numbersThree = new int[3];
        numbersThree[0] = 11;
        System.out.println(Arrays.toString(numbersThree));
        // Can then change it using fill
        Arrays.fill(numbersThree, -1);
        numbersThree[2] = 11;
        System.out.println(Arrays.toString(numbersThree));
        
        // For objects, it is filled with null
        String[] names = new String[3];
        names[0] = "Nisarg";
        System.out.println(Arrays.toString(names));

        /*
         * Loops and Arrays
         */
        System.out.println("\n## Loops and Arrays ##");
        // Don't print each item of an array individually
        String[] namesTwo = {"James", "Nadia", "Sophia", "Alex", "Salah"};
        for (int i = 0; i < namesTwo.length; i++) {
            System.out.println(namesTwo[i]);
        }

        /*
         * Conditional
         */
        System.out.println("\n## Conditional Statements ##");
        if(true){
            System.out.println("This runs when true");
        }
        else{
            System.out.println("This runs when false");
        }

        /*
         * Methods
         */
        System.out.println("\n## Methods ##");
        /*
         * When building methods need to specify:
         * - Access Modifier
         * - Optional Static
         * - Return type
         * - Name
         * - Optional Parameters
         * -Method Body
         * Optional return value
         */
        System.out.println(add(5,10));

        /*
         * Classes and Objects
         */
        System.out.println("\n## Classes and Objects ##");
        Cat cat = new Cat("Mike");
        cat.meow();

    }

    
}

class Cat {
    String name;
    Cat(String catName){
        this.name = catName;
    }
    void meow(){
        System.out.println(name + ": meow ...");
    }
}