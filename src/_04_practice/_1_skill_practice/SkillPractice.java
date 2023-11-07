package _04_practice._1_skill_practice;

import javax.swing.JOptionPane;

public class SkillPractice {
	public static void main(String[] args) {

		SkillPractice skills = new SkillPractice();
		skills.skill1();
		skills.skill2();
		
		skills.skill4();
		skills.skill5();
	}

	void skill1() {
		String dimes = JOptionPane.showInputDialog("How many dimes do you have?");
		int number1 = Integer.parseInt(dimes);
		JOptionPane.showMessageDialog(null, "you have " + number1 * 10 + " cents");
		String height = JOptionPane.showInputDialog("how tall are you? (inches)");
		int heightNumber = Integer.parseInt(height);
		if (heightNumber <= 36) {
			System.out.println("eat your wheaties");
		}
	}

void skill2() {
	for(int i=1; i<30; i++) {
		System.out.println(i);
	}

}

	void skill4() {
String city = JOptionPane.showInputDialog("which city do you live in?");
if (city.equals("San Diego")) {
	JOptionPane.showMessageDialog(null, "You live in America's Finest City");
}
else {
	JOptionPane.showMessageDialog(null, "move to San Diego");
}
String cars = JOptionPane.showInputDialog("How many cars does your family own");
int numberCars = Integer.parseInt(cars);
if (numberCars<1) {
	JOptionPane.showMessageDialog(null, "I bet you use public transportation");
}
if (numberCars==1) {
	System.out.println("Toyota Prius");
}
if (numberCars>1) {
	JOptionPane.showMessageDialog(null, "four");
}
	}

	void skill5() {
String school = JOptionPane.showInputDialog("What's the name of the school you go to?");{
	JOptionPane.showMessageDialog(null, school + " is the fantastic school");
}
	}

}
