package day18_whileloop;

import java.util.Scanner;

public class C1_NestedForLoopSoru {

	public static void main(String[] args) {
		/* Kullanicidan pozitif bir arakam girmesini isteyin ve girilen rakama gore carpim tablosunu olusturun Ornek kullanici 3 girerse ,
		1 2 3   // int i = 1 ; i<=3; i++ { 1*i
		2 4 6              1      3;     { 2*i
		3 6 9              1      3;     { 3*i
		
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Rakam");
		int rakam = scan.nextInt();
		
		for(int i=1; i<=rakam; i++) {
			System.out.println("");
			for(int j=1; j<=rakam; j++) {
				System.out.print(i*j + " ");
				                              
			}
		}
		
		
	}

}
