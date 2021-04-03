package day13_stringmanupalation;

public class C07_ReplaceAll {

	public static void main(String[] args) {
		// 
		String str = "Java ogren, mutlu ol, Java candir 123456";
		System.out.println(str.replace("Java", "Hava")); // Boyle olunca da butun javalar degisiyor, neden replaceAll var o zaman ?
		// replaceAll() method'u replace() method'una benzer fakat 2 farki vardir. // Hava ogren, mutlu ol, Hava candir 123456
		// 1) replace() method'u char kabul eder ama replaceAll() method'u kabul etmez
		// 2) replaceAll() method'u regexp kullanimina izin verir.
		
		System.out.println(str.replaceAll("\\w", "*")); // Tum harf ve rakamlar yerine * yazar // **** *****, ***** **, **** ****** ******
		System.out.println(str.replaceAll("\\W", "*")); // w'nun tersi // Java*ogren**mutlu*ol**Java*candir*123456
		System.out.println(str.replaceAll("\\d",".")); // sayilari . yapar // Java ogren, mutlu ol, Java candir ......
		System.out.println(str.replaceAll("\\D", ".")); // sayi olmayanlari . yapar // ..................................123456
		System.out.println(str.replaceAll("\\s", "-")); // bosluklari - yapar // Java-ogren,-mutlu-ol,-Java-candir-123456
		System.out.println(str.replaceAll("\\S", "-")); // bosluk olamayan her seyi - yapar // ---- ------ ----- --- ---- ------ ------
		
		/*
	    \\s bosluklari degistirir
		\\S bosluk disindaki tum karakterleri degistirir
		\\w Harfler ve rakamalari (a-z, A-z, 0-9) degistirir
		\\W harfler ve rakamlar disindaki karakterleri degistirir
		\\d rakamlari (0-9) degistirir
		\\D rakamlar disindaki butun karakteri degistirir
        */
	}

}
