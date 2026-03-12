import java.util.ArrayList;
import java.util.List;

/**
 * ======================================================================
 * MAIN CLASS - UseCase20TrainConsistMgmnt
 * ======================================================================
 *
 * Use Case 20: Exception Handling During Search Operations
 *
 * Description:
 * This class prevents searching when no bogies exist
 * by applying fail-fast validation using exceptions.
 *
 * At this stage, the application:
 * - Creates bogie collection
 * - Validates system state
 * - Throws exception if empty
 * - Stops invalid search operation
 * - Displays meaningful message
 *
 * This maps defensive programming using runtime exceptions.
 *
 * @author Developer
 * @version 20.0
 */


public class Main {

	public static void main (String[] args) {
		
		String[] bogieIds = {};
		
		String searchId = "BG101";
		
		if (bogieIds.length == 0) {
			throw new IllegalStateException("No bogies available for search. Please add bogies before searching.");
		}
		
		boolean found = false;
		
		for (String id : bogieIds) {
			if (id.equals(searchId)) {
				found = true;
				break;
			}
		}
		
		if(found) {
			System.out.println("Bogie " + searchId + " found in the consist.");
		} else {
			System.out.println("Bogie " + searchId + " not found in the consist.");
		}
		
		System.out.println();
		System.out.println("Operations completed successfully!");

	}
}