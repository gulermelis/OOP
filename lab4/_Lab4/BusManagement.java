package _Lab4;

import java.util.Scanner;

public class BusManagement 
{
	private Bus bus;
	private Scanner scn;
	
	public BusManagement(String plate, int seatCount)
	{
		bus = new Bus(plate, seatCount);
		scn = new Scanner(System.in);
		
		
		int selection = 0;
		
		do{
			
			printMenu();
			selection = scn.nextInt();
			
			if(selection == 1)
			{
				int seatID = 0;
				
				do{
					
					System.out.print("Enter a seat number :");
					seatID = scn.nextInt();
					
				}while(bus.getSeats().get(seatID-1).isStatus());
				
				System.out.print("Enter the passenger name: ");
				String name = scn.next();
				
				System.out.print("Enter the passenger surname: ");
				String surname = scn.next();
				
				System.out.print("Enter the passenger gender: ");
				String gender = scn.next();
				
				System.out.print("Enter the phone countrycode: ");
				String countrycode = scn.next();
				
				System.out.print("Enter the passenger code: ");
				String code = scn.next();
				
				String number = "";
				
				do{
					System.out.print("Enter the passenger number: ");
					number = scn.next();
				
				}while(number.length() != 7);
				
				System.out.print("Enter the phone type: ");
				String type = scn.next();
				
				bus.bookSeat(new Passenger(name, surname, gender, new Phone(countrycode, code, number, type)), seatID);
				
			}
			else if(selection == 2)
			{
				System.out.println(bus.printAllPassengers());
			}
			else if(selection == 3)
			{
				System.out.println(bus.printAllAvailableSeatIDs());
			}
			else if(selection == 4)
			{
				System.out.print("Enter the passenger name: ");
				String name = scn.next();
				
				System.out.print("Enter the passenger surname: ");
				String surname = scn.next();
				
				Phone p = bus.search(name, surname);
				
				System.out.println(p == null ? "This passenger cannot be found" : p );
			}
			
			
		}while(selection != 5);
		
	}

	public void printMenu()
	{
		System.out.println("     MENU");
		System.out.println("1) Book a seat ");
		System.out.println("2) Display all passengers with their seat numbers");
		System.out.println("3) Display all available seatIDs");
		System.out.println("4) Search");
		System.out.println("5) Exit");
		System.out.print("Enter an operaton :");
	}
	
	
	
}
