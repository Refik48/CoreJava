package day19_dowhileloop;

import java.util.Scanner;

public class A00 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan bir sifre girmesini isteyin. Girilen sifreyi asagidaki sartlara gore kontrol edin ve sifredeki hatalari yazdirin.
         * Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve gecerli sifre girdiginde “Sifreniz Kabul edilmistir” yazdirin.
         * Sifre kucuk harf icermelidir 
         * Sifre buyuk harf icermelidir
         * Sifre ozel karakter icermelidir
         * Sifre en az 8 karakter olmalidir.
		 */
		Scanner scan = new Scanner (System.in);
		
		int sonuc = 0;
		String sifre = "";
		do {
			System.out.println("Sifre girin");
			sifre = scan.nextLine();
			
			sonuc = kucukHarf(sifre) + buyukHarf(sifre) + ozelHarf(sifre) + uzunluk(sifre);
			
	} while (sonuc!=4);
		
		System.out.println("Sifre basarili");
	scan.close();	
}

	public static int uzunluk(String sifre) {
		int flag=0;
		if(sifre.length()>=8) {
			flag=1;
		}
		if(flag==0) {
			System.out.println("en az 8 karakterli");
		}
		return flag;
	}

	public static int ozelHarf(String sifre) {
		int flag=0;
		
		for(int i=0; i<sifre.length(); i++) {
			if(sifre.charAt(i) >='A' && sifre.charAt(i)<='Z') {
				flag=1;
			}
		}
		if(flag==0) {
			System.out.println("Lutfen buyuk harf giriniz");
		}
		return flag;
	}

	public  static int buyukHarf(String sifre) {
		int flag=0;
		
		for(int i=0; i<sifre.length(); i++) {
			if(sifre.charAt(i) >='!' && sifre.charAt(i)<='/') {
				flag=1;
			}
		}
		if(flag==0) {
			System.out.println("Lutfen ozel harf giriniz");
		}
		return flag;
	}

	public static int kucukHarf(String sifre) {
		
		int flag = 0;
		
		for(int i=0; i<sifre.length(); i++) {
			if(sifre.charAt(i) >='a' && sifre.charAt(i)<='z') {
				flag=1;
			}
		}
		if(flag==0) {
			System.out.println("Lutfen kucuk harf giriniz");
		}
		return flag;
	}
}

	