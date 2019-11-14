
public class Card {
	
	private int cardNum;
	private String validDate;
	private int CVSNum;

	public Card(int cardNum, String validDate, int CVSNum) {
		
		this.cardNum=cardNum;
		this.validDate=validDate;
		this.CVSNum=CVSNum;
		// TODO Auto-generated constructor stub
	}
	public int getCardNum() {
		return cardNum;
	}
	public void setCardNum(int cardNum) {
		this.cardNum = cardNum;
	}
	public String getValidDate() {
		return validDate;
	}
	public void setValidDate(String validDate) {
		this.validDate = validDate;
	}
	public int getCVSNum() {
		return CVSNum;
	}
	public void setCVSNum(int cVSNum) {
		CVSNum = cVSNum;
	}
	
	public void payment() {
		System.out.println("odeme onaylandý");
		
	}
}



