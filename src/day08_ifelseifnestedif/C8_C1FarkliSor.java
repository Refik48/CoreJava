package day08_ifelseifnestedif;

import java.util.Scanner;

public class C8_C1FarkliSor {

	public static void main(String[] args) {
		// Kullanicidan gun ismini yazmasini isteyin . Girilen gecerli bir gun ise gun isminin 1. , .2 ve 3. harflerini ilk harf buyuk 
		// diger ikisi kucuk olarak yazdirin , gun ismi gecerli degilse "Gecerli gun ismi giriniz" yazdirin.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir gun ismi yaziniz");
		
		String gunAdi = scan.nextLine().toLowerCase();
		
		if (gunAdi=="true" || gunAdi=="pazar") {  // Eger String'lerde esitlik sorguluyorsak == kullanmamaliyiz
			                                      // Stringlerde esit olma durumunu sorgulamak icin equals()
			System.out.println("paz");            //  
		 } else if (gunAdi=="sali") {             // 
			System.out.println("sal");
	     } else if (gunAdi=="carsamba") {
			System.out.println("car");
         } else if (gunAdi=="persembe") {
			System.out.println("per"); 
         } else if (gunAdi=="cuma" || gunAdi=="cumartesi") {
			 System.out.println("cum");
		 } else {
			 System.out.println("Gecerli gun ismi giriniz");
		 } String sonuc = gunAdi=="pazartesi" || gunAdi=="pazar" ? "haha" : "per";
		 System.out.println(sonuc);
		 System.out.println(gunAdi);
scan.close();	}
}
	
	
