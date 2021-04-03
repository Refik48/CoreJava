package day15_methodcreation;

import java.util.Scanner;

public class C02_MethodCreation2 {

	public static void main(String[] args) {
		/* Soru kac sayi toplamak istedigini sorun
		 * Kullanici 2,3 veya 4 degerini girerse, kullanicidan bu sayilari girmesini isteyin ve sayilarin toplamini yazdirin
		 * Kullanici toplamak istedigi sayi adedini 4'ten buyuk girerse "Cok sayi girdiniz, ben toplayamam" desin
		 * 2'den kucuk bir sayi girerse "en az 2 sayi girmelisiniz" yazsin
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen kac sayi toplamak istediginizi giriniz");
		int adet = scan.nextInt();
		
		if (adet<2) {
			System.out.println("En az 2 sayi girmelisiniz");
		} else if (adet==2) {
			
			ikiSayiTopla();
			
		} else if (adet==3) {
			
			ucSayiTopla();
		} else if (adet==4) {
			
			dortSayiTopla();
		} else {
			System.out.println("Cok sayi girdiniz,ben toplayamam");
scan.close();		}

	}

	public static void dortSayiTopla() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 4 sayi giriniz");
		double sayi1 = scan.nextDouble();
		double sayi2 = scan.nextDouble();
		double sayi3 = scan.nextDouble();
		double sayi4 = scan.nextDouble();
		
		System.out.println("Sayilarin toplami: " + (sayi1+sayi2+sayi3+sayi4));
scan.close();	}

	public static void ucSayiTopla() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 3 sayi giriniz");
		double sayi1 = scan.nextDouble();
		double sayi2 = scan.nextDouble();
		double sayi3 = scan.nextDouble();
		
		System.out.println("Sayilarin toplami: " + (sayi1+sayi2+sayi3));
scan.close();	}

	public static void ikiSayiTopla() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 2 sayi giriniz");
		double sayi1 = scan.nextDouble();
		double sayi2 = scan.nextDouble();
		
		System.out.println("Sayilarin toplami: " + (sayi1+sayi2));
scan.close();	}
}
