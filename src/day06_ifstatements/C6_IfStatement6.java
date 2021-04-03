package day06_ifstatements;

import java.util.Scanner;

public class C6_IfStatement6 {

	public static void main(String[] args) {
		// Not durumu girin 100 ile 85 arasi "Basarili" 84-50 "Iyi" "49-0" Basarisiz 0-100 arasi disindakiler ise Hatali Giris yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ogrencinin Notunu Girin: ");
		
		double not = scan.nextDouble();
		
		if (not>=0 && not<=49) {
			System.out.println("Basarisiz");
		} else if (not>=50 && not<=84) {
			System.out.println("Iyi");
		} else if (not>=85 && not<=100) {
			System.out.println("Basarili");
		} else {
			System.out.println("Lutfen gecerli bir not giriniz");
		}
		
scan.close();	}
	

}
