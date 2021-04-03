package day27_arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C3_Arraylists03 {

	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(10);
		list1.add(20);
		System.out.println(list1);
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(20);
		list2.add(10);
		System.out.println(list2);
		
		System.out.println(list1.equals(list2)); // False
		
		List<Integer> list3 = new ArrayList<>();
		list3.add(10);
		list3.add(20);
		
		System.out.println(list1.equals(list3)); // True
		// equals() methodu 2 listeyi hem elemanlar hem de elemanlarin index'leri ile karsilastirir 
		//  hem elemanlar hem index esit ise True doner yoksa False doner
		
		Collections.sort(list1); // [10,20]
		Collections.sort(list2); // [10,20]
		System.out.println(list1.equals(list2)); // True
		
		list1.clear(); // tum elemanlari siler ve bos bir liste verir
		System.out.println(list1); // []
		
	}

}
