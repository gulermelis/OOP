
public class Ford extends Araba
{
	 private int devirSayisi;
	
	 public Ford(int devirSayisi)
	 {
		 this.devirSayisi = devirSayisi;
	 }
	 
	 public int getDevirSayisi() 
	 {
	    return devirSayisi;
	 }
	 
	 public void setDevirSayisi(int devirSayisi) 
	 {
	     this.devirSayisi = devirSayisi;
	 }

	@Override
	public int saateYaktigiBenzinLitresi() {
		// TODO Auto-generated method stub
		return getAgirlik()*1;

	}

}
