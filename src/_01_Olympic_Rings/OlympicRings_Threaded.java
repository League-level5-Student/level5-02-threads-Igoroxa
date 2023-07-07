package _01_Olympic_Rings;

import java.awt.Color;
import java.util.Iterator;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	static // Make A Program that uses Threads and robots to draw the Olympic rings. One
			// robot should draw one ring simultaneously with the other 4 robots.
	Robot red = new Robot();
	static Robot green = new Robot();
	static Robot yellow = new Robot();
	static Robot blue = new Robot();
	static Robot black = new Robot();

	static Thread r1 = new Thread(() -> drawCircle(red, Color.red));

	static Thread r2 = new Thread(() -> drawCircle(green, Color.green));
	static Thread r3 = new Thread(() -> drawCircle(yellow, Color.yellow));
	static Thread r4 = new Thread(() -> drawCircle(blue, Color.blue));
	static Thread r5 = new Thread(() -> drawCircle(black, Color.black));

	public static void main(String[] args) {
		red.setX(150);
		red.setY(200);
		green.setX(200);
		green.setY(250);
		yellow.setX(250);
		yellow.setY(200);
		blue.setX(300);
		blue.setY(250);
		black.setX(350);
		black.setY(200);

		r1.start();
		r2.start();
		r3.start();
		r4.start();
		r5.start();

	}

	static void drawCircle(Robot r, Color c) {
		r.penDown();
		r.setPenColor(c);

		for (int i = 0; i < 360; i++) {
			r.move(1);
			r.turn(1);
		}

		r.hide();

	}
}
