
public class Mercedes extends Araba
{
	 private int cantKalinligi;
	
	 public Mercedes(int cantKalinligi)
	 {
		 this.cantKalinligi = cantKalinligi;
	 }
	 
	 public int getCantKalinligi() 
	 {
	     return cantKalinligi;
	 }
	 
	 public void setCantKalinligi(int cantKalinligi) 
	 {
	     this.cantKalinligi = cantKalinligi;
	 }

	@Override
	public int saateYaktigiBenzinLitresi() {
		// TODO Auto-generated method stub
		return getAgirlik()*2;
	}

}
