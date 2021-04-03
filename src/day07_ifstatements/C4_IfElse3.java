package day07_ifstatements;

import java.util.Scanner;

public class C4_IfElse3 {

	public static void main(String[] args) {
		// kullaniciya yasini sorun . 65'den buyukse "emekli olabilirsiniz" yoksa "emenkli olamazsiniz" yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen yasinizi yaziniz:");
		
		int yas = scan.nextInt();
		
		if (yas>=65) {
			System.out.println("Emekli olabilirsiniz");
		} else {
			System.out.println("Emekli olamazsiniz");
		}

scan.close();	}

}
