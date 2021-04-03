package day10_switchcase;

import java.util.Scanner;

public class C1_TernaryTekrar {

	public static void main(String[] args) {
		// Soru5 ) Kullanicidan bir sayi alin ve sayi 3 basamakli ise “uc basamakli sayi”, yoksa  “Uc  basamakli degil” yazdirin
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Lutfen bir tam sayi giriniz");
		int sayi = scan.nextInt();
		
		String sonuc = (sayi>=100 && sayi<=999) || (sayi<=-100 && sayi>=-999) ? "uc basamakli sayi" : "sayi uc basamakli degil";
		System.out.println(sonuc);
		
		// Nested Ternary yazilimi icin
		
		String sonuc2 = sayi>100 ? (sayi<1000 ? "ucbasamakli" : "uc basamakli degil") : "uc basamakli degil";
		System.out.println(sonuc2);
		
scan.close();	}

}
