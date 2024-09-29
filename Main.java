import java.util.Scanner; // Module for user input

public class Main {
    public static void main(String[] args) {
               // Printing Statements
               System.out.println("Hello World!"); 
            
               //Getting the scanner ready
               Scanner scan = new Scanner(System.in);

               //Usage
               System.out.println("What is your name?");
               String name = scan.nextLine();

               System.out.println("Hello "+name);

               //Datatypes and Typecasting

               int myNum = 5;               // Integer (whole number)
               float myFloatNum = 5.99f;    // Floating point number
               char myLetter = 'D';         // Character
               boolean myBool = true;       // Boolean
               String myText = "Hello";     // String
               
               //Printing
               System.out.println(myNum);
               System.out.println(myFloatNum);
               System.out.println(myLetter);
               System.out.println(myBool);
               System.out.println(myText);


               //TypeCasting

               int myIntg = 9; //Wide casting
               double myDobuble = myIntg; // Automatic casting: int to double

               System.out.println(myIntg);      // Outputs 9
               System.out.println(myDobuble);   // Outputs 9.0

               double myDouble = 9.78d; //Narrow casting
               int myInt = (int) myDouble; // Manual casting: double to int

               System.out.println(myDouble);   // Outputs 9.78
               System.out.println(myInt);      // Outputs 9
    }
}
