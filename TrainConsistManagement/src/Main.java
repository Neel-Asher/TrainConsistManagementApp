import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * ======================================================================
 * MAIN CLASS - UseCase2TrainConsistMgmnt
 * ======================================================================
 *
 * Use Case 2: Add Passenger Bogies to Train
 *
 * Description:
 * This class demonstrates how passenger bogies can be
 * managed dynamically using ArrayList operations.
 *
 * At this stage, the application:
 * - Adds new bogies to the train
 * - Removes existing bogies
 * - Checks for bogie availability
 * - Displays the final consist
 *
 * This maps CRUD operations using ArrayList.
 *
 * @author Developer
 * @version 2.0
 */

public class Main {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Display Welcome Banner
		System.out.println("======================================");
		System.out.println("==== Train Consist Management App ====");
		System.out.println("======================================");
		System.out.println();
		
		// Create a dynamic list to store passenger bogies
		List<String> passengerBogies = new ArrayList<>();
		
		// add vaues
		passengerBogies.add("Sleeper");
		passengerBogies.add("AC Chair");
		passengerBogies.add("First Class");
		
		System.out.println("After adding bogies: \n"+passengerBogies);
		System.out.println();
		
		// remove values
		passengerBogies.remove(1);
		System.out.println("After removing 'AC Chair': \n"+passengerBogies);
		System.out.println();
		
		// check if value exists
		System.out.println("Checking if 'Sleeper' exists: ");
		System.out.println("Contains Sleeper ? "+passengerBogies.contains("Sleeper"));
		System.out.println();
		
		// display final train consist
		System.out.println("Final Train Passenger Consist: "+passengerBogies);
		System.out.println();
		System.out.println("Operations completed successfully!");
		
		sc.close();
	}
}