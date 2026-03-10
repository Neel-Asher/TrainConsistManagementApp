import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

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
		
		Scanner sc = new Scanner(System.in);
		
		// Display Welcome Banner
		System.out.println("======================================");
		System.out.println("==== Train Consist Management App ====");
		System.out.println("======================================");
		System.out.println();
		
		// Create a hashset to store unique bogie ids
		Set<String> bogies = new HashSet<>();
		
		// add vaues
		bogies.add("BG101");
		bogies.add("BG102");
		bogies.add("BG103");
		
		System.out.println("Bogie IDs after insertion \n"+bogies);
		System.out.println();
		
		bogies.add("BG101");
		bogies.add("BG102");
		
		System.out.println("Note: \nDuplicates are automatically ignored by HashSet!");
		System.out.println();
		System.out.println("Operations completed successfully!");
		
		sc.close();
	}
}