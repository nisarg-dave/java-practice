// This class can be called anything
public class Main{

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
        System.out.println("\n##Comparison Operators##");
        System.out.println(10<10);
        System.out.println(10<=10);
        System.out.println(10>10);
        System.out.println(10>=10);
        System.out.println(10==10);
        System.out.println(10!=10);

        /*
         * Shorthand Reassignment
         */
        System.out.println("\n##Shorthand Assignment##");
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
        System.out.println("\n## Strings");
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

        

    }
}