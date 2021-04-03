package day07_ifstatements;

import java.util.Scanner;

public class C3_IfElse2 {

	public static void main(String[] args) {
		// kullanicidan bir karakter girmesini isteyin . Harf olup olmadigini yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir karakter giriniz: ");
		
		char karakter = scan.next().toUpperCase().charAt(0);
		if (karakter >='A' && karakter<='Z') { // Yukardan toUpperCase yazmasaydik if((karakter >='A' && karakter<='Z')) || ((karakter >='a' && karakter<='z'))
			System.out.println("Harftir");     // yazabiliriz......
		} else { System.out.println("Harf degildir");

		} 
		
scan.close();}

}
