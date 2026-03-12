import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * ======================================================================
 * MAIN CLASS - UseCase10TrainConsistMgmnt
 * ======================================================================
 *
 * Use Case 10: Count Total Seats in Train
 *
 * Description:
 * This class aggregates seating capacity of all bogies
 * into a single total using Stream reduce().
 *
 * At this stage, the application:
 * - Creates bogie list
 * - Maps bogies to capacity
 * - Reduces values into total
 * - Displays total seat count
 *
 * This maps aggregation logic using reduce().
 *
 * @author Developer
 * @version 10.0
 */

class Main {
	
	// inner class representing a Bogie
	static class Bogie {
		
		String name;
		int capacity;
		
		Bogie(String name, int capacity) {
			this.name = name;
			this.capacity = capacity;
		}
	}
	
	// main method to execute the application
	public static void main (String[] args) {

		// Display Welcome Banner
		System.out.println("======================================");
		System.out.println("==== Train Consist Management App ====");
		System.out.println("======================================");
		System.out.println();
		
        List<Bogie> bogie = new ArrayList<>(); 

        bogie.add(new Bogie("Sleeper", 72));
        bogie.add(new Bogie("AC 3 Tier", 64));
        bogie.add(new Bogie("AC 2 Tier", 48));
        bogie.add(new Bogie("General", 90));
        
        // Display all bogies
        System.out.println("All Passenger Bogies:");
        bogie.forEach(b -> System.out.println("- " + b.name + " (Capacity: " + b.capacity + ")"));
        System.out.println();
        
        // Calculate total seating capacity using Stream reduce()
        int totalSeats = bogie.stream().map(b -> b.capacity).reduce(0, Integer::sum);
        
        // Display total seat count
        System.out.println("Total Seating Capacity in Train: " + totalSeats);
        
        
		System.out.println();
		System.out.println("Operations completed successfully!");

	}
}