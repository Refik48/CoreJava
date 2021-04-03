package day19_dowhileloop;

import java.util.Scanner;

public class A02 {
	
	public static void main(String[] args) {
		// Kullanicidan bir sayi alin ve bu sayinin rakamlari toplamini yazdirin.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("sayi");
		int sayi = scan.nextInt();
		int i =0;
		int toplam =0;
		
		while(i<=15) { 
			
			toplam+=sayi%10;
			sayi/=10;
			
			i++;
		}
		System.out.println(toplam);
		
	}
}
