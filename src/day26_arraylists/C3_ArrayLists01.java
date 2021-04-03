package day26_arraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C3_ArrayLists01 {

	public static void main(String[] args) {
		/*
		 * ArrayList lenght'i esnek olan bir Array'dir .
		 * 
		 * -Array olustururken length'i en basta belirlemek zorundayiz ve daha sonra length'ini degistiremeyiz . Bu durum bizim esnek calismamiza
		 * engel olur .
		 * -Bir array list nasil olusturulur ? 
		 * ArrayList bir objedir, dolayisiyla yeni bir tane olusturmak icin new keyword kullanmaliyiz
		 */

		// ArrayList olusturmanin 1.yolu
		ArrayList<String> List = new ArrayList<String>(); // Array'de [] koyuyorduk bunda ise <> boyle parantez koyup turunu yaziyoruz
		
		// ArrayList olusturmanin 2.yolu
		ArrayList<String> List2 = new ArrayList(); // Sag tarafta ki elmasi acmama gerek yok 
		
		// ArrayList olusturmanin 3.yolu
		List<String> list3 = new ArrayList<>(); // Itiraz ediyor cunku ArrayList'i import ettik fakat List'i etmedik . En cok bu kullanilir
		// Ben adi list3 olan String bir list olusturuyorum. 
		// NOT : Eger cons. olarak List<>() kullanilirsa ne olur ? 
		// List <>() constructor olarak kullanilamaz.
		// List<String> list4 = new List(); // Bu List type olarak ilk deger olamaz diyor kisacasi CTE.
		// Eger Class'in ismini List,ArrayList,String gibi Java'da kullanilan obje isimleri ile AYNI ISIM KULLANAMAYIZ .
		// Cunku java cagiracagi class'i bu class zanneder. Gidip baska class'da aramaz boylece kodlar calismaz.
		
		// List'e eleman ekleme (Array'a gore tek negatif taraf)
		// List olustururken otomatik olarak eleman ekleme ozelligi yoktur.
		// Elemanlarin tek tek eklenmesi gerekir.
		
		int arr [] = {3,5,1,1,2,6};
		System.out.println(Arrays.toString(arr));
		list3.add("Nihat");
		System.out.println(list3); // Obje olmasina ragmen direkt syso icine yazdirinca calisiyor.
		list3.add("Behzat");
		System.out.println(list3);
		list3.add("Esra");
		System.out.println(list3);
		list3.add(1, "Kazim"); // 1. index'e atanan degeri koyar artik 1. index Kazimdir / 1 ise 2.index olur.
		System.out.println(list3); 
		list3.add(1, "Harun"); // Burada yukarda ki kazimin yerine Harun yazdirdi 
		System.out.println(list3);
		list3.add(5, "haci");
		System.out.println(list3);
	}

}
