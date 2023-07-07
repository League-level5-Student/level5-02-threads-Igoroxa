package _03_Threaded_Greeting;

import java.awt.Color;

public class ThreadedGreeter implements Runnable {

	int amount;

	public ThreadedGreeter(int Custom) {
		amount = Custom;
	}

	@Override
	public void run() {
		System.out.println("Hello from thread number: " + amount);
		if (amount <= 50) {
			Thread r = new Thread(new ThreadedGreeter(amount + 1));

			r.start();
			try {
				r.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
