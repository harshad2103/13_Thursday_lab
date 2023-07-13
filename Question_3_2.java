package Harshad;

import java.util.Scanner;

public class Question_3_2 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) 
        {
			System.out.println("Enter three numbers:");
			System.out.print("Number 1: ");
			int num1 = input.nextInt();
			System.out.print("Number 2: ");
			int num2 = input.nextInt();
			System.out.print("Number 3: ");
			int num3 = input.nextInt();

			int greatest = num1; // Assume the first number is the greatest initially

			if (num2 > greatest) {
			    greatest = num2; // Update the greatest if the second number is larger
			}

			if (num3 > greatest) {
			    greatest = num3; // Update the greatest if the third number is larger
			}

			System.out.println("The greatest number is: " + greatest);
		}
    }
}
