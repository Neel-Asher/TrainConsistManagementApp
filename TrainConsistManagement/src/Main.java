import java.util.ArrayList;
import java.util.List;

/**
 * ======================================================================
 * MAIN CLASS - UseCase17TrainConsistMgmnt
 * ======================================================================
 *
 * Use Case 17: Sort Bogie Names Using Arrays.sort()
 *
 * Description:
 * This class demonstrates sorting of bogie type names
 * alphabetically using Java's built-in Arrays.sort() method.
 *
 * At this stage, the application:
 * - Creates an array of bogie names
 * - Uses Arrays.sort() for sorting
 * - Displays sorted results
 *
 * This maps optimized sorting using Java library utilities.
 *
 * @author Developer
 * @version 17.0
 */

public class Main {

	public static void main (String[] args) {
		
		List bogieNames = new ArrayList<>();
		bogieNames.add("Sleeper");
		bogieNames.add("AC First Class");
		bogieNames.add("AC 2 Tier");
		bogieNames.add("AC 3 Tier");
		bogieNames.add("General");
		
		System.out.println("Original Bogie Names:");
		for (Object name : bogieNames) {
			System.out.println(name);
		}
		
		// sort using Arrays.sort()
		String[] bogieArray = (String[]) bogieNames.toArray(new String[0]);
		
		//display sorted bogie names
		System.out.println("\nSorted Bogie Names:");
		for (String name : bogieArray) {
			System.out.println(name);
		}
		
		System.out.println();
		System.out.println("Operations completed successfully!");

	}
}