package day38_exception;

import java.util.Scanner;

public class C1_Exceptions01 {

	public static void main(String[] args) {
		/*
		 * -Java'da bir program calistirildiginda, farkli sorunlar olusabilir.
		 * Programcilarin yazdigi kodlarda hata olabilir.
		 * Kullanicidan istenen degerlerde uygun olmayan deger girilebilir.
		 * Internet baglantisinin kesilmesi gibi ongorulemeyen hatalar olabilir.
		 * 
		 * Hic bir sorun yoksa No Exception, sorun var ama halledilebilir ise No Exception , sorun var ve halledilemiyorsa Throw Exception.
		 * Bir program calistirildiginda, Java cozemedigi bir sorunla karsilastiginda calismayi durdurur (stops execution) ve "throws an exception"
		 */
		
		// Kullanicidan 2 tamsayi alin ve bolumlerini yazdirin
		
		int count = 1;
		Scanner scan = new Scanner(System.in);
		
		while (count<=100) {
		System.out.println("Lutfen bolunecek tamsayiyi yaziniz");
		int bolunen = scan.nextInt();
		System.out.println("Lutfen bolecek tamsayiyi yaziniz");
		int bolen = scan.nextInt();
		
		/*  Java'ya exceptions'i handle etmek icin bir cozum uretmezsek, 
		    Java exception ile karsilastiginda calismayi durdurur(stops execution)
		    Throws exceptions (exception firlatir)(problemin kaynagini bize gosterir)
		    
		    Tum app durmus olur...
		    Musterinin kullandigi bir uygulama icin bu KABUL EDILEMEZDIR.
		    Bunun icin kod kisi muhtemel sorunlari ongormeli ve Java'ya bu sorunla handle etmesi icin yol gostermelidir.
		
		*/
		System.out.println("Islem No : " + count);
		try {
		System.out.println("Bolme isleminin sonucu : " + bolunen/bolen); 
		} catch (ArithmeticException e) { { // ArithmeticException => Data Turu / e => ismi / int sayi gibi.
			System.out.println("Bolen 0 (sifir) olamaz");
		}
		count++;
		// bolme islemini yapmaya (try) calisirken , ArithmeticException catch edersen (hatasini alirsan) "Bolen 0 (sifir) olamaz" yazdir.
		
		}
		// En basitinden basladik bolen=0 olunca hata verecek yani "(C1_Exception01.java:26)" C1_Exception01 class'inda 26.satir, sorunun old. kisim
		// Exception turu "ArithmeticException" ve Exception kaynagi ise "/ by zero"
		// Bu hatayi onlemek icin try catch ile duzeltmeyi calisabiliriz .
		
		/*
		try {
		
		System.out.println("Bolme isleminin sonucu : " + bolunen/bolen); 
		
		} catch (java.lang.ArithmeticException e) {
			System.out.println("Bolen 0 olamaz"); // Hatayi elimizde duzelttigimiz icin HANDLE etmis oldum.
		}   
		*/
		

	}

}
}
