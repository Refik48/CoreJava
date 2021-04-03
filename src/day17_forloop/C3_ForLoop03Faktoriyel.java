package day17_forloop;

import java.util.Scanner;

public class C3_ForLoop03Faktoriyel {

	public static void main(String[] args) {
		// Kullanicidan 40'dan kucuk pozitif bir sayi alin
		// girilen sayinin faktoriyelini hesaplayip yazdiran bir method olusturun
		
		// 5 =   1x2x3x4x5 == 120
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		int sayi = scan.nextInt();
		
		if(sayi<=0 || sayi>=40) {
			System.out.println("Gecerli bir deger giriniz");
		} else {
			
			faktoriyel(sayi);
		}
		
	}

	public static void faktoriyel(int x) {
		
		int carpim =1;
		
		
		for(int i =1; i<=x; i++) {
			carpim*=i; //
		}
	
		System.out.println(carpim);
		
	}

}
