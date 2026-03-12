import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * ======================================================================
 * MAIN CLASS - UseCase7TrainConsistMgmnt
 * ======================================================================
 *
 * Use Case 7: Sort Bogies by Capacity (Comparator)
 *
 * Description:
 * This class sorts passenger bogies based on seating
 * capacity using a custom Comparator.
 *
 * At this stage, the application:
 * - Creates bogie objects
 * - Stores them in a list
 * - Displays unsorted data
 * - Sorts using Comparator logic
 * - Displays sorted result
 *
 * This maps custom ordering using Comparator.
 *
 * @author Developer
 * @version 7.0
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
        
        System.out.println("Bogies Before Sorting:");
        for (Bogie b : bogie) {
            System.out.println(b.name + " - Capacity: " + b.capacity);
        }

        Collections.sort(bogie, new Comparator<Bogie>() {
            public int compare(Bogie b1, Bogie b2) {
                return b1.capacity - b2.capacity;
            }
        });

        System.out.println();
        System.out.println("Bogies After Sorting (By Capacity):");
        for (Bogie b : bogie) {
            System.out.println(b.name + " - Capacity: " + b.capacity);
        }
        
		System.out.println();
		System.out.println("Operations completed successfully!");

	}
}