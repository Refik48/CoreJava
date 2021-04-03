package day10_switchcase;

import java.util.Scanner;

public class C2_TernaryTekrar2 {

	public static void main(String[] args) {
		// Kullanicidan bir sayi alin . sayi cift ise cift yazdirin , degilse sayinin karesini yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi yaziniz");
		
		int sayi = scan.nextInt();
		System.out.println(sayi%2==0 ? "Cift sayidir" : sayi*sayi); 
		
	    // String = seklinde yazdirmak istersem
		String sonuc = sayi%2==0 ? "Cift sayidir" : sayi*sayi+"";
		System.out.println(sonuc);
		
		double a = scan.nextDouble(); // double'da % oluyor mu diye denedim oluyor sorun yok .
		System.out.println(a%2);
		
scan.close();	}

}

