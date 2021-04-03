package day22_constructor;

public class ParametreliCons {
	
	 String marka;
	 String model;
	 int yil;
	 boolean kazasiVarMi;
	 
	 public ParametreliCons (int yil) { // 1
		 // Default cons'u bozduk
		 this.yil=yil;
		  // 7.satirda instance yil'i var . 13. satirda da int yil var .  **********ONEMLI*************
		 // bu ikisini birbirine esitlersek ParametreliRunner'daki kod calisir ve 11. satir default (0) yerine parametre(2015) degeri yazilir. 
		 // dikkatli bakarsak yil renkleri uygun yerde ki yil renkleri ile ayni renk oldu.
	 }
	 
	 public ParametreliCons () { // 2
		 // O yuzden default cons olusturuduk.
	 }
	 
	 public ParametreliCons(String Marka,String Model) { //3
	        
	  }
	  public ParametreliCons(String marka, String model,int yil, boolean kazasiVarMi) { //4
	        this.marka=marka;
	        this.model=model;
	        this.yil=yil;
	        this.kazasiVarMi=kazasiVarMi;
	  }

	 public void yakit(String yakit) { // method
		 
	    System.out.println("Araba yakit olarak " + yakit  + " kullanir");
	    
    }
	    
	 public void vites(String vites) { // method
		 
	    System.out.println("Araba " + vites + " viteslidir");
	    
    }

}
