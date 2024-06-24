package mainApplication;

import java.util.Scanner;

import airlineClassImplementation.Airline;
import flightClassImplementation.Flight;
import passengerClassImplementation.Passenger;
import stringUtilityClassImplementation.StringUtil;
import wrapperUtilityClassImplementation.WrapperUtil;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        Airline airline = new Airline(null, null, 0, 0);

        while (true) {

            System.out.println("1. Add Flight");
            System.out.println("2. Remove Flight");
            System.out.println("3. Register Passenger");
            System.out.println("4. Unregister Passenger");
            System.out.println("5. Book Flight");
            System.out.println("6. Cancel Booking");
            System.out.println("7. List Available Flights");
            System.out.println("8. List Booked Flights");
            System.out.println("9. String Utilities");
            System.out.println("10. Wrapper Utilities");
            System.out.println("11.Exit");
            System.out.println("12. Enter Your Choice:");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter flight number:");
                    String flightNumber = sc.next();
                    System.out.println("Enter origin:");
                    String origin = sc.next();
                    System.out.println("Enter destination:");
                    String destination = sc.next();
                    System.out.println("Enter departure time:");
                    String departureTime = sc.next();
                    System.out.println("Enter arrival time:");
                    String arrivalTime = sc.next();
                    Flight flight = new Flight(flightNumber, origin, destination, departureTime, arrivalTime);
                    airline.addFlight(flight);
                    break;

                case 2:
                	System.out.println("Enter flight number to remove:");
                    String removeFlightNumber = sc.next();
                    airline.removeFlight(removeFlightNumber);
                    break;
                    
                case 3:
                    System.out.println("Enter passenger name:");
                    String passengerName = sc.next();
                    System.out.println("Enter passport number:");
                    String passportNumber = sc.next();
                    Passenger passenger = new Passenger(passengerName, passportNumber);
                    airline.registerPassenger(passenger);
                    break;

                case 4:
                    System.out.println("Enter passport number to unregister:");
                    String unregisterPassportNumber = sc.next();
                    airline.unregisterPassenger(unregisterPassportNumber);
                    break;
                    
                case 5:
                    System.out.println("Enter passport number:");
                    String bookPassportNumber = sc.next();
                    System.out.println("Enter flight number:");
                    String bookFlightNumber = sc.next();
                    airline.bookFlight(bookPassportNumber, bookFlightNumber);
                    break;

                case 6:
                    System.out.println("Enter passport number:");
                    String cancelPassportNumber = sc.next();
                    System.out.println("Enter flight number:");
                    String cancelFlightNumber = sc.next();
                    airline.cancelBooking(cancelPassportNumber, cancelFlightNumber);
                    break;

                case 7:
                    airline.listAvailableFlights();
                    break;

                case 8:
                    airline.listBookedFlights();
                    break;

                case 9:
                    System.out.println("1. Count occurrences of a character");
                    System.out.println("2. Reverse a string");
                    System.out.println("3. Check if a string is a palindrome");
                    System.out.println("4. Capitalize words in a string");
                    System.out.println("5. Enter Your Choice:");
                    int stringChoice = sc.nextInt();
                    switch (stringChoice) {
                        case 1:
                            System.out.println("Enter a string:");
                            String str = sc.next();
                            System.out.println("Enter a character:");
                            char ch = sc.next().charAt(0);
                            System.out.println("Occurrences of " + ch + ": " + StringUtil.countOccurrences(str, ch));
                            break;

                        case 2:
                            System.out.println("Enter a string:");
                            String reverseStr = sc.next();
                            System.out.println("Reversed string: " + StringUtil.reverseString(reverseStr));
                            break;

                        case 3:
                            System.out.println("Enter a string:");
                            String palindromeStr = sc.next();
                            System.out.println("Is palindrome: " + StringUtil.isPalindrome(palindromeStr));
                            break;

                        case 4:
                            System.out.println("Enter a string:");
                            String capitalizeStr = sc.next();
                            System.out.println("Capitalized string: " + StringUtil.capatalizeWords(capitalizeStr));
                            break;
                    }
                    break;

                case 10:
                    System.out.println("1. Find max in an array of integers");
                    System.out.println("2. Calculate average of an array of doubles");
                    System.out.println("3. Convert binary string to Boolean array");
                    System.out.println("4. Convert Boolean array to binary string");
                    System.out.println("5. Enter Your Choice:");
                    int wrapperChoice = sc.nextInt();

                    switch (wrapperChoice) {
                        case 1:
                            System.out.println("Enter an array of integers:");
                            Integer[] integers = new Integer[5];
                            for (int i = 0; i < 5; i++) {
                                integers[i] = sc.nextInt();
                            }
                            System.out.println("Max: " + WrapperUtil.findMax(integers));
                            break;

                        case 2:
                            System.out.println("Enter an array of doubles:");
                            Double[] doubles = new Double[5];
                            for (int i = 0; i < 5; i++) {
                                doubles[i] = sc.nextDouble();
                            }
                            System.out.println("Average: " + WrapperUtil.calculateAverage(doubles));
                            break;

                        case 3:
                            System.out.println("Enter a binary string:");
                            String binaryString = sc.next();
                            Boolean[] booleanArray = WrapperUtil.convertToBooleanArray(binaryString);
                            System.out.println("Boolean array: " + booleanArray);
                            break;

                        case 4:
                            System.out.println("Enter a Boolean array:");
                            Boolean[] booleanArray2 = new Boolean[5];
                            for (int i = 0; i < 5; i++) {
                                booleanArray2[i] = sc.nextBoolean();
                            }
                            System.out.println("Binary string: " + WrapperUtil.convertToBinaryString(booleanArray2));
                            break;
                    }
                    break;

                case 11:
                    System.exit(0);
                    break;
            }
        }
    }
}