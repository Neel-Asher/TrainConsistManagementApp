import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * ======================================================================
 * MAIN CLASS - UseCase8TrainConsistMgmnt
 * ======================================================================
 *
 * Use Case 8: Filter Passenger Bogies Using Streams
 *
 * Description:
 * This class filters passenger bogies based on seating
 * capacity using Java Stream API.
 *
 * At this stage, the application:
 * - Creates a list of bogies
 * - Converts list into stream
 * - Applies filter condition
 * - Collects filtered result
 * - Displays qualifying bogies
 *
 * This maps functional filtering using Streams.
 *
 * @author Developer
 * @version 8.0
 */

public class Main {
	
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
        
        // Filter bogies with capacity greater than 60
        List<Bogie> filteredBogies = bogie.stream().filter(b -> b.capacity > 60).toList();
        
        // Display filtered bogies
		System.out.println("Passenger Bogies with Capacity > 60:");
		filteredBogies.forEach(b -> System.out.println("- " + b.name + " (Capacity: " + b.capacity + ")"));
        
		System.out.println();
		System.out.println("Operations completed successfully!");

	}
}