# TrainConsistManagementApp
The Train Consist Management App is a console-based Java application that simulates how a railway system manages a train’s consist, which is a collection of bogies attached to an engine.  The application supports: 1. Passenger bogies (Sleeper,AC Chair,First Class) with seat capacity tracking. 2. Goods bogies with cargo type and safety constraints.

## UC1: Initialize Train and Display Consist Summary

+ Initializes the Train Consist Management Application and displays a welcome banner when the program starts.
+ Creates a dynamic data structure using ArrayList to store train bogies.
+ Demonstrates the use of the Java Collections Framework with List<String>.
+ Initializes the train consist as an empty list, representing a newly created train.
+ Sets the initial bogie count to 0 to indicate that no bogies are attached yet.
+ Displays the initial state of the train consist to the user.
+ Uses Scanner to prepare the application for future user input operations.
+ Illustrates basic program startup flow and system initialization.
+ Provides a simple foundation for future train consist operations such as adding or removing bogies.
+ Confirms that the system is ready for further management operations.

## UC2: Add Passenger Bogies to Train (ArrayList Operations)

+ Demonstrates dynamic management of passenger bogies using ArrayList.
+ Initializes an empty List<String> to represent passenger bogies in the train.
+ Adds different bogie types such as Sleeper, AC Chair, and First Class using add().
+ Displays the train consist after adding bogies to show list insertion.
+ Removes a bogie (AC Chair) using the remove() method.
+ Prints the updated list after removal to reflect the change.
+ Uses the contains() method to check if a specific bogie type exists.
+ Demonstrates basic CRUD operations (Create, Read, Update, Delete) with ArrayList.
+ Displays the final passenger bogie configuration of the train.
+ Confirms that all train consist operations executed successfully.

## UC3: Track Unique Bogie IDs (Set – HashSet)

+ Demonstrates how unique bogie IDs can be managed using the HashSet collection.
+ Initializes a Set<String> to store bogie identifiers for the train.
+ Adds bogie IDs such as BG101, BG102, and BG103 using the add() method
+ Displays the set of bogie IDs after initial insertion.
+ Attempts to insert duplicate bogie IDs into the set.
+ Shows that HashSet automatically prevents duplicate entries.
+ Ensures data uniqueness and integrity in the train consist.
+ Demonstrates the Set data structure property of storing unique elements only.
+ Prints informative messages explaining how duplicates are handled.
+ Confirms that the bogie ID tracking operations completed successfully.

## UC4: Maintain Ordered Bogie IDs (TreeSet & SortedSet)

+ Demonstrates how ordered train bogies can be managed using a LinkedList.
+ Initializes a LinkedList to represent the sequential structure of a train consist.
+ Adds bogies such as Engine, Sleeper, AC, Cargo, and Guard using add().
+ Displays the initial train consist to show the insertion order.
+ Inserts a Pantry Car at a specific position using indexed insertion.
+ Shows how LinkedList supports positional operations efficiently.
+ Removes the first and last bogies using removeFirst() and removeLast().
+ Prints the updated train consist after modifications.
+ Demonstrates dynamic restructuring of train bogies similar to real train coupling and decoupling.
+ Confirms that all train consist operations executed successfully.

## UC5: Preserve Insertion Order of Bogies (LinkedHashSet)

+ Demonstrates the use of LinkedHashSet to manage train bogies while preserving insertion order.
+ Initializes a Set<String> using LinkedHashSet to store the train formation.
+ Adds bogies such as Engine, Sleeper, Cargo, and Guard to the formation.
+ Attempts to add duplicate bogies to illustrate how duplicates are handled.
+ Shows that LinkedHashSet automatically prevents duplicate entries.
+ Maintains the exact order in which bogies were inserted.
+ Displays the final train formation with unique and ordered elements.
+ Demonstrates a combination of Set uniqueness and List-like ordering behavior.
+ Helps simulate real-world train attachment order management.
+ Confirms that the ordered uniqueness operations completed successfully.

## UC6: Map Bogie to Capacity (HashMap)

+ Demonstrates how bogie capacity information can be managed using a HashMap.
+ Initializes a Map<String, Integer> to represent bogie type and its capacity.
+ Uses the key–value mapping structure where the bogie name is the key and capacity is the value.
+ Adds entries such as First Class, Cargo, Sleeper, and AC Chair using put().
+ Stores seating or load capacity values associated with each bogie type.
+ Displays the complete bogie–capacity mapping stored in the HashMap.
+ Demonstrates how HashMap enables fast lookup and retrieval of values using keys.
+ Illustrates the concept of associative data storage in Java Collections.
+ Provides a simple model for managing train resource information efficiently.
+ Confirms that the bogie capacity mapping operations completed successfully.
