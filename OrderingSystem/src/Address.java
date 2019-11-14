public class Address {
	private String street;
	private String town;
	private String city;
	private String addressType;

	public Address(String s,String t,String c,String at) {
		
		street=s;
		town=t;
		city=c;
		addressType=at;
	}
	
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}


	@Override
	public String toString() {
		return "Address [street=" + street + ", town=" + town + ", city=" + city + ", addressType=" + addressType + "]";
	}





	
	
}



