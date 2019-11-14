package _Lab4;

import java.util.ArrayList;
import java.util.List;

public class Bus 
{
	private String plate;
	private int seatCount;
	private List<Seat> seats;
	
	public Bus(String plate, int seatCount) 
	{
		this.plate = plate;
		this.seatCount = seatCount;
		this.seats = new ArrayList<Seat>();
		
		for(int i=0;i<seatCount;i++)
		{
			this.seats.add(new Seat(i+1, false, null));
		}
	}

	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}

	public int getSeatCount() {
		return seatCount;
	}

	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}

	public List<Seat> getSeats() {
		return seats;
	}

	public void setSeats(List<Seat> seats) {
		this.seats = seats;
	}
	
	public void bookSeat(Passenger p, int seatID)
	{
		this.seats.get(seatID-1).setPassenger(p);
		this.seats.get(seatID-1).setStatus(true);
	}
	
	public String printAllPassengers()
	{
        String retVal = "";
        
        for(int i=0;i<this.seats.size();i++)
        {
        	if(this.seats.get(i).isStatus())
        	{
        		retVal += this.seats.get(i).toString() + "\n";
        	}
        }
        
        return retVal;
	}
	
	public String printAllAvailableSeatIDs()
	{
        String retVal = "";
        
        for(int i=0;i<this.seats.size();i++)
        {
        	if(!this.seats.get(i).isStatus())
        	{
        		retVal += this.seats.get(i).getSeatID() + ", ";
        	}
        }
        
        return retVal;
	}
	
	public Phone search(String name, String surname)
	{
		Phone p = null;
		for(int i=0;i<this.seats.size();i++)
        {
        	if(this.seats.get(i).isStatus() &&
        	   this.seats.get(i).getPassenger().getName().equalsIgnoreCase(name) &&
        	   this.seats.get(i).getPassenger().getSurname().equalsIgnoreCase(surname))
        	{
        		p =  this.seats.get(i).getPassenger().getPhone();
        		break;
        	}
        }
		
		return p;
	}
	
}



