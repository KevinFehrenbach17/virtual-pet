package virtualPet;

import java.util.Scanner;

public class VirtualPetApp {
	public static void main(String[] args) {
		VirtualPet myPet = new VirtualPet();
		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to Virtual Pet! Enter a name for your pet:");
		String petName = input.nextLine();
		System.out.println("Your pets name is now " + petName);

		System.out.println(myPet.getStatus());

		do {
			System.out.println("you can feed, play, and sleep your pet");
			System.out.println("1 to feed");
			System.out.println("2 to sleep");
			System.out.println("3 to play");
			int action = input.nextInt();

			if (action == 1) {
				myPet.Feed();
				System.out.println("You fed " + petName);
			} else if (action == 2) {
				myPet.Feed();
				System.out.println("You rested " + petName);
			} else if (action == 3) {
				myPet.Feed();
				System.out.println("You played with  " + petName);
			}
			System.out.println(myPet.getStatus());
		}

		while (myPet.Tick() < 150);

	}
}