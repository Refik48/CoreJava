package day27_arraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C4_ArrayLists04 {

	public static void main(String[] args) {
		
		// Verilen bir Array'i List'e nasil cevirebiliriz ?
		
		Integer arr [] = {10,12,35,60,40}; // Neden List'e ceviriyoruz ? Cunku bazi methodlari kullanabilmek icin .
		// Gecis yapmak esneklik kazandirmiyor . Cunku List'e cevrilince Java bizi kisitliyor.
		// basina int degil Integer yazdim cunku elmas(<>) icinin ayni olmasi icin
		
		String arr9 [] = {"a"}; // denemek icin string olustrdum
		List<String> listArr9 = new ArrayList<>(); // Yeni bir array list // 2 tane Array;     Array     ArrayList==List
		
		List<Integer> listArr = Arrays.asList(arr); // Wrapper Class Integer olacak . int ile Integer birbirinden farkli o yuzden Integer olacak
		System.out.println(listArr); // Cunku List<Integer> listArr yazarken Integer yazmak zorunlu o yuzden usttekini de Integer yapiyorum. 13.satir.
		
		// new demedim cunku var olan Array'i ListArray'e ceviriyorum.
		
		String arr2[] = {"Ali" , "Veli"};
		
		List<String> listArr2 = Arrays.asList(arr2); 
		
		System.out.println(listArr2);
		// Ne isimize yaradi diyelim ki cok fazla elemani olan bir liste olusturmamiz gerekiyor.
		// Bu durumda liste elemanlarini tek tek eklemek yerine elemanlari bir Array'e ekler sonra da array'i list'e cevirebiliriz.
		// Ancak bu method'la array'den cevirdigimiz list esnek olmaz !!
		// Array'in ozelliklerini tasir. add(), remove(), clear(), gibi uzunlugu etkileten methodlar kullanilamaz, hata verir.
		
		System.out.println("==============================");
		
		arr[1] = 5; // 1. index yerine 5 yazdirdim
		System.out.println(Arrays.toString(arr));
		System.out.println("listArr: " + listArr); // array'de degisiklik yaptim ama listArray'de de degisti !!!!!!
		// Java bu degisimde ki Array ve List'i senkronize eder, birinde yaptigimiz degisiklik otomatik olarak digerini de update eder.
		
		listArr.set(2, 13);
		System.out.println("Sonra ki deneme listArr" + listArr);
		System.out.println("39. satir:" + Arrays.toString(arr));
		
		

	}

}
