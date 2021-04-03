package day10_switchcase;

import java.util.Scanner;

public class C7_SwitchCase4 {

	public static void main(String[] args) {
		// kullanicidan VIP kisaltmasinda hangi hargin anlamini istedigini soralim ve girilen harfin aciklamasini siteyin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Harf giriniz");
		
		char harfAdi = scan.next().toLowerCase().charAt(0);
		
		switch (harfAdi) {
			case 'v' :
			System.out.println("Very");
			break;
			case 'i' :
				System.out.println("Important");
				break;
			case 'p' :
				System.out.println("Person");
				break;
				default : 
					System.out.println("Gecersiz Harf");
					scan.close(); 	}
	 
	// kullanicinin birden fazla harf girmesini sorun olarak kabul ediyor 
	// ve bunu hata olarak bunu kullaniciya hata olarak bildirmek istiyorsaniz	
	
	
	System.out.println("Harf giriniz");
	String str = scan.next();
	switch (str) {
	case "v" :
	case "V" :
	    System.out.println("Very");
	    break;
	case "i" :
	case "I" :
		System.out.println("Important");
		break;
	case "p" :
	case "P" :
		System.out.println("Person");
		break;
	default : 
		System.out.println("Gecersiz Harf");
	}

	}
}
