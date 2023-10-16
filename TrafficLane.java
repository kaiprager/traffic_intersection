package traffic_intersection;

import java.util.Random;

public class TrafficLane extends Thread {
	
	Random random = new Random();
	int numberOfCars = random.nextInt(6);

	@Override
	public void run() {
		
		System.out.println("The traffic light is green!");
			
		for(int n = 1; n <= numberOfCars; n++) {
			
			try {
				Thread.sleep(500);
				System.out.println("Car " + n + " is passing the interesection.");
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		
		}
		
		System.out.println("The traffic light is red!\n");

	}

}
