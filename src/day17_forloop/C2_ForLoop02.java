package day17_forloop;

import java.util.Scanner;

public class C2_ForLoop02 {

	public static void main(String[] args) {
		  /* Kullanicidan bir tamsayi girmesini isteyin
		 sayi negatif veya sifirsa "Lutfen pozitif bir tamsayi giriniz" yazdirin
		 Girilen Sayinin rakamlar toplamini ayri bir method'da hesaplayin
		
		 Main method icinde Kullanicidan bir sinir deger isteyin
		 rakamlar toplami sinir degerden buyukse
		 "Girdiginiz sayinin rakamlar toplami, girdiginiz sinir degerinden buyuk",
		 degilse "Girdiginiz sayinin rakamlar toplami, girdiginiz sinir degerinden buyuk degil"
		 yazdirin		
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen rakamlar toplamini bulmak icin pozitif bir tam sayi giriniz");
		int sayi = scan.nextInt();
		System.out.println("Lutfen sinir degeri icin pozitif bir tam sayi giriniz");
		int sinir = scan.nextInt();
		
		if (sayi<=0) {
			System.out.println("Lutfen pozitif tam sayi giriniz");
		} else {
			
			if (rakamlarToplamiHesapla(sayi)>sinir) {
				System.out.println("Girdiginiz sayinin trakamlar toplami, girdiginiz sinir degerinden buyuk");
			} else {
				System.out.println("Girdiginiz sayinin rakamlar toplami, girdiginiz sinir degerinden kucuk");
			}
			
				// Main methodda bir sey yazdirmak istiyorsak Void kullaniyorduk . 
                // Girilen sayinin rakamlar toplami int oluyor, yani biz Return Type'i int yapiyoruz
                // Return yaptiktan sonra burada ki rakamlarToplamiYazdir(sayi); yazisi yerine cikan sonuc cikar(123 icin 6)
                // Kiyaslamak icin  >  yazabilirim . Cevabi bir sonuc olarak dondurur True or False bir Boolean
scan.close();		}
	}

	public static int rakamlarToplamiHesapla(int sayi) {
		  int rakamlarToplami=0;
	        String sayi2=sayi+""; // sayi1'i String'e cevirdik // uzunlugu int'da bulamiyoruz , o yuzden String'e ihtiyacimiz var 
	        
	        for (int i = 0; i < sayi2.length(); i++) {
	            rakamlarToplami+=sayi%10;
	            sayi/=10;
	        }
		
		return rakamlarToplami; // Sonrasinda o bilgiyi kulancaksak yada baska adimlar gerceklesecekse return yapariz
		// Kullanici 123 girdi diyelim . 123 sayisini alip 2. main mothada gidecek
		// int 123 yapacak sonra onun rakamlarini toplayacak loop'a gore o da 6 .
		// 6 sayisini return rakamlarToplami; sonucunda bulundu ve oradan cikan her deger yukarda ki rakamlarToplamiHesapla(123);'un yerine gecti
		// Artik orada sadece 6 var tek rakam ve 6 buradan yapacaklarim su sekildedir.
		// 1) Direkt yazdirabilirim
		// 2) Kiyas yapabilirim
		// 3) Degiskene atayabilirim
		// Return olunca yazdiradabiliriz (Hoca en sonda soyledi)
		
	}
}

	