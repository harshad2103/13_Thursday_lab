package Harshad;

import java.util.Scanner;

public class Question_3_3 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
			System.out.print("Enter a number: ");
			int number = input.nextInt();

			if (number % 2 == 0) {
			    System.out.println(number + " is even.");
			} else {
			    System.out.println(number + " is odd.");
			}
		}
    }
}

