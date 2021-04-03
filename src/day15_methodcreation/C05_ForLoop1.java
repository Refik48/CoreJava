package day15_methodcreation;

public class C05_ForLoop1 {

	public static void main(String[] args) {
		// 5 defa Hello World yazdiralim
		/*
		System.out.println("Hello World"); // 1
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World"); // 5
        */
		// Bunun yerine loop kullaniyoruz
		// ne yapacagimizi java'ya soyluyoruz, kac kere yapmasi gerektigini de soyluyoruz
		
		//Tum Loop'larda 3 seyi yazmak zorundayiz
		// 1) Baslangic Degeri
		// 2) Bitis Degeri
		// 3) Artis Degeri
		
		for(int i=1; i<=5 ; i++) {
			System.out.println(i +  " Hello World");			
		}
              System.out.println("Kod calisti");
		// Not : Eger sart kismi bizim artisimiza gore hep true verirse loop sonsuz donguye girer .
		// Not : Loop artis degeri pozitif old. gibi negatif de olabilir i-- 
		// Sonsuz Loop'a sokma pc kasiyor
		// Artis degeri 1 olmak zorunda degil, farkli da olabilir
		// Not : Eger Loop'un sarti hic true olmaz ise loop body hic devreye girmez
        // i=1 yazisi baslangici belirler , i<=5 nereye kadar yazilacagini belirler ,
        // i++ artis araliklarini belirler
        //
	}
}

