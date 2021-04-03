package day02;

import java.util.Scanner;

public class C3_Scanner3 {

	public static void main(String[] args) {
		
// Kullanicidan ismini ve soyismini alip aralarında 
// bir bosluklu isim ve soyismini yazddirin
		
		Scanner scan = new Scanner(System.in);
		System.out.print("lutfen isminizi giriniz");
		String isim = scan.nextLine();
		
		System.out.print("lutfen soyisminizi giriniz");
		String soyisim =scan.next();
		
		
		System.out.println(isim + " " + soyisim);

		scan.close();
		// 16. satirda "" var çünkü sabit bir yazi,
		// 20. satirda "" yok çünkü variable .
	}

}
