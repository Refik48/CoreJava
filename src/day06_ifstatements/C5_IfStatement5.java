package day06_ifstatements;

import java.util.Scanner;

public class C5_IfStatement5 {

	public static void main(String[] args) {
		// Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alin . Kenar uzunluklari esit ise "Kare" degilse "Dikdortgen" yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen iki kenar uzunlugunu giriniz: ");
		
		double kenar1=scan.nextDouble();
		double kenar2=scan.nextDouble();
		
		if (kenar1>0 && kenar2>0 && kenar1==kenar2) { // Eger sadece kenar1==kenar2 yazarsan negatif sayilari da alir. 
			System.out.println("Kare");
		}
		if (kenar1>0 && kenar2>0 && kenar1!=kenar2) {
			System.out.println("Dikdortgen"); 
		}                                     
		if (kenar1<=0 || kenar2<=0) { // Negatif sayilardan ve 0'dan kurtulduk
			System.out.println("Kenarlar negatif ve sifir olamaz");
		}
		
		scan.close();
	}

}
