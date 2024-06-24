package airlineClassImplementation;

import java.util.Arrays;
import java.util.Objects;

import flightClassImplementation.Flight;
import passengerClassImplementation.Passenger;

public class Airline {
	 	
		private Flight[] flights;
	    private Passenger[] passengers;
	    private int flightCount;
	    private int passengerCount;
	    
		public Airline(Flight[] flights, Passenger[] passengers, int flightCount, int passengerCount) {
			super();
			this.flights = new Flight[10];
			this.passengers = new Passenger[10];
			this.flightCount = 0;
			this.passengerCount = 0;
		}
		
		public Flight[] getFlights() {
			return flights;
		}

		public void setFlights(Flight[] flights) {
			this.flights = flights;
		}

		public Passenger[] getPassengers() {
			return passengers;
		}

		public void setPassengers(Passenger[] passengers) {
			this.passengers = passengers;
		}

		public int getFlightCount() {
			return flightCount;
		}

		public void setFlightCount(int flightCount) {
			this.flightCount = flightCount;
		}

		public int getPassengerCount() {
			return passengerCount;
		}

		public void setPassengerCount(int passengerCount) {
			this.passengerCount = passengerCount;
		}

		public void addFlight(Flight flight) {
	        if (flightCount < 10) {
	            flights[flightCount] = flight;
	            flightCount++;
	            System.out.println("Flight added successfully");
	        } else {
	            System.out.println("Flight does not added. Please add the flight");
	        }
	    }
		
		public void removeFlight(String flightNumber) {
	        boolean found = false;
	        for (int i = 0; i < flightCount; i++) {
	            if (flights[i].getFlightNumber().equals(flightNumber)) {
	                flights[i] = null;
	                flightCount--;
	                found = true;
	                System.out.println("Flight removed successfully");
	                return;
	            }
	        }
	        if (!found) {
	            System.out.println("Flight not found");
	        }
	    }
		
		  public void registerPassenger(Passenger passenger) {
		        if (passengerCount < 10) {
		            passengers[passengerCount] = passenger;
		            passengerCount++;
		            System.out.println("Passenger registered successfully");
		        } else {
		            System.out.println("Passenger does not registered. Please register the passenger");
		        }
		    }
		
		  public void unregisterPassenger(String passportNumber) {
		        boolean found = false;
		        for (int i = 0; i < passengerCount; i++) {
		            if (passengers[i].getPassportNumber().equals(passportNumber)) {
		                passengers[i] = null;
		                passengerCount--;
		                found = true;
		                System.out.println("Passenger unregistered successfully");
		                return;
		            }
		        }
		        if (!found) {
		            System.out.println("Passenger not found");
		        }
		    }
		  
		  public void bookFlight(String passportNumber, String flightNumber) {
		        boolean passengerFound = false;
		        boolean flightFound = false;
		        for (int i = 0; i < passengerCount; i++) {
		            if (passengers[i].getPassportNumber().equals(passportNumber)) {
		                passengerFound = true;
		                for (int j = 0; j < flightCount; j++) {
		                    if (flights[j].getFlightNumber().equals(flightNumber)) {
		                        flightFound = true;
		                        if (flights[j].isAvailable()) {
		                            passengers[i].bookFlight(flights[j]);
		                            flights[j].bookFlight();
		                            System.out.println("Flight booked successfully");
		                            return;
		                        } else {
		                            System.out.println("Flight is not available");
		                            return;
		                        }
		                    }
		                }
		            }
		        }
		        if (!passengerFound) {
		            System.out.println("Passenger not found");
		        } else if (!flightFound) {
		            System.out.println("Flight not found");
		        }
		    }

		    public void cancelBooking(String passportNumber, String flightNumber) {
		        boolean passengerFound = false;
		        boolean flightFound = false;
		        for (int i = 0; i < passengerCount; i++) {
		            if (passengers[i].getPassportNumber().equals(passportNumber)) {
		                passengerFound = true;
		                for (int j = 0; j < flightCount; j++) {
		                    if (flights[j].getFlightNumber().equals(flightNumber)) {
		                        flightFound = true;
		                        passengers[i].cancelBooking(flights[j]);
		                        flights[j].cancelBooking();
		                        System.out.println("Cancelled flight booking successfully");
		                        return;
		                    }
		                }
		            }
		        }
		        if (!passengerFound) {
		            System.out.println("Passenger not found");
		        } else if (!flightFound) {
		            System.out.println("Flight not found");
		        }
		    }
/*	    
	    public void addFlight(Flight flight) {
	        flights[flightCount] = flight;
	        flightCount++;
	    }

	    public void removeFlight(String flightNumber) {
	    	for (int i = 0; i < flightCount; i++) {
	            if (flights[i].getFlightNumber().equals(flightNumber)) {
	                flights[i] = null;
	                flightCount--;
	                return;
	            }
	        }
	    }

	    public void registerPassenger(Passenger passenger) {
	        passengers[passengerCount] =passenger;
	        passengerCount++;
	    }

	    public void unregisterPassenger(String passportNumber) {
	        for (int i = 0; i < passengerCount; i++) {
	            if (passengers[i].getPassportNumber().equals(passportNumber)) {
	                passengers[i] = null;
	                passengerCount--;
	                return;
	            }
	        }
	    }

	    public void bookFlight(String passportNumber, String flightNumber) {
	        for (int i = 0; i < passengerCount; i++) {
	            if (passengers[i].getPassportNumber().equals(passportNumber)) {
	                for (int j = 0; j < flightCount; j++) {
	                    if (flights[j].getFlightNumber().equals(flightNumber)) {
	                        if (flights[j].isAvailable()) {
	                            passengers[i].bookFlight(flights[j]);
	                            flights[j].bookFlight();
	                            return;
	                        } else {
	                            System.out.println("Flight is not available");
	                            return;
	                        }
	                    }
	                }
	            }
	        }
	    }

	    public void cancelBooking(String passportNumber, String flightNumber) {
	        for (int i = 0; i < passengerCount; i++) {
	            if (passengers[i].getPassportNumber().equals(passportNumber)) {
	                for (int j = 0; j < flightCount; j++) {
	                    if (flights[j].getFlightNumber().equals(flightNumber)) {
	                        passengers[i].cancelBooking(flights[j]);
	                        flights[j].cancelBooking();
	                        return;
	                    }
	                }
	            }
	        }
	    }
*/
	    public void listAvailableFlights() {
	        for (int i = 0; i < flightCount; i++) {
	            if (flights[i].isAvailable()) {
	                System.out.println(flights[i].toString());
	            }
	        }
	    }

	    public void listBookedFlights() {
	        for (int i = 0; i < flightCount; i++) {
	            if (!flights[i].isAvailable()) {
	                System.out.println(flights[i].toString());
	            }
	        }
	    }

		@Override
		public String toString() {
			return "Airline [flights=" + Arrays.toString(flights) + ", passengers=" + Arrays.toString(passengers)
					+ ", flightCount=" + flightCount + ", passengerCount=" + passengerCount + "]";
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + Arrays.hashCode(flights);
			result = prime * result + Arrays.hashCode(passengers);
			result = prime * result + Objects.hash(flightCount, passengerCount);
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Airline other = (Airline) obj;
			return flightCount == other.flightCount && Arrays.equals(flights, other.flights)
					&& passengerCount == other.passengerCount && Arrays.equals(passengers, other.passengers);
		}
	    
	    
}
