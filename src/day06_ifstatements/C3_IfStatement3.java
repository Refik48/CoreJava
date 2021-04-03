package day06_ifstatements;

import java.util.Scanner;

public class C3_IfStatement3 {

	public static void main(String[] args) {
		// kullanicidan  gun ismini isteyin ve harfe uygun olan gun isimlerini yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Gun isimlerinden herhangi birinin bas harfini girin");		
		
		char ilkHarf=scan.next().toUpperCase().charAt(0); // Kullanici buyuk harf ya da kucuk harf girebilir . Ya asagida bunu duzeltecegiz
		                                                      // Ya da burada toUpperCase yazarak durumu cozecegiz
		if (ilkHarf=='P') { // Yukarda toUpper() yazmasaydik burada ilkHarf=='p' || ilkHarf=='P'
			System.out.println("Pazartesi , Persembe , Pazar"); 
		}			
		if (ilkHarf=='S') { // Yukarda toUpper() yazmasaydik burada ilkHarf=='s' || ilkHarf=='S'
			System.out.println("Sali");
		}		
		if (ilkHarf=='C') { // Yukarda toUpper() yazmasaydik burada ilkHarf=='c' || ilkHarf=='S'
			System.out.println("Carsamba , Cuma , Cumartesi");
		}		
		
		if (ilkHarf!='P' && ilkHarf!='S' && ilkHarf!='C') {
			System.out.println("Yanlis gun");
		}

		scan.close();
	}

}
