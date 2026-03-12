import java.util.List;

/**
 * ======================================================================
 * MAIN CLASS - UseCase15TrainConsistMgmnt
 * ======================================================================
 *
 * Use Case 15: Safe Cargo Assignment Using try-catch-finally
 *
 * Description:
 * This class safely assigns cargo to goods bogies
 * while handling unsafe combinations using structured
 * exception handling blocks.
 *
 * At this stage, the application:
 * - Defines a custom runtime exception
 * - Validates cargo assignment rules
 * - Throws exception for unsafe cargo
 * - Catches and handles the exception
 * - Executes finally block for logging
 *
 * This maps runtime safety handling using try-catch-finally.
 *
 * @author Developer
 * @version 15.0
 */

public class Main {
	
	// custom exception for invalid bogie capacity
	static class CargoSafetyException extends RuntimeException {
		public CargoSafetyException(String message) {
			super(message);
		}
	}
	
	static class GoodsBogie {
		String shape;
		String cargo;
		
		GoodsBogie(String shape) {
			this.shape = shape;
		}
		
		void assignCargo(String cargo) {
			// Define unsafe cargo combinations
			if ((shape.equals("Boxcar") && cargo.equals("Liquids")) ||
				(shape.equals("Flatcar") && cargo.equals("Heavy Machinery"))) {
				throw new CargoSafetyException("Unsafe cargo assignment: " + cargo + " cannot be assigned to " + shape);
			}
			this.cargo = cargo;
			System.out.println("Cargo '" + cargo + "' assigned to " + shape);
		}
	}

	public static void main (String[] args) {
		
		// Create goods bogies
		GoodsBogie boxcar = new GoodsBogie("Boxcar");
		GoodsBogie flatcar = new GoodsBogie("Flatcar");
		
		// List of cargo to assign
		String[] cargoList = {"Grain", "Liquids", "Heavy Machinery"};
		
		// Attempt to assign cargo with exception handling
		for (String cargo : cargoList) {
			try {
				boxcar.assignCargo(cargo);
				flatcar.assignCargo(cargo);
			} catch (CargoSafetyException e) {
				System.err.println("Error: " + e.getMessage());
			} finally {
				System.out.println("Attempted to assign '" + cargo + "' to both bogies.");
			}
		}
		
		System.out.println();
		System.out.println("Operations completed successfully!");

	}
}