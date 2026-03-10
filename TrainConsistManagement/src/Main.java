import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * ======================================================================
 * MAIN CLASS - UseCase1TrainConsistMgmnt
 * ======================================================================
 *
 * Use Case 1: Initialize Train and Display Consist Summary
 *
 * Description:
 * This class represents the entry point of the Train Consist
 * Management Application.
 *
 * At this stage, the application:
 * - Creates an empty train consist
 * - Uses a dynamic List to store bogies
 * - Displays initial bogie count
 * - Prints the current state of the train
 *
 * This use case introduces collection initialization and
 * basic program startup flow.
 *
 * @author Developer
 * @version 1.0
 */

public class Main {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Display Welcome Banner
		System.out.println("======================================");
		System.out.println("==== Train Consist Management App ====");
		System.out.println("======================================");
		System.out.println();
		
		// Create a dynamic list to store train bogies
		List<String> trainConsist = new ArrayList<>();
		
		// Display initial consist information
		System.out.println("Train initialized successfully!");
		System.out.println();
		
		int bogieCount = 0;
		System.out.println("Initial Bogie Count: "+bogieCount);
		System.out.println("Initial Train Consist: "+trainConsist);
		System.out.println();
		
		System.out.println("System ready for operations!");
	}
}