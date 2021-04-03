package day25_arrays;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {
		/*
		 * Array (Dizi) : Java'da birden fazla variable store etmek icin kullanilan objelerden biridir.
		 * Array olustururken 2 seyi declare etmeliyiz ;
		 * 1- Data Type : Bir array'in icerisinde sadece ayni data tipinden elemanlar olabilir
		 * 2- Length : Uzunluk array'in icerisine max eleman sayisini belirtir ve bundan fazlasini koymak istersek RTE verir. 
		 */
		
		int arr [] = {10,27,54}; // length=3
		String isimler [] = new String [4]; // length = 4 olan bos bir array olusturur.
		
		// Array'de primitive data type'leri veya np datalarin referanslari store(yazilabilir, depolanabilir) edilebilir.
		// Mesela isimler array'inin icinde isim degerleri degil isimlerin referanslari olur .	
		
		// aray'in elemanlarina ulasma ve update etme ;
		
		System.out.println(isimler[1]); // index 0'dan basliyor.
		isimler[2]="Boss";
		isimler[0]="Elveda";
		
		// Array'in tum elemanlarini yazdirma
		System.out.println(isimler); // referansini verir
		System.out.println(Arrays.toString(isimler));
		
		// method kullanmadan tum elemanlari yazdiralim , loop kullanmamiz lazim
		
		for (int i = 0; i<isimler.length; i++) {
			System.out.print(isimler[i] + " ");
		}
		
		
		System.out.println();
		
		System.out.println(arr); // referans 
		System.out.println(Arrays.toString(arr));
		
		String x = Arrays.toString(isimler); // Arrays classindaki (Java.util'deki bir class bu) toString ile Array'i Stringe ceviriyor.
		System.out.println(x);
		System.out.println(x.substring(0, 10));
		
		//Array'in elemanlarini nasil siralayabiliriz
		isimler[1]="Oguzhan"; // null oldugu zaman siralamada hata veriuyor o yuzden null olanlari doldurduk
		isimler[3]="bilal"; // normalde alfabetik siralama yapiyor ama kelimenin ilk harfi kucuk harf olursa buyuk harfli kelimelerden
		Arrays.sort(isimler); // sonra yaziyor*******
		System.out.println(Arrays.toString(isimler)); // null oldugu zaman hata veriyor siralamada
		
	}
}
