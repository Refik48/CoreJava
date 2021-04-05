package day44_iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator01 {
	/*
	  - Java iterator, collection elemanlarimizin arasinda gezinmemize ve elemanlari degistirmemize yarar.
	  - Collections'da her element index yapisini desteklemez, index olmayan
	 */

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		System.out.println(list); // [A, B, C, D]
		
		// Her elemana B ekleyelim.
		
		for (String w : list) {
			w+="B"; // Olmaz cunku
			System.out.print(w + " ");
		}
		System.out.println(" ");
		System.out.println(list);
		
		// Collections'da her yapu index'i desteklemez. Ornegin Set'de index olmaz.
		// Index olmayinca mecburen tum elemanlara ulasmak icin For-Each loop kullanilir.
		// For-each loop ile de update veya delete yapamayiz.
		// Bunun icin Java Iterator interface'ini olusturmustur.
		
		Iterator it1 = list.iterator(); // Biz hangi obje uzerinde hangi collection uzerinde, iteration yapacaksak onun uzerinden iteration yapiyoruz.
		// Iterator 4 tane method'a sahiptir. 
		// 1) next() bir sonrakine elemana gider ve gittiginin delili olarakta old. harfi dondurur oyle gider.
		// 2) hasNext() booleandir bir sonraki eleman var mi diye sorar, varsa true doner.
		// 3) remove() o anki elemani silmeye yarar.
		// 4) forEachRemaining()
		
		// Listedeki tum elemanlari iterator kullanarak silelim.
		
		while(it1.hasNext()) { // it1.hasNext() sonraki elemana kadar calis anlamina gelir, while ici bitis kosulu yazilir.
			
			it1.next(); // 
			it1.remove();
		}
		System.out.println(list); // []
		list.size(); // 0
	}

}
