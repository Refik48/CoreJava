package day27_arraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C1_ArrayLists01 {

	public static void main(String[] args) {

		 List<String> list = new ArrayList<>();
		
			list.add("Ali");
			list.add("Can");
			list.add("Ayse");
			list.add("Fatma");
			
			System.out.println(list); // [Ali, Can, Ayse, Fatma]
			
			list.set(2, "Kemal"); // [Ali, Can, Kemal, Ayse] index'i 2 olani kaldirir ve kemal getirir.
			System.out.println(list);
			
			list.set(0, "Ramazan"); // list.add(0, "Ramazan"); yazsaydik yerine gecmezdi, 0.indexi bir saga kaydirip Ramaz yazardi
			System.out.println(list); // ama set methodunda kaldirip yerine yaziyor.
			
			list.add(0, "Mubarek"); // Kaldirmadi 0. indexi onlara saga kaydirip kendisi 0.index'e gecti
			System.out.println(list);
			
			list.add(5, "Hurriyet");
			System.out.println(list); // index+1 olan yer sinirda diye yazdirir ama daha fazlasini yazdirirsak RTE verir.
			
			list.contains("Hurriyet"); // Bu bir sorudur, listede Huriyet diye eger bunu yazdirirsak TRUE ya da FALSE degerlerinden birini verir.
			System.out.println(list.contains("Hurriyet")); // True
			System.out.println(list.contains("Mehmet")); // False
			
			// list.set(4, "Haci"); //olmayan bir method kullanilirsa RTE verir
			
			// Eger alfebatik olarak siralamak istersem normalde array'de SORT vardi, fakat arraylist'te durum biraz farkli ;
			
			list.add("esra");
			Collections.sort(list); // Alfabetik siraya gore ArrayList'leri siralar.
			System.out.println(list); // [Can, Fatma, Hurriyet, Kemal, Mubarek, Ramazan]
			
			int arr [] = {12,95,6,7};
			Arrays.sort(arr);
			System.out.println(Arrays.toString(arr)); // Array'lerde sort method syso icinde kullanilamaz.          		
	}
}
