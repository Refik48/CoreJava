package day26_arraylists;

import java.util.ArrayList;
import java.util.List;

public class C5_ArrayLists03 {

	public static void main(String[] args) {
		
		// List'in uzunlugu nasil bulunur ?
		
		List<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(15);
		list.add(18);
		list.add(12);
		list.add(20);
		System.out.println(list); // [10, 15, 18, 12, 20]
		
		System.out.println(list.add(99)); // true
		System.out.println(list); // [10, 15, 18, 12, 20, 99]
		
		System.out.println(list.size()); // 6
		
		// Bir eleman nasil silinir ? 
		list.remove(1); // 1. indexi siler
		System.out.println(list); // [10, 18, 12, 20]
		
		System.out.println(list.remove(2)); // git 12'yi kaldir dedik bize 12'yi dondurur. syso'nun icinde yazarsak o indexi ekrana yazdirir.
		// remove(index) kullandigimizda o indexdeki elemani remove eder ve bunun delili olarak bize o elemani getirir.
		// Eger olmayan bir index girersek RTE verir.
		System.out.println(list); // burada da 2. indexi yok etmis halde verir
		
		// System.out.println(list.remove(5)); // git 5'i kaldir dedik ama 5. index yok o yuzden hata verir
		
		List<String> list2 = new ArrayList<>();		
		list2.add("Ali");
		
		System.out.println(list2.remove("Hasan")); // False verir . Cunku hasan yok listede , eger Hasan olsaydi sonuc ekranina True dondururdu.
		System.out.println(list2);
		// remove(Object) method'u kullanildiginda eger Java istenen elemani bulup remove ederse bize remove edilen elemani dondurur,
		// listede bulamazsa istegin yerine getirelemedigini anlamamiz icin FALSE dondurur.
		
		System.out.println(list2.remove("Ali")); // Bunu sildigini belli etmek icin True degerini verir. 
	}

}
