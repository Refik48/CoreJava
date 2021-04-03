package day29_passbyvalueimmutable;

import java.util.ArrayList;
import java.util.List;

public class C3_PassByValue03 {

	public static void main(String[] args) {
		/*Soru3 : Bir list olusturalim. Eleman olarak 10,11,12 ekleyelim. Iki method olusturup list elemanlarini artirmayi deneyelim
		    - 1. Method’da elemanlari for each loop kullanarak artirin
		    - 2. Method’da elemanlari set method’u kullanarak artirin
		    - Method’lari arka arkaya cagirip artislarin kalici olup olmadiklarini kontrol edelim.*/
		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(11);
		list.add(12);
		System.out.println(list);
		
		degistirFor(list); // Dondurunce yazdirmak icin return type olmasi lazim . Orada yazdirmak istiyorsak void olmasi lazim.
		System.out.println("");
		System.out.println("method sonrasi list : " + list); // Orjinal listeye bir sey olmadi.

		for (Integer w : list) {
			w+=3;
			System.out.print(w + " "); }
		System.out.println("");
		System.out.println("foreach sonrasi list : " + list); // Orjinal listeye bir sey olmadi.
		// foreach loop ile  
		
		degistirSet(list);
		System.out.println("Set method sonrasi liste : " + list); // Normalde PassByValue ozelligini kullanir ANCAK list'lerdeki set methodu 
		// kendi icerisinde methoddan kaynaklanan ozellik sebebi ile PassByValue'dan etkilenmez kalici olarak degisiklik yapar.
		
		// pbv bir method cagirildigi zaman methoda olusan clone value gider
		// pbr ise method call yapildiginda methoda orjinal variable gidier
		// JAVA PBV'dir bunun istisnasi ise list'deki set methodu istisnadir, method icinde yapilsa bile degisiklikleri kalici olarak yapar.
	}

	public static void degistirSet(List<Integer> list) {
		
		for (int i = 0; i < list.size(); i++) {
			list.set(i, list.get(i)+3); // i. indexi elemani getirecek buna +3 ekleyecek 0.index 10 gelecek sonra 10+3'den 13 olacak
		}
		System.out.println("Set ile degistirdigimiz liste method icinde : " + list);
		
	}

	public static void degistirFor(List<Integer> list) { // Bunu burada yazdiracagiz yani void'li hali ile.
		
		for (Integer w : list) {
			w+=3;
			System.out.print(w + " "); // 13 14 15 ama burada degisen degerler clone'lar idi . 
			
			
			
		}
		
		
	}

}
