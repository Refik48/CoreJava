package day16_forloop;

import java.util.Scanner;

public class C2_ForLoop02 {

	public static void main(String[] args) {
		// Kullanicidan 2 tamsayi alin
		// ilk sayidan ikinci sayiya kadar tum sayilari yan yana aralarinda bosluk olarak yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Iki tane tamsayi yaziniz");
		int sayi1 = scan.nextInt(); /// 10   5
		int sayi2 = scan.nextInt(); //// 5   10
		
		if(sayi1>sayi2) {
			for(int i = sayi1; i>=sayi2; i--) {
				System.out.print(i + " ");
			}
		} else if (sayi1<sayi2) {
			for(int i = sayi1; i<=sayi2; i++ ) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println(sayi1);
		}
		
		}
		
	}

