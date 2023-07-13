package Harshad;

import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
        System.out.println("Operator Options:");
        System.out.println("1. Arithmetic Operators");
        System.out.println("2. Relational Operators");
        System.out.println("3. Logical Operators");
        System.out.println("4. Bitwise Operators");
        System.out.println("5. Unary Operators");

        try (Scanner input = new Scanner(System.in)) {
			System.out.print("Enter your choice (1-5): ");
			int choice = input.nextInt();

			switch (choice) {
			    case 1:
			        System.out.println("Arithmetic Operators:");
			        System.out.println("- Addition (+)");
			        System.out.println("- Subtraction (-)");
			        System.out.println("- Multiplication (*)");
			        System.out.println("- Division (/)");
			        System.out.println("- Modulo (%)");
			        break;
			    case 2:
			        System.out.println("Relational Operators:");
			        System.out.println("- Equal to (==)");
			        System.out.println("- Not equal to (!=)");
			        System.out.println("- Greater than (>)");
			        System.out.println("- Less than (<)");
			        System.out.println("- Greater than or equal to (>=)");
			        System.out.println("- Less than or equal to (<=)");
			        break;
			    case 3:
			        System.out.println("Logical Operators:");
			        System.out.println("- Logical AND (&&)");
			        System.out.println("- Logical OR (||)");
			        System.out.println("- Logical NOT (!)");
			        break;
			    case 4:
			        System.out.println("Bitwise Operators:");
			        System.out.println("- Bitwise AND (&)");
			        System.out.println("- Bitwise OR (|)");
			        System.out.println("- Bitwise XOR (^)");
			        System.out.println("- Bitwise NOT (~)");
			        System.out.println("- Left shift (<<)");
			        System.out.println("- Right shift (>>)");
			        break;
			    case 5:
			        System.out.println("Unary Operators:");
			        System.out.println("- Increment (++)");
			        System.out.println("- Decrement (--)");
			        System.out.println("- Unary plus (+)");
			        System.out.println("- Unary minus (-)");
			        System.out.println("- Logical NOT (!)");
			        break;
			    default:
			        System.out.println("Invalid choice!");
			        break;
			}
		}
    }
}
