import java.util.ArrayList;
import java.util.List;

/**
 * ======================================================================
 * MAIN CLASS - UseCase19TrainConsistMgmnt
 * ======================================================================
 *
 * Use Case 19: Binary Search for Bogie ID
 *
 * Description:
 * This class demonstrates searching for a specific bogie ID
 * using the Binary Search algorithm on sorted data.
 *
 * At this stage, the application:
 * - Creates sorted bogie ID array
 * - Defines search key
 * - Applies binary search logic
 * - Narrows search range each iteration
 * - Displays result
 *
 * This maps optimized searching logic using divide-and-conquer.
 *
 * @author Developer
 * @version 19.0
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
		
		// Binary Search Logic
		boolean found = false;
		int left = 0;
		int right = bogieNames.size() - 1;
		
		while (left <= right) {
			int mid = left + (right - left) / 2;
			String midValue = (String) bogieNames.get(mid);
			
			if (midValue.equals(searchKey)) {
				found = true;
				break;
			} else if (midValue.compareTo(searchKey) < 0) {
				left = mid + 1; // Search in the right half
			} else {
				right = mid - 1; // Search in the left half
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