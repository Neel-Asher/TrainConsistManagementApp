import java.util.List;

/**
 * ======================================================================
 * MAIN CLASS - UseCase12TrainConsistMgmnt
 * ======================================================================
 *
 * Use Case 12: Safety Compliance Check for Goods Bogies
 *
 * Description:
 * This class enforces domain safety rules on goods bogies.
 *
 * At this stage, the application:
 * - Creates goods bogie list
 * - Converts list into stream
 * - Applies safety validation rule
 * - Checks compliance using allMatch()
 * - Displays safety status
 *
 * This maps real-world cargo safety rules using Streams.
 *
 * @author Developer
 * @version 12.0
 */

class Main {
	
	static class GoodsBogie {
		String type;
		String cargo;
		
		GoodsBogie(String type, String cargo) {
			this.type = type;
			this.cargo = cargo;
		}
	}

	public static void main (String[] args) {
		
		// Create list of goods bogies
		List<GoodsBogie> bogies = List.of(
			new GoodsBogie("Boxcar", "Electronics"),
			new GoodsBogie("Flatcar", "Vehicles"),
			new GoodsBogie("Tankcar", "Chemicals")
		);
		
		// Display initial bogie information
		System.out.println("Goods Bogies Information:");
		bogies.forEach(bogie -> 
			System.out.println("- Type: " + bogie.type + ", Cargo: " + bogie.cargo)
		);
		System.out.println();
		
		// Check safety compliance using Streams
		boolean allSafe = bogies.stream()
			.allMatch(bogie -> {
				if (bogie.type.equals("Tankcar") && bogie.cargo.equals("Chemicals")) {
					return false; // Unsafe combination
				}
				return true; // Safe
			});
		
		// Display safety status
		if (allSafe) {
			System.out.println("All goods bogies are compliant with safety regulations.");
		} else {
			System.out.println("Warning: Some goods bogies do not comply with safety regulations!");
		}
        
		System.out.println();
		System.out.println("Operations completed successfully!");

	}
}