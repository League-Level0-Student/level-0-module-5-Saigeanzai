package _04_practice._1_skill_practice;

import javax.swing.JOptionPane;

public class SkillPractice {
	public static void main(String[] args) {

		SkillPractice skills = new SkillPractice();
		skills.skill1();
		skills.skill2();
		skills.skill3();
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

	void skill3() {

	}

	void skill4() {

	}

	void skill5() {

	}

}
