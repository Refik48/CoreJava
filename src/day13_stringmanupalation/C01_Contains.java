package day13_stringmanupalation;

import java.util.Scanner;

public class C01_Contains {

	public static void main(String[] args) {
		// Kullanicidan bir cumle ve aramak istedigin 
		// cumle String'i iceriyorsa "basarili", degilse "basarisiz" yazdirin.
		// Bu method'da "char" kullanamayiz.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir cumle yaziniz: ");
		String cumle = scan.nextLine().toLowerCase();
		System.out.println("Lutfen aramak istediginiz kelimeyi yaziniz");
		String kelime = scan.nextLine().toLowerCase();
		
		System.out.println(cumle.contains(kelime) ? "Basarili" : "Basarisiz");
scan.close(); 

	    
		}
	}
