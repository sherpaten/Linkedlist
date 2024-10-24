package ds;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LL List = new LL();  // Create an instance of LinkedList
        Scanner scanner = new Scanner(System.in);  // Create a scanner object for user input

        // Ask the user how many elements they want to add to the linked list
        System.out.print("How many elements do you want to add to the linked list? ");
        int numberOfElements = scanner.nextInt();  // Read the number of elements

        // Use a loop to allow the user to input each element one by one
        for (int i = 0; i < numberOfElements; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            int element = scanner.nextInt();  // Read the element value
            List.Add(numberOfElements, null);(element);  // Add the element to the linked list
        }

        // Print the linked list after all elements have been added
        System.out.println("The linked list is:");
        List.PrintAllData();

        scanner.close();  // Close the scanner object
    }
}