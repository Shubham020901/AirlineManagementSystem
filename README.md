**Problem Statement: Airline Management System**

**Objective**

Design and implement an Airline Management System using Object-Oriented Programming (OOP) concepts in Java. The system should allow management of flights, passengers, and bookings.

**Step 1: Flight Class Implementation**

**1.	Create a Flight class with the following attributes:**

o	String flightNumber: Unique identifier for each flight.
o	String origin: Departure location of the flight.
o	String destination: Arrival location of the flight.
o	String departureTime: Time of departure.
o	String arrivalTime: Time of arrival.
o	boolean isAvailable: Indicates whether the flight is available for booking.

**2.	Implement the following methods in the Flight class:**

o	Constructor to initialize the flight details.
o	Getters and setters for all attributes.
o	toString() method to provide a string representation of the flight details.
o	bookFlight(): Sets the isAvailable status to false when booked.
o	cancelBooking(): Sets the isAvailable status to true when canceled.

**Step 2: Passenger Class Implementation**

**1.	Create a Passenger class with the following attributes:**

o	String name: Name of the passenger.
o	String passportNumber: Passport number of the passenger.
o	Flight[] bookedFlights: Array to store booked flights.
o	int bookedFlightCount: Number of flights booked by the passenger.

**2.	Implement the following methods in the Passenger class:**

o	Constructor to initialize the passenger details.
o	Getters and setters for all attributes.
o	toString() method to provide a string representation of the passenger details.
o	bookFlight(Flight flight): Books a flight for the passenger and updates the booked flights array.
o	cancelBooking(Flight flight): Cancels a booked flight for the passenger and updates the booked flights array.

****Step 3: Airline Class Implementation**

**1.	Create an Airline class to manage flights and passengers:****

o	Flight[] flights: Array to store flights.
o	Passenger[] passengers: Array to store passengers.
o	int flightCount: Number of flights currently in the system.
o	int passengerCount: Number of passengers currently in the system.

**2.	Implement the following methods in the Airline class:**

o	addFlight(Flight flight): Adds a new flight to the flights array.
o	removeFlight(String flightNumber): Removes a flight from the flights array based on the flight number.
o	registerPassenger(Passenger passenger): Registers a new passenger in the system.
o	unregisterPassenger(String passportNumber): Unregisters a passenger from the system based on passport number.
o	bookFlight(String passportNumber, String flightNumber): Books a flight for a passenger based on passport number and flight number.
o	cancelBooking(String passportNumber, String flightNumber): Cancels a booked flight for a passenger based on passport number and flight number.
o	listAvailableFlights(): Lists all available flights in the system.
o	listBookedFlights(): Lists all booked flights in the system.

**Step 4: String Utility Class**

**1.	Create a StringUtil class with static methods for string manipulation:**

o	countOccurrences(String str, char ch): Counts occurrences of a character in a string.
o	reverseString(String str): Reverses a given string.
o	isPalindrome(String str): Checks if a string is a palindrome.
o	capitalizeWords(String str): Capitalizes the first letter of each word in a string.

**Step 5: Wrapper Utility Class**

**1.	Create a WrapperUtil class with static methods for wrapper class operations:**

o	findMax(Integer[] numbers): Finds the maximum value in an array of integers.
o	calculateAverage(Double[] numbers): Calculates the average of an array of doubles.
o	convertToBooleanArray(String binaryString): Converts a binary string ("1101") to a Boolean array.
o	convertToBinaryString(Boolean[] booleanArray): Converts a Boolean array to a binary string.

**Step 6: Main Application**

**1.	Create a Main class with the main method to test the system:**
o	Instantiate flights, passengers, and the airline.
o	Add flights and register passengers.
o	Perform bookings and cancellations using the methods provided in the Airline class.
o	Test string manipulation and wrapper class operations using methods from StringUtil and WrapperUtil classes.
