package day29_passbyvalueimmutable;

public class C2_PassByValue02 {

	public static void main(String[] args) {
		//Soru2 : Verilen bir fiyat icin %10 , %20, %25 indirim yapan uc method olusturun.
		  //- Method’da indirim uygulayip fiyati main method’da yazdirin
		  //- Method’lari arka arkaya cagirip dogru calistiklarini kontrol edin

		double fiyat = 100;
		System.out.println("%10 indirimli fiyat : " + indirimUygula10(fiyat)); // 90
		System.out.println("%20 indirimli fiyat : " + indirimUygula20(fiyat)); // 80
		System.out.println("%25 indirimli fiyat : " + indirimUygula25(fiyat)); // 75
		System.out.println("Method call'dan sonra fiyat : "  + fiyat); // 100
		
		/*
		 * Java Clone fiyatlar olusturuyor sonra onlari methodlara yolluyor . Yani orjinal fiyat(lar)ima bir sey olmuyor bkz:14.satir
		 * Java 11. satira gidiyor bakiyor orada method call var, hemen fiyat icin bir clone uretiyor ve onu method'a yolluyor.
		 * Clone ustunden method icinde islemler uyguluyor daha sonra method bitimine gelince clone olan fiyati yerine koyuyor ve sonuc ekranina
		 * yazdiriyor . Her method call icin ayri ayri clone'lar olusturuyor ve hic biri birbirini etkilemiyor. 
		 * Methodun saginda yazan parantez icindeki fiyat ile 
		 */
	}

	public static double indirimUygula25(double fiyat) {
		
		fiyat*=0.75;
		
		return fiyat;
	}

	public static double indirimUygula20(double fiyat) {
		
		fiyat*=0.80;
		
		return fiyat;
	}

	public static double indirimUygula10(double fiyat) {
		
		fiyat*=0.90;
		
		return fiyat;
	}

}
