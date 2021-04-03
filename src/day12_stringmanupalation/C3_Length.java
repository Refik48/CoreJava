package day12_stringmanupalation;

import java.util.Scanner;

public class C3_Length {

	public static void main(String[] args) {
		// Kullanicidan bir Str girmesini isteyin . Girilen Str'in son harfini buyuk harf olarak yazdirin .
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen Bir Cumle Yaziniz");
		
		String str = scan.nextLine().toUpperCase(); // next yazsaydik sadece ilk kelimeyi alacakti son kelime icin nextline yapmak lazim.
		
		System.out.println("Girdiginiz Cumlenin Son Harfi: " + str.charAt(str.length()-1)); // yazilabilecek en buyuk deger lenght-1'dir
		System.out.println("Girdiginiz Cumlenin Sondan 6. Harfi: " + str.charAt(str.length()-6)); // eger 6 haneden kucuk yazi yazarsa hata verir.
		
		String str2="";
		System.out.println(str2.length()); // "Ali" yazip uzunlugu isteseydik , uzunluga 3 derdik .
		//"" icinde hic karakter olmadigi icin sonuc ekraninda 0 yazar cunku hic deger yok.

		// String str3=null; null bos,hic,hukumsuz demek yani bir degeri uzunlugu olamaz. RTE verir (Run Time Error)
		// System.out.println(str3.length()); o yuzden syso icinde hata verir
		// Normalde Str'ler "" icine yazilir ama null'da buna gerek yoktur. null case sensitive'dir . Dolayisiyla NULL yada Null yazilamaz.
		// null bir deger degildir, sadece hicligi gosteren bir pointer'dir.
		// System.out.println(str2.equals(str3)); boyle olursa da hata verir . Cunku null deger atanan Str ile String Manipulaion method'lari kullanilmaz
		scan.close();	}
}