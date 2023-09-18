package _03_method_writing._1_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class obedient_robot {
	public static void main(String[] args) {
	
		Robot rob = new Robot();
		
		String shape = JOptionPane.showInputDialog("what shape do you want? Square, Triangle, or Circle");
		if (shape.equals("Square")) {
			drawSquare(rob);
			String color = JOptionPane.showInputDialog("What color would you like the shape to be? Red, Blue, or Green");
			if (color.equals("Red")) {
		rob.setPenColor(255, 0, 0);
		drawSquare(rob);
			}	
			if (color.equals("Blue")) {
				rob.setPenColor(0,0,255);
				drawSquare(rob);
			}
			if (color.equals("Green")) {
				rob.setPenColor(0,255,0);
				drawSquare(rob);
			}
		}
		if (shape.equals("Triangle")) {
			drawTriangle(rob);
			String color = JOptionPane.showInputDialog("What color would you like the shape to be? Red, Blue, or Green");
			if (color.equals("Red")) {
		rob.setPenColor(255, 0, 0);
		drawTriangle(rob);
			}	
			if (color.equals("Blue")) {
				rob.setPenColor(0,0,255);
				drawTriangle(rob);
			}
			if (color.equals("Green")) {
				rob.setPenColor(0,255,0);
				drawTriangle(rob);
			}
		}
		if (shape.equals("Circle")) {
			drawCircle(rob);
			String color = JOptionPane.showInputDialog("What color would you like the shape to be? Red, Blue, or Green");
			if (color.equals("Red")) {
		rob.setPenColor(255, 0, 0);
		drawCircle(rob);
			}	
			if (color.equals("Blue")) {
				rob.setPenColor(0,0,255);
				drawCircle(rob);
			}
			if (color.equals("Green")) {
				rob.setPenColor(0,255,0);
				drawCircle(rob);
			}
		}
		
}
	
 static void drawSquare(Robot rob) {

		 rob.penDown();
		 rob.setSpeed(10);
		 int count =0;
			rob.move(200);
			rob.turn(90);
			count += 1;
			while ( count < 4 ) {
	   			rob.move(200);
	   			rob.turn(90);
	   			count += 1;
	   			
	   			}

	   		}
	
 static void drawTriangle(Robot rob) {

			rob.penDown();
			rob.setSpeed(10);
			int count = 0;
			int sides = 3;
			int angle = 360/sides;
			rob.turn(angle);
			count = count +1;
			while ( count<4) {
				rob.move(250);
				rob.turn(angle);
				count = count+1;
		
	 }	
 }
 static void drawCircle(Robot rob) {
	 rob.penDown();
		rob.setSpeed(350);
		int count = 0;
		int sides = 1;
		int angle = 4/sides;
		rob.turn(angle);
		count = count +1;
	while ( count<100) {
			rob.move(10);
			rob.turn(angle);
			count = count+1;
 }
 }
}
	
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

