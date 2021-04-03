package day34_inheritance;

public class Inheritance01 {

	public static void main(String[] args) {
		/*
		 * Java'da inheritance, bir objenin-class'in baska bir obje,class'in tum ozelliklerini ve davranislarini elde ettigi mekanizmadir.
		 * (Ozellik variable,davranislar method)
		 * Inheritance, OOP'lerin onemli bir parcasidir.
		 * Java'da inheritance'in arkasindaki fikir daha once'den olusturulmus Class'larin uzerine yeni Class'lar olusturabilmemizdir.
		 * Inheritance sayesinde yeni olusturdugumuz bir class'in var olan bir class'in tum methodlarini ve variable'larini kullanmasini saglaybiliriz
		 * Inheritance bu islemin adidir. Inheritance sayesinde child class,parent class'daki public veya protected primitive datalari,objectleri
		 * veya methodlari problemsiz bir sekilde kullanabilir.
		 * Inheritance sayesinde yazilan bir code'un tekrar tekrar kullanilabilmesi(reusability) mumkun olur.
		 * Geneli kapsayan class uyeleri parent class'a, daha spesifik olanlar ise child class'larda olusturulur.
		 * Not : Child classlar public ve protected data値ari problemsiz bir sekilde inherit edebilir.
		 * Not : Private data値ar inherit edilemez.
		 * Not : Default data値ar child ve parent ayni package壇a olduklari zaman inherit edilebilirler.
		 * Not : Static Methods veya variable値ar inherit edilemezler.
		 * 
		 * *************************INTERVIEW SORUSU**************************
		 * Neden inheritance kullaniyoruz ?
		 * Inheritance sayesinde parent olarak tanimlanan class(ve onun parentclass値arindaki) 
		 * protected/public class uyelerini kullanabiliriz(reusability).
		 * 
		 * Inheritance faydalari nelerdir ? 
		 * 1) Tekrarlardan kurtuluruz.
		 * 2) Daha az kod yazarak islemlerimizi yapabiliriz.
		 * 3) Kolayca update yapabiliriz
		 * 4) Application'in bakimi ve surdurulmesi(maintenance) kolaylasir.
		 */

		String isim = "The Godfather"; // isim yazip .'ya bastigimda bir suru method cesidi onumuze geliyor. String'i hic import etmeden kullandik.
		// Bunlari kullanabilmemiz icin arka planda inheritance zinciri olusturmus durumda. En ustte object vardir.
		
	}

}
