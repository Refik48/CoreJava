package day10_switchcase;

import java.util.Scanner;

public class C3_TernaryTekrar3 {

	public static void main(String[] args) {
		// Kullanicidan bir rakam isteyin. Girilen rakimi yazi ile yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir rakam giriniz");
		
	    double rakam = scan.nextDouble();
	    
	    if (rakam==1) {
	    	System.out.println("Bir");
	    } else if (rakam==2) {
	    	System.out.println("Iki");
	    } else if (rakam==3) {
	    	System.out.println("Uc");
	    } else if (rakam==4) {
	    	System.out.println("Dort"); 
	    } else if (rakam==5) {
	    	 System.out.println("Bes");
	    } else if (rakam==6) {
		     System.out.println("Alti"); 
	    } else if (rakam==7) {
	    	System.out.println("Yedi");    	  
		} else if (rakam==8) {
			 System.out.println("Sekiz");
	    } else if (rakam==9) {
    	     System.out.println("Dokuz");
	    } else if (rakam==0) {
	    	 System.out.println("Sifir");
	    } else { System.out.println("Girdiginiz sayi rakam degildir");
 }
scan.close(); }
 }