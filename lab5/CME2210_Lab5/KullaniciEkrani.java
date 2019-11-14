
public class KullaniciEkrani 
{
	public void goster(Araba[] arabalar)
	{
		 for (int i = 0; i < arabalar.length; i++) 
		 {
		 Araba araba = arabalar[i];
		 System.out.println("Agirlik : "+araba.getAgirlik());
		 System.out.println("Model : "+araba.getModel());
		 System.out.println("Renk : "+araba.getRenk());
		 
		 
		 if(araba.getClass().getName().equals("Ford"))
		    System.out.println(((Ford) araba).getDevirSayisi());
		 
		 if(araba.getClass().getName().equals("Mercedes"))
		    System.out.println(((Mercedes) araba).getCantKalinligi());
		 
		 System.out.println("Yaktigi Lt. Benzin : "+araba.saateYaktigiBenzinLitresi());
	    }
	}
}
