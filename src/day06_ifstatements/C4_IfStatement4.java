package day06_ifstatements;

import java.util.Scanner;

public class C4_IfStatement4 {

	public static void main(String[] args) {
		// Kullanicidan gun ismini isteyin . Girilen gun haftaici veya haftasonu old. yazdirin

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir gun ismi giriniz");
		
		String gunAdi = scan.next().toLowerCase();
		
		// Eğer String'lerde esitlik sorguluyorsak == kullanmamaliyiz
		// Stringler'de esit olma durumunu sorgulamak icin equals() methodunu kullanmaliyiz
		
		if (gunAdi.equals("cumartesi") || gunAdi.equals("pazar")) { // Türkçe klavye ile yazdigim icin sonuc ekraninda Kullanici SALİ yazmali
			System.out.println("Haftasonu");                        // kücük i kabul ediyor fakat büyük I yerine İ Kabul ediyor . İng'e geç
		} 
		
		if (gunAdi.equals("pazartesi") || gunAdi.equals("sali") || gunAdi.equals("carsamba") || gunAdi.equals("persembe") || gunAdi.equals("cuma")) {
			System.out.println("Haftaici");
		}
		
		
		scan.close();}
	
}
