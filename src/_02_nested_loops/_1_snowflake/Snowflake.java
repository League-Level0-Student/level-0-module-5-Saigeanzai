package _02_nested_loops._1_snowflake;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;


public class Snowflake {
	
	public static void main(String[] args) {

		// #1. Make a new Robot
		Robot rob = new Robot();

		// #2. Set your robot’s position to x=300 and y=300


		// #3. Put the robot's pen down
rob.penDown();

		// #4. Set the robot’s speed to 5
rob.setSpeed(5);

		// #5. use a for loop below to do everything ( #6, #7, #8, #9, #12, #13, #14 ) 6 times (use i as the counter)
int i = 0;
i += 1;
while (i < 4) {
	

			
			// #6. Set the pen color to black
rob.setPenColor(0,0,0);
			
			// #7. move the robot by 50
rob.move(50);
			
			// #8. turn the robot to the right by 60
rob.turn(60);
			// #12. set the pen color to blue for even numbers of i

if (i%2==(0)) {
	rob.setPenColor(0,0,255);
}
else {
	rob.setPenColor(255,0,0);
}
			// #13. set the pen color to red for all odd numbers of i
			
			
			// #9. Use a for loop to do everything (#10, #11) 6 times ( use j as a counter )
int j = 0;
j += 1;
while (j < 4) {		
			
					// #10. turn the robot to the left by 60
		rob.turn(60);
					
					// #11. move the robot by 50 (play the start button)
					rob.move(50);
				
			
			// #14. set the pen color to black
	rob.setPenColor(0,0,0);
}	
		
	}

}
}
