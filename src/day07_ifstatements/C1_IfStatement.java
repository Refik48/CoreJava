package day07_ifstatements;

import java.util.Scanner;

public class C1_IfStatement {

	public static void main(String[] args) {
		// Kullanicidan bir tamsayi isteyin sayi pozitif ise pozitif sayi yazdirin
		// sayi 100'den kucukse kucuk sayi , sayi 1000'den buyukse buyuk sayi yazdirin

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir tamsayi giriniz: ");

		int sayi = scan.nextInt();

		if (sayi > 0) {
			System.out.println("Pozitif sayi");
		}
		if (sayi > 0 && sayi < 100) {
			System.out.println("100'den kucuk sayi");
		}
		if (sayi > 1000) {
			System.out.println("Buyuk sayi");
			scan.close();
		}
	}
}
/*
 * if (sayi>0) { if (sayi<100) { System.out.println("Kucuk sayi"); } else {
 * System.out.println("Buyuk sayi"); } } else {
 * System.out.println("Yanlis sayi"); }
 */ // Farkli cozumu
