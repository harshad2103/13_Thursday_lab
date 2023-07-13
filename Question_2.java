package Harshad;

import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
        System.out.println("Operator Options:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.println("5. Modulo (%)");

        try (Scanner input = new Scanner(System.in)) {
			System.out.print("Enter your choice (1-5): ");
			int choice = input.nextInt();

			switch (choice) {
			    case 1:
			        System.out.println("You selected Addition (+)");
			        break;
			    case 2:
			        System.out.println("You selected Subtraction (-)");
			        break;
			    case 3:
			        System.out.println("You selected Multiplication (*)");
			        break;
			    case 4:
			        System.out.println("You selected Division (/)");
			        break;
			    case 5:
			        System.out.println("You selected Modulo (%)");
			        break;
			    default:
			        System.out.println("Invalid choice!");
			        break;
			}
		}
    }
}
