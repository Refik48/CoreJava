package day15_methodcreation;

import java.util.Scanner;

public class C01_MethodCreation {

	public static void main(String[] args) {
		/* Once ki dersten aklimizda kalanlar :
		 * 1) Method : Belirli bir islevi yerine getirmek icin olusturulan kod bloklaridir. Java'da var olan hazir method kaliplarini kullanabilir ya da
		 * kendi ihtiyacimiza gore yenilerini olusturabiliriz.
		 * 2) Amaci : Surekli kullanacagimiz bazi kod bloklarini tekrar tekrar yazmak yerine bir kere method yazip, ihtiyacimiz olan yerlerden bu 
		 * methodu CAGIRABILIRIZ (CALL)
		 * 3) Method Call : Bir method'u olusturmak, calistirmak icin yeterli degildir. Bir method ancak cagirildiginda calisir.
		 * Cagirmak icin ismini ve method parametrelerine uygun ARGUMENT'leri yazmaliyiz. (bu argumentler method'un parametleri ile uyumlu olmali)
		 * 4) Bir method cagiridgimizda hangi method'u calistiracagina METHOD ISMI + PARAMETRE SAYISI + PARAMETRE DATA TIPLERI'ne bakar.
		 * Bu 3'luye Method Signature denir.
		 * 5) Bir method olustururken hangi islemi yapacagini ve bize ne dondurecegini bilmemiz gerekir.
		 * 6) Method ismini belirlerken yapacagi isleve uygun isim secmeliyiz. Ayni sekilde return type (String mi boolean mi int mi) bize bu methodun
		 * nasul bir sonuc dondurecegini anlatir. Eger bir sey dondurmeyecekse return type void olmalidir.
		 * 7) Method'lar Class'in icinde ama main method disinda olusturulmadilir
		 * 8) Ayni isimde birden fazla method olabilir (method signature farkli olmasi sartiyla). 3'unun farkli olmasi sart degil birlesimleri farkli olmali. 
		 */
		
		/*Kullanicidan bir sayi alin.
		 Bu sayinin negatif veya pozitif oldugunu,
		 tek mi cift mi oldugunu ve
		 Sayi uc basamakli veya daha buyukse birler,onlar ve yuzler basamagindaki rakamlarin toplamini,
		 3 basamaklidan daha kucukse sadece 1’ler basamagini yazdirin.
		*/
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Bir sayi giriniz");
		int sayi = scan.nextInt();
		
		pozitifNegatif(sayi); // Bu artik girilen sayi argumentinin pozitif ya da negatif oldugunu yazdirsin (Bu method calls)
		tekMiCiftMi(sayi);
		
		if (sayi>=100) {
			
			yuzdenBuyuk(sayi);
		} else {
			yuzdenKucuk(sayi);
		}
		
		
scan.close();	} // MM sonu
	
	public static void yuzdenKucuk(int sayi) {
		
		System.out.println("Birler Basamagi: " + sayi%10);
	}

	public static void yuzdenBuyuk(int sayi) {
				
		  int rakamlarToplami; 
		  rakamlarToplami=sayi%10;  // 986 = 6
		  sayi/=10;                  // 98
		  rakamlarToplami+=sayi%10; //  8
		  sayi/=10;                  // 9
		  rakamlarToplami+=sayi%10;
		  
		  System.out.println("rakamlar toplami: " + rakamlarToplami);
		 
	}

	public static void tekMiCiftMi(int sayi) {
		
		if (sayi%2==0) {
			System.out.println("Cifttir");
		} else {
			System.out.println("Tektir");
		}
		
	}

	public static void pozitifNegatif(int sayi) { // parametre yazarken data tipini de yazmaliyiz
		
		System.out.println(sayi<0 ? "negatif" : (sayi==0 ? "notr" : "pozitif"));
		
	}
	
}// Class sonu
