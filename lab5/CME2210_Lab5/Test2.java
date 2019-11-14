
public class Test2 {

	public static void main(String[] args) {
		
		 Araba ford = new Ford(4);
		 ford.setAgirlik(1000);
		 ford.setModel("Fiesta");
		 ford.setRenk("Gri");
		 
		 
		 
		 
		 Araba mercedes=new Mercedes(20);
		 mercedes.setAgirlik(2000);
		 mercedes.setModel("E200");
		 mercedes.setRenk("Siyah");
		 
		 Araba arabalar[]=new Araba[]{ford, mercedes};
		 KullaniciEkrani ekran =new KullaniciEkrani();
		 ekran.goster(arabalar);

		 
		 
	}

}
