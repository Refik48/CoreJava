package day22_constructor;

public class Otomobil {
	
	public Otomobil(String renk) { // Constructor olusturduk
		this.renk=renk;
	}
	// istersek constructor'u parametreli olarak uretebiliriz.
	// Biz bir cons olusturdugumuzda java default olani yok eder dolayisiyla biz bir cons olusturdugumuzda ,
	// mutlaka default constructor'in yerine de manuel bir cons yazmaliyiz **************ONEMLII***********************
	
	public Otomobil() { // Default Cons.
		// Yukardakini olusturunca Default Cons yok oldu o yuzden Default Cons'u manuel olarak yazmak ZORUNDAYIZ. ******ONEMLI******
	}
	
	 String renk;
	 String marka;
	 String model;
	 int yil;
	 boolean kazasiVarMi;
	   
	 public void yakit(String yakit) { // method
		 
	    System.out.println("Araba yakit olarak " + yakit  + " kullanir");
	    
    }
	    
	 public void vites(String vites) { // method
		 
	    System.out.println("Araba " + vites + " viteslidir");
	    
    }

	
}
