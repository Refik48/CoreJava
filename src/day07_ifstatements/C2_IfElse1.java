package day07_ifstatements;

import java.util.Scanner;

public class C2_IfElse1 {

	public static void main(String[] args) {
		// Kullanicidan 2 kenar uzunlugu alin . Kenar uzunluklari ayni ise "Kare" degilse "Dikdortgen" yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen Kenar Uzunluklarini Giriniz");
		
		double kenar1=scan.nextDouble();
		double kenar2=scan.nextDouble();
		
		if (kenar1==kenar2) {
			System.out.println("Kare");
		} else {
			System.out.println("Dikdortgen");
		}
scan.close();
				
	}

}
