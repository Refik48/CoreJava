package day12_stringmanupalation;

import java.util.Scanner;

public class C4_IndexOf {

	public static void main(String[] args) {
		// IndexOf() methodu bize istedigimiz karakter(lerin) indexini dondurur.
		
		String str = "Java ogren, is sahibi ol"; // indexof methodu
		
		System.out.println(str.charAt(6)); // g
		System.out.println("char arama: " + str.indexOf('a')); // 1
		System.out.println("String arama: " + str.indexOf("g")); // 6 
		System.out.println("String kelime arama: " + str.indexOf("is")); // i-> 12 s-> 13 ,12.indexten basladigi icin sonuc ekrani 12'yi verir
		System.out.println("Birden fazla varsa: " + str.indexOf('i'));
		System.out.println("Baslangci indexi(a): " + str.indexOf('a', 3)); // Baslangic indexi (inclusive) yani dahildir. 
		// a harfi charAt3'e esittir (0'dan basliyor)
		System.out.println("Baslangci indexi(p): " + str.indexOf('p', 3)); // 3.harften sonra ki p'yi arar
		System.out.println("olmayan harf/kelime: " + str.indexOf("dert")); // olmayan harf kelime yazsak -1 verir
		
		// Kullanicidan bir cumle isteyin . Harf duyarliligi olmadan (case sensitive) olmadan, Java kelimesi icerip icermedigini yazdirin
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz");
		String cumle = scan.nextLine().toLowerCase(); //lowercase yazdigimiz icin asagida java harflerini de kucuk yazdik.
		
		int sonuc = cumle.indexOf("java"); // java varsa, ilk java kelimesinin index'ini dondurur. Java yoksa -1 yazdirir.
		System.out.println(sonuc==-1 ? "Java Icermiyor" : "Java Iceriyor");

		// Pasa gonlum if ile yapmak isterse
		
		if (cumle.indexOf("java")>=0) { // Java kelimesinin indexinin 0 veya daha buyuk oldugunu kontrol ediyor
			 System.out.println("Cumle java iceriyor");
        } else {
            System.out.println("Cumle Java icermiyor");
		}
	scan.close();}
}
