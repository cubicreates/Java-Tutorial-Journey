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

    }
}
