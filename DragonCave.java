package com.test;

import java.util.Scanner;

public class DragonCave {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("You are in a land full of dragons. In front of you,");
		System.out.println("you see two caves. In on cave, the dragon is friendly");
		System.out.println("and will share his treasure with you. The other dragon");
		System.out.println("is greedy and hungry and will eat you on sight.");
		System.out.println("Which cave will you go into? (1 or 2)");
		int choice = scan.nextInt();
		if (choice == 1) {
			System.out.println("You approach the cave...");
			System.out.println("It is dark and spooky");
			System.out.println("A large dragon jumps out in front of you! He opens his jaws and...");
			System.out.println("Gobbles you down in one bite!");
		} else if (choice == 2) {
			System.out.println("You approach the cave...");
			System.out.println("It is dark and spooky");
			System.out.println("A large dragon jumps out in front of you! He opens his jaws and...");
			System.out.println("Says congratulations and gives you a share of his treasure!");
		} else {
			System.out.println("That is not a valid choice, enter a valid choice (1 or 2)");
		}
		scan.close();
	}

}
