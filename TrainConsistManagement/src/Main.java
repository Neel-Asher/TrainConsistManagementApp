import java.util.List;

/**
 * ======================================================================
 * MAIN CLASS - UseCase13TrainConsistMgmnt
 * ======================================================================
 *
 * Use Case 13: Performance Comparison (Loops vs Streams)
 *
 * Description:
 * This class compares execution time of loop-based filtering
 * versus stream-based filtering using System.nanoTime().
 *
 * At this stage, the application:
 * - Creates bogie test dataset
 * - Measures loop execution time
 * - Measures stream execution time
 * - Calculates elapsed duration
 * - Displays performance results
 *
 * This maps performance benchmarking using high-resolution timing.
 *
 * @author Developer
 * @version 13.0
 */

class Main {
	
	static class Bogie {
		String type;
		int capacity;
		
		Bogie(String type, int capacity) {
			this.type = type;
			this.capacity = capacity;
		}
	}

	public static void main (String[] args) {
		
		// Create large test dataset of bogies
		List<Bogie> bogies = List.of(
			new Bogie("Passenger", 100),
			new Bogie("Cargo", 50),
			new Bogie("Passenger", 120),
			new Bogie("Cargo", 80),
			new Bogie("Passenger", 90)
		);
		
		// Measure loop execution time (ns)
		long startLoop = System.nanoTime();
		for (Bogie bogie : bogies) {
			if (bogie.type.equals("Passenger") && bogie.capacity > 100) {
				// Simulate processing
			}
		}
		long endLoop = System.nanoTime();
		long loopDuration = endLoop - startLoop;
		System.out.println("Loop-based filtering time: " + loopDuration + " ns");
		
		// Measure stream execution time (ns)
		long startStream = System.nanoTime();
		bogies.stream()
			.filter(b -> b.type.equals("Passenger") && b.capacity > 100)
			.forEach(b -> {
				// Simulate processing
			});
		long endStream = System.nanoTime();
		long streamDuration = endStream - startStream;
		System.out.println("Stream-based filtering time: " + streamDuration + " ns");
		
		
		System.out.println();
		System.out.println("Operations completed successfully!");

	}
}