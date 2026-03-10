import java.util.HashMap;
import java.util.Map;

/**
 * ======================================================================
 * MAIN CLASS - UseCase6TrainConsistMgmnt
 * ======================================================================
 *
 * Use Case 6: Map Bogie to Capacity (HashMap)
 *
 * Description:
 * This class associates each bogie with its seating or
 * load capacity using a key-value mapping structure.
 *
 * At this stage, the application:
 * - Creates a HashMap for bogie-capacity mapping
 * - Inserts capacity values for each bogie
 * - Iterates through map entries
 * - Displays bogie and capacity information
 *
 * This maps lookup-based access using HashMap.
 *
 * @author Developer
 * @version 6.0
 */

public class Main {
	
	public static void main (String[] args) {

		// Display Welcome Banner
		System.out.println("======================================");
		System.out.println("==== Train Consist Management App ====");
		System.out.println("======================================");
		System.out.println();
		
        // HashMap stores data in key -> value format
        Map<String, Integer> capacity = new HashMap<>();
		
		// add vaues
		capacity.put("First Class",24);
		capacity.put("Cargo",120);
		capacity.put("Sleeper",72);
		capacity.put("AC Chair",56);
		System.out.println("Bogie Capacity Details: \n"+capacity);
		
		System.out.println();
		System.out.println("Operations completed successfully!");

	}
}