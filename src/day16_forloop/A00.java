package day16_forloop;

import java.util.Scanner;

public class A00 {

	public static void main(String[] args) {
		// Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore asagida ki sekli cizdirin
				// *        1
				// * *      2
				// * * *    3
				// * * * *  4
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Pozitif bir rakam girin ve seklinizin keyfini cikarin");
		int sayi = scan.nextInt();
		
		for (int i = 1; i<=sayi; i++) {
			System.out.println("");
			for (int j = 1; j<=i; j++) { // * ** *** ****
				System.out.print("* ");
			}
		}
		
	}
	}