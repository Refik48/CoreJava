package day03;

import java.util.Scanner;


public class C1_ScannerTekrar {

	public static void main(String[] args) {
		
		// Kullanıcıdan isim ve soyismini isteyip
		// isim: nihat soyisim: tekiner kursumuza kaydınız alınmıştır teşekkürler'i oluşturun
		// 3. adımda scanner yapıyoruz
		// 1) Scanner objesi oluşturmak
		
		Scanner scan = new Scanner(System.in); // Bu kodu yazdıktan sonra Scanner yazısının altı çizili oluyor import etmemiz gerek
		                                       // java.util (utilities) ile import ederek, java.util.Scanner; yazısını getiriyoruz .
		
		// 2) Kullanıcıya ne istedimizi belirten bir mesaj yazıyoruz
		
		System.out.println("lutfen sadece isminizi girin");
		
		// 3) Bir variable oluşturup kullanıcın girdiği değeri atayacağız
		
		String name = scan.nextLine();
		
		System.out.println("lutfen sadece soyisim giriniz");
		String surname = scan.nextLine();
		
		System.out.println("isminiz: " + name);
		System.out.println("soyisminiz: " + surname);
		System.out.println("kursumuza kaydiniz alinmistir,tesekkur ederiz");
		
		// Benden istenen sekilde çıktıyı yazdırabilirim .
		// Eger sbt bir yazi ise " " arasina yazıyoruz
		// Kullanıcı yazacaksa " " yok (variable)

		scan.close();
	}
	

}
