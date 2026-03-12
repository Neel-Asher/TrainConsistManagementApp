import java.util.List;

/**
 * ======================================================================
 * MAIN CLASS - UseCase16TrainConsistMgmnt
 * ======================================================================
 *
 * Use Case 16: Sort Passenger Bogies by Capacity
 *
 * Description:
 * This class demonstrates manual sorting of passenger
 * bogie capacities using the Bubble Sort algorithm
 * instead of built-in sorting utilities.
 *
 * At this stage, the application:
 * - Creates an array of capacities
 * - Compares adjacent values
 * - Swaps values when required
 * - Repeats passes until sorted
 * - Displays sorted result
 *
 * This maps algorithmic sorting logic using Bubble Sort.
 *
 * @author Developer
 * @version 16.0
 */


public class Main {

	public static void main (String[] args) {
		
		// Sample array of passenger bogie capacities
		List<Integer> capacities = List.of(50, 30, 40, 20, 60);
		System.out.println("Original Capacities: " + capacities);
		
		// Convert List to array for sorting
		Integer[] capacityArray = capacities.toArray(new Integer[0]);
		
		// Bubble Sort Algorithm
		int n = capacityArray.length;
		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j < n-i-1; j++) {
				if (capacityArray[j] > capacityArray[j+1]) {
					// Swap capacityArray[j] and capacityArray[j+1]
					int temp = capacityArray[j];
					capacityArray[j] = capacityArray[j+1];
					capacityArray[j+1] = temp;
				}
			}
		}
		
		// Display sorted capacities
		System.out.print("Sorted Capacities: ");
		for (int capacity : capacityArray) {
			System.out.print(capacity + " ");
		}
		
		System.out.println();
		System.out.println("Operations completed successfully!");

	}
}