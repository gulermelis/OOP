public class Product {
	
	private String pId;
	private String pName;
	private String description;
	private double price;
	

	
	public Product(String pId,String pName,double price) {
		this.pId=pId;
		this.pName=pName;
		this.price=price;
	}
	//Getter-setter methods
	public String getpId() {
		return pId;
	}
	public void setpId(String pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + ", description=" + description + ", price=" + price + "]";
	}


		

	}



