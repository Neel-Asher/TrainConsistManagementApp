import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * ======================================================================
 * MAIN CLASS - UseCase9TrainConsistMgmnt
 * ======================================================================
 *
 * Use Case 9: Group Bogies by Type
 *
 * Description:
 * This class groups similar bogies together using
 * Java Stream Collectors.groupingBy().
 *
 * At this stage, the application:
 * - Creates a list of bogies
 * - Streams the list
 * - Groups bogies by name
 * - Stores grouped data in a Map
 * - Displays grouped structure
 *
 * This maps classification logic using groupingBy.
 *
 * @author Developer
 * @version 9.0
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
        
        // Group bogies by type
        var groupedBogies = bogie.stream().collect(java.util.stream.Collectors.groupingBy(b -> b.name));
        
        // Display grouped bogies
        System.out.println("Grouped Bogies by Type:");
        groupedBogies.forEach((type, bogies) -> {
			System.out.println(type + ":");
			bogies.forEach(b -> System.out.println("  - " + b.name + " (Capacity: " + b.capacity + ")"));
		});
        
		System.out.println();
		System.out.println("Operations completed successfully!");

	}
}