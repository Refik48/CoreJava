package day40_exception;

import java.util.Scanner;

public class Exceptions01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Yasinizi giriniz");
		int yas = scan.nextInt();
		
		try {
			if(yas>=0) {
				System.out.println("Yasiniz : " + yas);
			} else {
			throw new IllegalArgumentException(); // bu sekilde yazdigimizda Java exception throw eder ama kodumuz da bloke olmus olur.
				                                  // Bloke olmasini engellemek isterseniz kodu try catch ile surrond yapabiliriz (asagisi)
			}
		} catch(IllegalArgumentException e) {
			e.printStackTrace(); // System.out.println(e.getMessage()); yazinca null veriyor o yuzden bunu yazdirdim.
			System.out.println("Yasiniz negatif olamaz");
		}
		System.out.println("Kod bloke olmamis");
		
		// Java'ya bir exception throw (firlattirmak) ettirmek icin  "throw" ve "new" keyword'leri kullanilir.
		
		scan.close();

	}

}
