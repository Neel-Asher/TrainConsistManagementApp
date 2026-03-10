import java.util.LinkedHashSet;
import java.util.Set;

/**
 * ======================================================================
 * MAIN CLASS - UseCase5TrainConsistMgmnt
 * ======================================================================
 *
 * Use Case 5: Preserve Insertion Order of Bogies
 *
 * Description:
 * This class maintains the exact attachment order of bogies
 * while also preventing duplicate entries using LinkedHashSet.
 *
 * At this stage, the application:
 * - Attaches bogies in order
 * - Preserves insertion sequence
 * - Avoids duplicate bogies
 * - Displays final train formation
 *
 * This maps ordered uniqueness using LinkedHashSet.
 *
 * @author Developer
 * @version 5.0
 */


public class Main {
	
	public static void main (String[] args) {

		// Display Welcome Banner
		System.out.println("======================================");
		System.out.println("==== Train Consist Management App ====");
		System.out.println("======================================");
		System.out.println();
		
		// LinkedHashSet preserves order and avoids duplication 
		Set<String> formation = new LinkedHashSet<>();
		
		// add vaues
		formation.add("Engine");
		formation.add("Sleeper");
		formation.add("Cargo");
		formation.add("Guard");
		formation.add("Engine");
		formation.add("Sleeper");
		System.out.println("Final Train Formation: \n"+formation);
		System.out.println();
		
		System.out.println("Note: \nLinkedHashSet preserves order and removes duplicates automatically");
		System.out.println();
		System.out.println("Operations completed successfully!");

	}
}