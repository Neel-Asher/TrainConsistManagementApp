import java.util.ArrayList;
import java.util.List;

/**
 * ======================================================================
 * MAIN CLASS - UseCase18TrainConsistMgmnt
 * ======================================================================
 *
 * Use Case 18: Linear Search for Bogie ID
 *
 * Description:
 * This class demonstrates searching for a specific bogie ID
 * using a simple Linear Search algorithm.
 *
 * At this stage, the application:
 * - Creates an array of bogie IDs
 * - Accepts a search key
 * - Traverses array sequentially
 * - Stops when match is found
 * - Displays search result
 *
 * This maps basic searching logic using sequential traversal.
 *
 * @author Developer
 * @version 18.0
 */

public class Main {

	public static void main (String[] args) {
		
		List<Object> bogieNames = new ArrayList<>();
		bogieNames.add("Sleeper");
		bogieNames.add("AC First Class");
		bogieNames.add("AC 2 Tier");
		bogieNames.add("AC 3 Tier");
		bogieNames.add("General");
		
		// Display the bogie names
		System.out.println("Bogie Names:");
		for (Object bogie : bogieNames) {
			System.out.println("- " + bogie);
		}
		
		// Example search key
		String searchKey = "AC 2 Tier";
		
		// Linear search for the bogie ID
		boolean found = false;
		for (Object bogie : bogieNames) {
			if (bogie.equals(searchKey)) {
				found = true;
				break;
			}
		}
		
		// Display search result
		if (found) {
			System.out.println("\nBogie '" + searchKey + "' found in the list.");
		} else {
			System.out.println("\nBogie '" + searchKey + "' not found in the list.");
		}
		
		System.out.println();
		System.out.println("Operations completed successfully!");

	}
}