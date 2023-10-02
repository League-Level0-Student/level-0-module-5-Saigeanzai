package _03_method_writing._2_happy_pet;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class HappyPet {

	// 1. Add the following variable to the next line: static int happinessLevel =
	// 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	static int task;
	static int petHappiness = 100;
	static Random tank = new Random();

	static void lovePet() {
		System.exit(0);
	}

	public static void main(String[] args) {
		// 2. Ask the user what kind of pet they want to buy, and store their answer in
		// a variable
		String pet = JOptionPane
				.showInputDialog("what kind of pet do you want to buy? There is a cat, dog, bird, and a hamster");

		// 3. REPEAT steps 4 - 7 enough times to make your pet happy!

		// 4. Use showOptionDialog to ask the user what they want to do to make their
		// pet happy
		// (eg: cuddle, food, water, take a walk, groom, clean up poop).
		// Make sure to customize the title and question too.
		task = JOptionPane.showOptionDialog(null, "what do you want to do to make your pet happy?", "question", 0,
				JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "cuddle", "food", "water", "pet", "clean up poop", }, null);

		// 6. Use user input to call the appropriate method created in step 5 below.

		if (pet.equals("cat")) {
			catInteraction();
		}
		if(pet.equals("dog")) {
			dogInteraction();
		}
		if (petHappiness <= 0) {
			lovePet();
		}
		// 7. If you determine the happiness level is large enough, tell the
		// user that he loves his pet and use break; to exit for loop.
	}

	// 5. Create methods to handle each of your user selections.
	// Each method should create a pop-up with the pet's response (eg. cat might
	// purr when pet),
	// and INCREMENT the pet's happiness Level.
	static void catInteraction() {
		if (task == 3) {
			JOptionPane.showMessageDialog(null, "The cat purrs");
			happinessLevel = tank.nextInt(20);
		}
		if (task == 2) {
			JOptionPane.showMessageDialog(null, "The cat drank the water happily");
			happinessLevel = tank.nextInt(20);
		}

		if (task == 1) {
			JOptionPane.showMessageDialog(null, "The cat ate the food enjoying every bite");
			happinessLevel = tank.nextInt(20);

		}
		if (task == 0) {
			JOptionPane.showMessageDialog(null, "The cat purrs and relaxes");
			happinessLevel = tank.nextInt(20);
		}
		if (task == 4) {
			JOptionPane.showMessageDialog(null, "The cat feels cleaner with their clean paws");
			happinessLevel = tank.nextInt(20);
		}
	}
	static void dogInteraction() {
		if (task == 3) {
			JOptionPane.showMessageDialog(null, "The dog licks you");
			happinessLevel = tank.nextInt(20);
		}
		if (task == 2) {
			JOptionPane.showMessageDialog(null, "The dog drank the water gratefully");
			happinessLevel = tank.nextInt(20);
		}

		if (task == 1) {
			JOptionPane.showMessageDialog(null, "The dog ate every piece of food");
			happinessLevel = tank.nextInt(20);

		}
		if (task == 0) {
			JOptionPane.showMessageDialog(null, "The dog licks your face");
			happinessLevel = tank.nextInt(20);
		}
		if (task == 4) {
			JOptionPane.showMessageDialog(null, "The dog feels happy that you cleaned up after them");
			happinessLevel = tank.nextInt(20);
		}
	}
	static void hamsterInteraction() {
		if (task == 3) {
			JOptionPane.showMessageDialog(null, "The hamster lays in your hand");
			happinessLevel = tank.nextInt(20);
		}
		if (task == 2) {
			JOptionPane.showMessageDialog(null, "The hamster drinks the water quickly");
			happinessLevel = tank.nextInt(20);
		}

		if (task == 1) {
			JOptionPane.showMessageDialog(null, "The hamster ate until full");
			happinessLevel = tank.nextInt(20);

		}
		if (task == 0) {
			JOptionPane.showMessageDialog(null, "The hamster falls asleep");
			happinessLevel = tank.nextInt(20);
		}
		if (task == 4) {
			JOptionPane.showMessageDialog(null, "The hamster feels relieved");
			happinessLevel = tank.nextInt(20);
		}
	}
}
