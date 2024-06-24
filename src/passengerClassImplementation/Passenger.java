package passengerClassImplementation;

import java.util.Arrays;
import java.util.Objects;

import flightClassImplementation.Flight;

public class Passenger {
	
	private String name;
    private String passportNumber;
    private Flight[] bookedFlights;
    private int bookedFlightCount;
    
	public Passenger(String name, String passportNumber) {
		super();
		this.name = name;
		this.passportNumber = passportNumber;
		this.bookedFlights = new Flight[10];
		this.bookedFlightCount = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public Flight[] getBookedFlights() {
		return bookedFlights;
	}

	public void setBookedFlights(Flight[] bookedFlights) {
		this.bookedFlights = bookedFlights;
	}

	public int getBookedFlightCount() {
		return bookedFlightCount;
	}

	public void setBookedFlightCount(int bookedFlightCount) {
		this.bookedFlightCount = bookedFlightCount;
	}

	@Override
	public String toString() {
		return "passenger [name=" + name + ", passportNumber=" + passportNumber + ", bookedFlights="
				+ Arrays.toString(bookedFlights) + ", bookedFlightCount=" + bookedFlightCount + "]";
	}
 
	public void bookFlight(Flight flight) {
        bookedFlights[bookedFlightCount] = flight;
        bookedFlightCount++;
  }

    public void cancelBooking(Flight flight) {
        for (int i = 0; i < bookedFlightCount; i++) {
           if (bookedFlights[i].getFlightNumber().equals(flight.getFlightNumber())) {
               bookedFlights[i] = null;
               bookedFlightCount--;
               return;
            }
        }
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(bookedFlights);
		result = prime * result + Objects.hash(bookedFlightCount, name, passportNumber);
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
		Passenger other = (Passenger) obj;
		return bookedFlightCount == other.bookedFlightCount && Arrays.equals(bookedFlights, other.bookedFlights)
				&& Objects.equals(name, other.name) && Objects.equals(passportNumber, other.passportNumber);
	}
    
    
}
