package day18_whileloop;

import java.util.Iterator;

public class C2_WhileLoop01 {

	public static void main(String[] args) {
		// While loop bir sart saglandigi veya saglanmadigi surece tekrar eder . Mesela sart sayilar 100'e kadar dedik.
		// O zaman 100'e kadar calisir ve durur.
	    // Loop'ta 3 seye dikkat ediyoruz
		// 1) Baslangic degeri
		// 2) Bitis sarti
		// 3) Artis ve azalis
		// while : iken, oldugu surece
		// int i = 0 -> Baskangic sartimiz
		// while i<5 -> Bitis sarti
		// { syso(i); i++;  } -> Artis or Azalis
		
		// 10'dan 30'a kadar olan sayilardan 4 ile bolunebilenleri aralarda birer bosluk olacak sekilde yan yana yazidirin
		
		for (int i=10; i<=30; i++) {
			if (i%4==0) {
				System.out.println(i + " ");
			}
		}
		// while loop ile cozelim
		
		int sayi=10; // 1.sarti gerceklestirdim (Baslangic degeri)
		while (sayi<=30) { // 2. sarti gerceklestirdim (Bitis kosulu)
			if (sayi%4==0) {
				System.out.println(sayi+ " ");
			}
			sayi++; // 3.sarti gerceklestirdim (Degisim,artis degeri)
		}
	}
		
	}

