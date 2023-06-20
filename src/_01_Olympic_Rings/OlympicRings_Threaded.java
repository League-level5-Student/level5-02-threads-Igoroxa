package _01_Olympic_Rings;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
 Robot red = new Robot();
 Robot green = new Robot();
 Robot yellow = new Robot();
 Robot blue = new Robot();
 Robot black = new Robot();
 

 
Thread r1 = new Thread(()->drawCircle(red));

Thread r2 = new Thread(()-> red.turn(180));
Thread r3 = new Thread(()->yellow.move(400));
Thread r4 = new Thread(()->blue.move(400));
Thread r5 = new Thread(()->black.move(400));

public static void main(String[] args) {
	r1.start();
	r2.start();
}
void drawCircle(Robot r) {
	red.penDown();
	red.move(100);
}
}

