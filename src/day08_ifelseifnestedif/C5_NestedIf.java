package day08_ifelseifnestedif;

import java.util.Scanner;

public class C5_NestedIf {

	public static void main(String[] args) {
		// Nested If kullanarak asagidaki soruyu cozen kodu yaziniz.
		// Kullanicidan bir sifre girmesini isteyin
		// Eger ilk harf buyuk harf ise “A” olup olmadigini kontrol edin. Ilk harf A ise  “Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin.
		// Eger ilk harf kucuk harf ise “z” olup olmadigini kontrol edin. Ilk harf z ise  “Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin.

		Scanner scan = new Scanner(System.in);
		System.out.println("Sifrenizi giriniz");
		
		// 1. islem kullanicidan sifreyi alip ilk harfine bak buyuk harf mi kucuk harf mi bak
		
		char ilkHarf = scan.next().charAt(0); // girilen sifrenin ilk karakterini alir
		
		if (ilkHarf>='A' && ilkHarf<='Z') { // ilk harf buyuk ise calisir
			if(ilkHarf=='A') {
				System.out.println("sifre gecerli");
			} else {
				System.out.println("Sifre gecersiz");
			}						
		} else if(ilkHarf>='a' && ilkHarf<='z') { // ilk harf kucuk ise calisir
			if (ilkHarf=='z') {
				System.out.println("Sifre gecerli");
			} else {
				System.out.println("Sifre gecersiz");
			}
			

		} else { // ilk harf buyuk harf veya kucuk harf degilse
			System.out.println("Sifre Gecersiz");
		}
		

scan.close();		}
		
	}
