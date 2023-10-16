package traffic_intersection;

public class TrafficIntersectionSimulation {

	public static void main(String[] args) {

		TrafficLane northSouth = new TrafficLane();
		TrafficLane eastWest = new TrafficLane();
		TrafficLane diagonalLane = new TrafficLane();
		
		// North-South Lane
		System.out.println("North-South Lane:");
		northSouth.start();
		try {
			northSouth.join();	
		} catch(Exception e) {
			System.out.println(e);
		}
		
		// East-West Lane
		System.out.println("East-West Lane:");
		eastWest.start();
		try {
			eastWest.join();	
		} catch(Exception e) {
			System.out.println(e);
		}
		
		// Diagonal Lane
		System.out.println("Diagonal Lane:");
		diagonalLane.start();
		try {
			diagonalLane.join();	
		} catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
