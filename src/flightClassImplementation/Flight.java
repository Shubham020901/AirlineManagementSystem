package flightClassImplementation;

import java.util.Objects;

public class Flight {
	
	private String flightNumber;
    private String origin;
    private String destination;
    private String departureTime;
    private String arrivalTime;
    private boolean isAvailable;
    
	public Flight(String flightNumber, String origin, String destination, String departureTime, String arrivalTime) {
		super();
		this.flightNumber = flightNumber;
		this.origin = origin;
		this.destination = destination;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.isAvailable = true;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	@Override
	public String toString() {
		return "Flight [flightNumber=" + flightNumber + ", origin=" + origin + ", destination=" + destination
				+ ", departureTime=" + departureTime + ", arrivalTime=" + arrivalTime + ", isAvailable=" + isAvailable
				+ "]";
	}
    
	 public void bookFlight() {
	        isAvailable = false;
	    }

	    public void cancelBooking() {
	        isAvailable = true;
	    }

		@Override
		public int hashCode() {
			return Objects.hash(arrivalTime, departureTime, destination, flightNumber, isAvailable, origin);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Flight other = (Flight) obj;
			return Objects.equals(arrivalTime, other.arrivalTime) && Objects.equals(departureTime, other.departureTime)
					&& Objects.equals(destination, other.destination)
					&& Objects.equals(flightNumber, other.flightNumber) && isAvailable == other.isAvailable
					&& Objects.equals(origin, other.origin);
		} 
	    
	    
}
