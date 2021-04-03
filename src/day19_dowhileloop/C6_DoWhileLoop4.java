package day19_dowhileloop;

import java.util.Scanner;

public class C6_DoWhileLoop4 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan bir sifre girmesini isteyin. Girilen sifreyi asagidaki sartlara gore kontrol edin ve sifredeki hatalari yazdirin.
         * Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve gecerli sifre girdiginde “Sifreniz Kabul edilmistir” yazdirin.
         * Sifre kucuk harf icermelidir
         * Sifre buyuk harf icermelidir
         * Sifre ozel karakter icermelidir
         * Sifre en az 8 karakter olmalidir.
		 */
		
		Scanner scan = new Scanner(System.in);
		String sifre="";
		int sonuc=0;
		
		
		do {
			System.out.println("Lutfen bir sifre olusturunuz");
			sifre=scan.nextLine(); // bosluk birakmis olabilir diye nextLine
			
			sonuc =  kucukHarfVarMi(sifre)+buyukHarfVarMi(sifre)+ozelKarVarMi(sifre)+uzunlukUygunMu(sifre);
					// Hepsi int degerinde true verirse toplam 4 olur eger bir tanesi saglanmazsa dogru olmaz ve kabul etmez program geri calisir
					// o yuzden burayi int turunde yazdik ve sonucu !=4'e atadik
			
           } while(sonuc!=4);
		
		System.out.println("Sifreniz basariyla kaydedildi");
scan.close();	}

	public static int uzunlukUygunMu(String sifre) {
		
		int sonucUzunluk=0;
		
		if (sifre.length()<8) { 
			System.out.println("sifre en az 8 karakter olmalidir");
			
		} else {
			sonucUzunluk=1;
		}
		return sonucUzunluk;
	}

	public static int ozelKarVarMi(String sifre) {
		
		int flagOzel=0;
		int index=0;
		while (index<sifre.length()) {  // < oldugunda -1 yok . <= olursa -1 var son harf icin
			if (sifre.charAt(index)>=' ' && sifre.charAt(index)<='/' || sifre.charAt(index)<='@') { 
				flagOzel=1;  // Ozel karakterlerin en kucugu space en buyugu / ve bir de onlarin disinda @ var
			} // While loop bittiginde flagKucuk ya 0 olacak ya da 1 olacak 
		      index++;
		} 
		
		if (flagOzel==0) {
			System.out.println("sifre ozel karakter icermelidir");
		}
		
		return flagOzel;
	}

	public static int buyukHarfVarMi(String sifre) {
		
		int flagBuyuk=0;
		int index=0;
		while (index<sifre.length()) {  // < oldugunda -1 yok . <= olursa -1 var son harf icin
			if (sifre.charAt(index)>='A' && sifre.charAt(index)<='Z') {
				flagBuyuk=1; 
			} // While loop bittiginde flag ya 0 olacak ya da 1 olacak 
			index++;
		}   
		
		if (flagBuyuk==0) {
			System.out.println("sifre buyuk harf icermelidir");
		}
		
		return flagBuyuk;
	}

	public static int kucukHarfVarMi(String sifre) { // normalde return type void . Void return type sadece bir sey yazdirabiliyor.
		// void'i int yaptik , bir de return koyduk . 
		// Diyelim ki MehmetJava123 olsun. Kucuk harf var mi icin whileloop olusturup a'dan z'ye harf var mi diye bakiyoruz. (ForLoop'ta olur) 
		
		int flagKucuk=0;
		int index=0;
		while (index<sifre.length()) {  // < oldugunda -1 yok . <= olursa -1 var son harf icin
			if (sifre.charAt(index)>='a' && sifre.charAt(index)<='z') {
				flagKucuk=1; 
			} // While loop bittiginde flagKucuk ya 0 olacak ya da 1 olacak 
			index++;
		} 
		
		if (flagKucuk==0) {
			System.out.println("sifre kucuk harf icermelidir");
		}
		
		return flagKucuk;
		
		
	}

}
