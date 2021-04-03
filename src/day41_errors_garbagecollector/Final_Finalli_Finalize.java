package day41_errors_garbagecollector;

public class Final_Finalli_Finalize {
	
	final static int SAYI2=20; // Final ve static yazinca ismini mavi ve bold yapar.
	// Bizde final ve static olunca ismini buyuk yaziyoruz.
	// Neden ? Cunku baskasi gorurse eger final ve static old. anlasin diye.
	// Final variable'lar static olarak tanimlansa bile degistirilemez
	// Bizde convention olarak  buyuk harfle yazariz
	
	public static void main(String[] args) {
		
		final int sayi = 10;
		// sayi+=2; Java buna itiraz ediyor cunku final ile tanimlamisim yani o deger final deger oluyor, daha baska islem yapamam.
	}

	/*
	   Interview Question : "final", "finally " ve "finalize " nedir?
	   - Final keyword, finally kod blogu, finalize ise method’dur.
	   
	   - Finally kod blogu try veya try-catch bloklari ile kullanilir. Try-catch’in sonucu ne
	   olursa olsun calisir. Genellikle database veya cloud ile connection’in
	   sonlandirilmasi, calisilan file’in kapanmasi gibi islemler yapar.
	   
	   - Finalize garbage collector kullanilmayan objeleri destroy etmeden once kullanilir
	   
	   - Final variable -> Degeri degistirilmeyecek (constact) variable'lar icin kullanilir,
	    mutlaka deger atanmalidir, isimleri buyuk harfle yazilir (optional)
	    
	    - Final Methods -> Override edilemeyecek method
	    
	    - Final Classes -> Inherit edilemeyecek class
	   
	 */
}
