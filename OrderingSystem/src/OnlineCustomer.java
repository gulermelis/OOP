import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;


public class OnlineCustomer extends Customer {
	
	private String userName;
	private String password;
	private Address address;
	private Card card;
	private Phone phone;
	

	
  
   public OnlineCustomer(String userName,String password, Address address, Phone phone) {
		this.userName=userName;
		this.password=password;
		this.address= address;
		this.phone=phone;
		//this.card=card;
		
	}
	
//GETTER-SETTER METHODS
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Card getCard() {
		return card;
	}
	public void setCard(Card card) {
		this.card = card;
	}
	
	
	
	@Override
	public String toString() {
		return "OnlineCustomer [userName=" + userName + ", password=" + password + ", address=" + address + ", card="
				+ card + ", order=" + "]";
	}
	
	
}





	
	
	
		
	

