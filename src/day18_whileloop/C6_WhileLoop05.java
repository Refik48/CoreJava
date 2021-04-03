package day18_whileloop;

import java.util.Scanner;

public class C6_WhileLoop05 {

	public static void main(String[] args) {
		// verilen sayinin asal olup olmadigini bulan bir program yazin
	
		Scanner scan = new Scanner (System.in);
		System.out.println("Bir sayi giriniz");
		int sayi = scan.nextInt();
	
		String flag = "Asal"; // flag = bayrak bizim istedigimiz sartin gerceklesip gerceklesmedigini kontrol eder
		int bolen =2;
		
		while(bolen<sayi) {
			if (sayi%bolen==0) {
				flag="Asal sayi degil";
				
		}bolen++;
		}
		System.out.println(flag);
		
scan.close();	}
	}


