package day25_arrays;

import java.util.Arrays;

public class Arrays03_StrArrayeCevirme {
	
	public static void main(String[] args) {
		/*
		 * Verilen bir String'i array'e nasil ceviririz ?
		 * Verilen cumlede kac kelimenin old. bulunuz
		 * Verilen cumlede her kelimenin ilk harfini buyuk yapiniz.
		 */
		
		String str = "Herkes Javayi tanisa severdi"; // bu stringi kelimelere ayiralim
		// Spilit(bolme) methodu
		
		String arr [] = str.split(" "); // str.split String methodudur.
		// split ("") olsaydi her bir harfi bolerdi virguller ile , bosluklari bile
		String arr0 [] = str.split("");
		System.out.println(Arrays.toString(arr)); 
		System.out.println(Arrays.toString(arr0)); // Bosluklari da virgulle ayiriyor.
		
		String arr2 [] = str.split("Java"); // Java'yi kesiyor virgul koyuyor // Buyuk harf kucuk harf duyarli o yuzden java yazma !!
		System.out.println(Arrays.toString(arr2)); 
		
		String arr3 [] = str.split("a");
		System.out.println(Arrays.toString(arr3)); // a yerine virgul 
	}

}
