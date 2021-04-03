package day22_constructor;

public class CarUret {
	
	String marka; // Ben bunu Static yaparsam eger / Yeni marka atadigimda butun markalarin degeri degisir o yuzden Static kullanmiyoruz.
	String model;
	int yil;
	boolean kazasiVarMi;

	// Bir programda cok fazla uretecegimiz objeler icin bir tane class olustururuz
	// Bu class'da olusturulacak objelere ait tum ozellikler olur
	// Bu class direkt olarak calistirilmayacagi icin main method olmasa da olur.
	// (Kaliphane gibir)
	// Bir class olusturuldugunda Java bu class'dan object uretilecegini bilir ve gorunmeyen DEFAULT CONSTRUCTOR'i class'a yerlestirir.
	// Default constructor parametresizdir dolayisiyla sadece hic bir ozelligi tanimlanamayan objeler uretir 
	// Default Constructor ile uretilen bir objenin tum ozellikleri sonradan tanimlanmalidir.
	
	// Eger biz sonradan consructor yazarsak, Java default constructor'i iptal eder.
	// Bir cons olusturalim.
	 public CarUret() { // Burada Constructor urettim o yuzden BODY'SI OLMAK ZORUNDA.
		// Cons class ismi ayni olmalidir buyuk harfle baslar, methodlar kucuk harfle baslar.
		// methodlarin return type olmasi lazim, cons'larin yoktur.
		//
	}
	 
	/*
	 * Kural 1 - Ismi class ile ayni olmalidir(Dolayisiyla buyuk harfle baslar)
	 * 2 - Constructor return type'a sahip degildir.
	 * 3 - Constructor isminden sonra mutlaka parantez olmalidir () ama parametre olmasi zorunlu degildir.
	 * 4 - Bir cons olusturuldugunda kimlerin kullanacagini belirlemek icin access modifier yazilabilir.
	 * 5 - Public yazabiliriz . Private yazarsak baska class'larda kullanamayiz sadece o class'a ozel olur.
	 * 6 - public= her class da
     *     private = ayni class icinde
     *     default = ayni package icinde
	 */
	 
	public void yakit(String yakit) { // method
		System.out.println("Araba yakit olarak " + yakit + " kullanilir");
	}
	   
	public void vites(String vites) { // method
		System.out.println("Araba " + vites + " viteslidir");
	} 

}
