package day13_stringmanupalation;

import java.util.Scanner;

public class C06_Replace {

	public static void main(String[] args) {
		// Replace verilen String'deki istenene karakter(ler)i, istenen yeni karakter(ler) ile degistirir.
		// char ile de kullanilabilir.
		
		// Kullanicidan bir cumle isteyiniz. Cumledeki tum bosluklari silin ve tum a'lar yerine e yazdirin.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Cumle giriniz");
		String str = scan.nextLine();
		
		str = str.replace('a', 'e'); // EGER ATAMA YAPMAZSADAN YAZDIRIRSAK OLDUGU GIBI YAZAR
        str = str.replace(" ", ""); // ATAMA str = str.replace() SEKLINDE OLUYOR.Atama yapinca orjinal str degisir,yeni bir str'a(str2) atamak daha iyi
        System.out.println(str);
        
        System.out.println("Bir cumle daha giriniz");
        String str2 = scan.nextLine();
                
        System.out.println(str2.replace(" ", "").replace('a', 'e')); // ATAMA YAPMIYORSAK BOYLE YAZARAK DA SONU ALABILIRIZ
        System.out.println(str2); // atama yapmadan yazdigim icin (yukarda) orjinal str gene degimedi
scan.close();	}
}
