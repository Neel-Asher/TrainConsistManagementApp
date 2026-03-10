import java.util.LinkedList;
import java.util.List;

/**
 * ======================================================================
 * MAIN CLASS - UseCase3TrainConsistMgmnt
 * ======================================================================
 *
 * Use Case 3: Track Unique Bogie IDs
 *
 * Description:
 * This class ensures that duplicate bogie IDs are not
 * added into the train formation using HashSet.
 *
 * At this stage, the application:
 * - Stores bogie IDs
 * - Prevents duplicates automatically
 * - Displays unique bogie identifiers
 *
 * This maps uniqueness validation using Set.
 *
 * @author Developer
 * @version 3.0
 */

public class Main {
	
	public static void main (String[] args) {

		// Display Welcome Banner
		System.out.println("======================================");
		System.out.println("==== Train Consist Management App ====");
		System.out.println("======================================");
		System.out.println();
		
		// Create a linked list to maintain insertion order of bogie ids
		List<String> trainConsist = new LinkedList<>();
		
		// add vaues
		trainConsist.add("Engine");
		trainConsist.add("Sleeper");
		trainConsist.add("AC");
		trainConsist.add("Cargo");
		trainConsist.add("Guard");
		System.out.println("Initial Train Consist: \n"+trainConsist);
		System.out.println();
		
		// add value at index
		trainConsist.add(2,"Pantry Car");
		System.out.println("After inserting 'Pantry Car' at position 2: \n"+trainConsist);
		System.out.println();
		
		// remove first and last elements
		trainConsist.removeFirst();
		trainConsist.removeLast();
		System.out.println("After removing first and last elements: \n"+trainConsist);

		System.out.println();
		System.out.println("Operations completed successfully!");

	}
}