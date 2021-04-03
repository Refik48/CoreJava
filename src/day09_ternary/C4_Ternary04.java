package day09_ternary;

import java.util.Scanner;

public class C4_Ternary04 {

	public static void main(String[] args) {
		// soru 2 - Kullanicidan bir tamsayi alin ve sayinin tek veya cift oldugunu yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir tam sayi yaziniz");
		
		double tamsayi = scan.nextDouble();
		System.out.println("Islem sonucu: " + (tamsayi%2==0 ? "cift sayi" : "tek sayi"));
		
		// girilen sayinin mutlak degerini yazdirin
		
		System.out.println("Mutlak sayiniz: " + (tamsayi>0 ? tamsayi : -1*tamsayi));
		
scan.close();	}

}
