import java.util.Scanner;

/**
 * ======================================================================
 * MAIN CLASS - UseCase11TrainConsistMgmnt
 * ======================================================================
 *
 * Use Case 11: Validate Train ID and Cargo Code
 *
 * Description:
 * This class validates input formats using Regular Expressions.
 *
 * At this stage, the application:
 * - Accepts Train ID input
 * - Accepts Cargo Code input
 * - Applies regex validation
 * - Displays validation result
 *
 * This maps format validation logic using Pattern matching.
 *
 * @author Developer
 * @version 11.0
 */

class Main {

	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);

		// accept input
		System.out.println("Enter Train ID (Format: TRN-1234):");
		String trainId = sc.nextLine();
		
		System.out.println("Enter Cargo Code (Format: PET-AB): ");
		String cargoCode = sc.nextLine();
		
		// validate input using regex
		boolean isTrainIdValid = trainId.matches("TRN-\\d{4}");
		boolean isCargoCodeValid = cargoCode.matches("PET-[A-Z]{2}");
		
		// display results
		System.out.println("Train ID Validation: " + (isTrainIdValid ? "true" : "false"));
		System.out.println("Cargo Code Validation: " + (isCargoCodeValid ? "true" : "false"));
        
		System.out.println();
		System.out.println("Operations completed successfully!");

	}
}