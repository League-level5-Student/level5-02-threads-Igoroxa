package _02_Advanced_Robot_Race;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class  AdvancedRobotRace {
	// 1. make a main method
	public static void main(String[] args) {
//	int x = 5;
//	while(x < 10) {
//		System.out.println("YO");
//		x++;
//	}

		// 2. create an array of 5 robots.
		Robot rob[] = new Robot[7];
		// 3. use a for loop to initialize the robots.

		for (int i = 0; i < rob.length; i++) {
			rob[i] = new Robot();

			// 4. make each robot start at the bottom of the screen, side by side, facing up
			rob[i].moveTo(i * 100 + 150, 525);
		}
		
		Thread r1 = new Thread(() -> randomMove(rob[0]));
		Thread r2 = new Thread(() -> randomMove(rob[1]));
		Thread r3 = new Thread(() -> randomMove(rob[2]));
		Thread r4 = new Thread(() -> randomMove(rob[3]));
		Thread r5 = new Thread(() -> randomMove(rob[4]));
		Thread r6 = new Thread(() -> randomMove(rob[5]));
		Thread r7 = new Thread(() -> randomMove(rob[6]));
		
		r1.start();
		r2.start();
		r3.start();
		r4.start();
		r5.start();
		r6.start();
		r7.start();
		
		
		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		
		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.

		// 7. declare that robot the winner and throw it a party!
		}
		// 8. try different races with different amounts of robots.

		// 9. make the robots race around a circular track.
	
	
	static void randomMove(Robot r) {
		Random ran = new Random();
		boolean check = true;
		while (check == true) {
				r.setSpeed(10);
				int distance = ran.nextInt(50);
				r.move(distance);
				int location = r.getY();
				if (location <= 0) {
					check = false;
					System.out.println("The winner is Robot Number " + r);
				}
				
			
		}
	}

}