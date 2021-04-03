package day07_ifstatements;

import java.util.Scanner;

public class C6_IfElse5 {

	public static void main(String[] args) {
		// Kullanicidan 100 uzerinden notunu isteyin. Not’u harf sistemine cevirip yazdirin.  
		// 50’den kucukse “D”, 50-60 arasi “C”, 60-80 arasi “B”, 80’nin uzerinde ise “A”

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen notunuzu sayi olarak giriniz");
		double not = scan.nextDouble();
        
		if (not<0 || not>100) { //0 100
			 System.out.println("Girdigin o notu almayi nasil becerdin acaba ? ");
		} else if(not<50) { // Notumuz 0 ile 50 arasinda
			System.out.println("Harfiniz: D");

		} else if(not<60) { // Notumuz 50 ile 60 arasinda
			System.out.println("Harfiniz: C");
		}
			else if(not<80) { // Notumuz 60 ile 80 arasinda
				System.out.println("Harfiniz: B");
				
		}   else if (not<=100) { // Notumuz 80 ile 100 arainda
			System.out.println("Harfiniz: A");
			
scan.close();		}
		
	}

}
