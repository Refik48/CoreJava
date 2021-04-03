package day09_ternary;

import java.util.Scanner;

public class C5_NestedTernary01 {

	public static void main(String[] args) {
		// 
		int y =8;
		
		System.out.println((y>5)?(y<10?2*y:3*y) : (y>10?(2+y):(3+y)));
				
		// Kullanicidan dikdortgenin uzunlugunu ve genisligini alin verilere gore kare olup olmadigini yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Dikdortgenin 1.kenarini girin");
		double kenar1=scan.nextDouble();
		System.out.println("Dikdortgenin 2. kenarini girin");
		double kenar2=scan.nextDouble();
		
		System.out.println(kenar1>0 && kenar2>0 ? (kenar1==kenar2 ? "kare" : "dikdortgen") : "Gecersiz kenar uzunlugu");

		// bunun yerine String sonuc = kenar1>0 && kenar2>0 ? (kenar1==kenar2 ? "kare" : "dikdortgen") : "Gecersiz kenar uzunlugu";
		// syso(sonuc) yazabiliriz
		
scan.close();	}

}
