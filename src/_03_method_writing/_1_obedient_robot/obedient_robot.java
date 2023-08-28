package _03_method_writing._1_obedient_robot;

import org.jointheleague.graphical.robot.Robot;

public class obedient_robot {
	public static void main(String[] args) {
	
		Robot rob = new Robot();		
		
		// rob.penDown();
		// rob.setSpeed(10);
		// int count =0;
		//	rob.move(200);
		//	rob.turn(90);
		//	count += 1;
		//	while ( count < 4 ) {
	   	//		rob.move(200);
	   	//		rob.turn(90);
	   	//		count += 1;
	   	//	}

		//	rob.penDown();
		//	rob.setSpeed(10);
		//	int count = 0;
		//	int sides = 3;
		//	int angle = 360/sides;
		//	rob.turn(angle);
		//	count = count +1;
		//	while ( count<4) {
		//		rob.move(250);
		//		rob.turn(angle);
		//		count = count+1;
		
	// }	
		
		
		
	rob.penDown();
		rob.setSpeed(10);
		int count = 0;
		int sides = 1;
		int angle = 3/sides;
		rob.turn(angle);
		count = count +1;
	while ( count<100) {
			rob.move(50);
			rob.turn(angle);
			count = count+1;
	
		
		
		
		
		
		
			}
	}
}
	
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

