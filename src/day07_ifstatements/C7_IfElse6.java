package day07_ifstatements;

import java.util.Scanner;

public class C7_IfElse6 {

	public static void main(String[] args) {
		// Kullanicidan iki sayi isteyin, sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin, 
		// sayilarin ikisi de negative ise sayilarin carpimini yazdirin
		// sayilarin ikisi  farkli isaretlere sahipse 
		// “farkli isaretlerde sayilarla islem yapamazsin” yazdirin,  
		// sayilardan biri sifira esitse “sifir carpmaya gore yutan elemandir”  yazdirin.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Islem yapilacak sayilari yaziniz");
		double sayi1 = scan.nextDouble();
		double sayi2 = scan.nextDouble();
				
		if (sayi1==0 || sayi2==0) {
			System.out.println("Sifir carpmaya gore yutan elemandir");	
		} else if (sayi1>0 && sayi2>0) {
			System.out.println("Sayilarin Toplami: " + (sayi1+sayi2));
		} else if (sayi1<0 && sayi2<0) {
			System.out.println("Sayilarin Carpimi: " + (sayi1*sayi2));
		} else { 
				System.out.println("Farkli isaretli sayilarla islem yapamazsiniz");
			} System.out.println(2 + 3 !=5);
scan.close();		} 
	} 