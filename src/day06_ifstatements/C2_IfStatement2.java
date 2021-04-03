package day06_ifstatements;

import java.util.Scanner;

public class C2_IfStatement2 {

	public static void main(String[] args) {
		// Kullanicidan bir tam sayi isteyin . Sayinin tek veya cift old.u yazdirin .
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen Bir Tamsayi Giriniz");
		
		
		int sayi = scan.nextInt(); // 153 % 2 == 0 ise bu sayi ciftir , 153 % 2 == 1 ise sayi tektir .
		System.out.println("Girdiginiz sayi " + sayi);
		System.out.println("2'ye bolumunden kalan: " + sayi%2);
		if (sayi%2== 0) {
			System.out.println("Girdiginiz Sayi Cifttir"); // if'den sonra (); --> ; koyulmaz koyarsan kod biter !!
		}
		
		if (sayi%2== 1 || sayi%2==-1) {
			System.out.println("Girdiginiz Sayi Tektir");
		}
		
		System.out.println("Katildiginiz icin tesekkur ederiz");
		scan.close();
	}
	
}
