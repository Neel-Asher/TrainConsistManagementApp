import java.util.List;

/**
 * ======================================================================
 * MAIN CLASS - UseCase14TrainConsistMgmnt
 * ======================================================================
 *
 * Use Case 14: Handle Invalid Bogie Capacity (Custom Exception)
 *
 * Description:
 * This class prevents creation of passenger bogies
 * with invalid seating capacity using a custom exception.
 *
 * At this stage, the application:
 * - Defines a custom exception
 * - Validates capacity inside constructor
 * - Throws exception if capacity <= 0
 * - Prevents invalid bogie creation
 * - Continues execution safely
 *
 * This maps fail-fast validation using checked exceptions.
 *
 * @author Developer
 * @version 14.0
 */

public class Main {
	
	// custom exception for invalid bogie capacity
	static class InvalidCapacityException extends Exception {
		public InvalidCapacityException(String message) {
			super(message);
		}
	}
	
	static class PassengerBogie {
		private int seatingCapacity;
		
		public PassengerBogie(int seatingCapacity) throws InvalidCapacityException {
			if (seatingCapacity <= 0) {
				throw new InvalidCapacityException("Seating capacity must be greater than zero.");
			}
			this.seatingCapacity = seatingCapacity;
		}
		
		public int getSeatingCapacity() {
			return seatingCapacity;
		}
	}

	public static void main (String[] args) {
		
		System.out.println("Creating passenger bogies with valid and invalid capacities...");
		
		try {
			PassengerBogie validBogie = new PassengerBogie(50);
			System.out.println("Valid bogie created with capacity: " + validBogie.getSeatingCapacity());
			
			// Attempt to create an invalid bogie
			PassengerBogie invalidBogie = new PassengerBogie(-10);
			System.out.println("Invalid bogie created with capacity: " + invalidBogie.getSeatingCapacity());
		} catch (InvalidCapacityException e) {
			System.out.println("Error creating bogie: " + e.getMessage());
		}
			
		System.out.println();
		System.out.println("Operations completed successfully!");

	}
}