package Harshad;

import java.util.Scanner;

public class Question_3_1 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
			System.out.print("Enter your age: ");
			int age = input.nextInt();

			if (age >= 18) {
			    System.out.println("You are eligible for voting!");
			} else {
			    System.out.println("You are not eligible for voting.");
			}
		}
    }
}
