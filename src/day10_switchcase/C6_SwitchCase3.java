package day10_switchcase;

import java.util.Scanner;

public class C6_SwitchCase3 {

	public static void main(String[] args) {
		// Kullanicidan hangi gunde oldugumuzu isteyin (yaziyla)
		// girilen gunun hafta ici veya hafta sonu old. yazdirin
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Lutfen bir gun girniz:");
		String gun = scan.next().toLowerCase();
		
		switch (gun) {
		case "pazartesi":
		case "sali":
		case "carsamba":
		case "persembe":
		case "cuma":
		System.out.println("Hafta ici");
		break;
		case "cumartesi":
		case "pazar":
		System.out.println("Hafta sonu");
		break;
		}                                      // case "pazartesi":
scan.close();	}                             // System.out.println("Hafta ici");
                                             // break;
}                                           // case "sali":
	                                       // System.out.println("Hafta ici"); boyle yazmak yerine yukarda ki kisa hali
	

