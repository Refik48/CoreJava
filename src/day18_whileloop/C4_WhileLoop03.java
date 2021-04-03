package day18_whileloop;

import java.util.Scanner;

public class C4_WhileLoop03 {

	public static void main(String[] args) {
		// Kullanicidan baslangic ve bitis haflerini alin ve baslangic harfinden baslayip 
		// bitis harfinde biten tum harfleri buyuk harf olarak ekrana yazdirin. Kullanicinin hata yapmadigini farz edin.

		Scanner scan = new Scanner (System.in);
		System.out.println("Lutfen Baslangic Harfini Giriniz");
		char basHarf = scan.next().toUpperCase().charAt(0); // C
		
		System.out.println("Lutfen Bitis Harfini Giriniz");
		char bitHarf = scan.next().toUpperCase().charAt(0); // F
		
	/*
		for (char i = basHarf; i<=bitHarf; i++) {
			System.out.print(i + " ");
		}*/
		
		// While Loop ile cozumu
		// Baslangic degeri var basHarf
		
		while (basHarf<=bitHarf) {
			System.out.print(basHarf + " ");
			basHarf++;
		}
		
		
scan.close();		}
}
