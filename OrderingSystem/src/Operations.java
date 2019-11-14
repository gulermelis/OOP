import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Operations {
	
	 List<OnlineCustomer> cust_list;
     List<Product> product_list;
    List<Product> order_list;

  

	
    Scanner scn=new Scanner(System.in);
	public Operations() 
	{       
		//müþteri kaydý oluþturulmak için bellekte yer ayrýldý.
		cust_list=new ArrayList<OnlineCustomer>();
		product_list=new ArrayList<Product>();
		order_list=new ArrayList<Product>();
		scn=new Scanner(System.in);
		// simdilik listene goruntulenecek bir kac urun eklendi
				product_list.add( new Product("1","kingburger",15.0) ) ;
				product_list.add( new Product("2","bigburger",25.0) ) ;
				product_list.add( new Product("3","steakhouseburger",27.0) ) ;
			
		
	}
	
	//-------sepete ekle-------
	public void addToCard(Product p) { 
		this.order_list.add(p);
	
		
	 };
	 
 //--sepettekileri urunleri ve toplam tutarý goruntuler-----
	 public String buyPage() {
			
		   String retval="";
		   int total = 0;
			for(int i=0;i<order_list.size();i++) {
				retval+= order_list.get(i).toString() + "\n";
				
			}
			
			
			for(int i=0;i<order_list.size();i++) {
				int araToplam=(int) order_list.get(i).getPrice();
				total+=araToplam;
			}
		
			return "urunler:"+ retval +"odeneck tutar.:"+total;
		};
		
	
// -------müþteri kayýt ------------
   public void registerCustomer(String username,String password,Address address, Phone phone) {
	  String street = null;
	  String town = null;
	  String city = null;
	  String countrycode=null;
	  String code=null;
	  String number=null;
	  String type=null;
	  String addresstype=null;
	
    	   OnlineCustomer customer=new OnlineCustomer(username, password, new Address(street, town, city,addresstype),new Phone(countrycode,code,number,type));
    	   this.cust_list.add(customer); //kullanýcý listeye eklendi
    
       }
       
   
//------MUSTERÝ GÝRÝSÝ----

 	public boolean LogInCustomer(String name,String password) {
 		
 		for(int i=0; i<this.cust_list.size();i++) {
 			String n=this.cust_list.get(i).getUserName();
 			String p=this.cust_list.get(i).getPassword();
				if(n.equalsIgnoreCase(name) && p.equalsIgnoreCase(password))
				{
 	
					return true;
				
				}
				
 		}
		return false;
 	}			


 public String productsMenu()
{
	System.out.println(" MENU");
	 String retVal = "";
	    
     for(int i=0;i<product_list.size();i++)
      {
  	
  		retVal +=product_list.get(i).toString() + "\n";
  	
       }
     return retVal;
}

//-----kayýtlý kullanýclarý yazdýr------
 public String printAllCustomer() {
	   String retVal = "";
  
     for(int i=0;i<this.cust_list.size();i++)
      {
  	
  		retVal +=this.cust_list.get(i).toString() + "\n";
  	
       }
     return retVal;
     
 }


}
	

		
				
			

