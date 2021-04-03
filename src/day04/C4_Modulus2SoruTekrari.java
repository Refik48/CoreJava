package day04;

import java.util.Scanner;

public class C4_Modulus2SoruTekrari {

	public static void main(String[] args) {
		// Kullanicidan 4 basamakli bir sayi alalim ve sayinin basamaklarini ters sirada yazdiralim
				// Bir sayinin basamaklarini elde etmek icin 2 islemi tekrar tekrar yapariz (LOOP DIYORUZ)
				// 1. islem en sondaki basamagi elde etmek
				// 2. islem en sondaki basamagi yok etmek 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 4 basamakli bir sayi giriniz");
	    int x = scan.nextInt();          // 1234
	    int birBas = x%10; // 4
	    x/=10; // 123
	    int onBas = x%10; // 3
	    x/=10; // 12
	    int yuzBas = x%10; // 2
	    x/=10; // 1
	    
	    System.out.println("Sayinizin ters hali: " + birBas + onBas + yuzBas + x);
	    
	    
	}

}
