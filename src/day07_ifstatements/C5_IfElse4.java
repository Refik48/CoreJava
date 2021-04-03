package day07_ifstatements;

import java.util.Scanner;

public class C5_IfElse4 {

	public static void main(String[] args) {
		// Kullanicidan ucgenin kenar uzunluklarini alin  . Uc kenar esit ise "Eskenar ucgen" yazdirin yok eskenar degil yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen ucgenin kenarlarini yaziniz");
		double kenar1 = scan.nextDouble();
		double kenar2 = scan.nextDouble();
		double kenar3 = scan.nextDouble();
		
		if (kenar1==kenar2 && kenar2==kenar3) {
			System.out.println("Eskenar Ucgendir");
		} else {
			System.out.println("Eskenar Ucgen Degildir");
		}
scan.close(); }
}
