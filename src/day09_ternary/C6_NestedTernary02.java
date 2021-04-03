package day09_ternary;

import java.util.Scanner;

public class C6_NestedTernary02 {

	public static void main(String[] args) {
		// Kullanicidan bir harf isteyin kucuk harf ise consola “Kucuk Harf” , 
		// buyuk harfse consola “Buyuk Harf” yoksa “girdiginiz karakter harf degil” yazdirin.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir harf yaziniz");
		
		char harfAdi = scan.next().charAt(0);
		String sonuc= harfAdi>='a' && harfAdi<='z' ? "Ilk Harf Kucuk" : (harfAdi>='A' && harfAdi<='Z' ? "Ilk Harf Buyuk" : "Yanlis Giris");
		
	   System.out.println(sonuc);
scan.close();
	}

}
