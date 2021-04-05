package day44_iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterator02 {

	public static void main(String[] args) {
		
		// ListIterator daha fazla method'a sahip old. icin daha cok kullanilir
		// ListIterator, Iterator interface'in child'idir. 
		// Iterator ile ListIterator arasindaki en buyuk farki :
		// Iterator'in koleksiyondaki ogeleri yalnizca ileri yonde hareket ettirebilmesidir. 
		// ListIterator ise bir koleksiyondaki ogeleri hem ileri hem de geri yonde hareket ettirebilir .
		 
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		System.out.println(list); // [A, B, C, D]
		
		// Her elemana B ekleyelim.
		
		ListIterator li1 = list.listIterator();
		
		while(li1.hasNext()) { // Yaninda eleman var mi diye sora sora gidiyor . 
			// En sonra satiri gordukten sonra yaninda kimse var mi diye bakiyor ve false veriyor
			
			String temp = (String) li1.next(); // Yazinca hata verdi sonra (String) bunu yazinca duzeldi sebebini Colllectopns'
			li1.set(temp+"B"); // temp'e B ekle sonra li1'e set et demek. // li1.set(li1.next()+"B"); yazinca da oluyor.
		}
		System.out.println(list);

	}

}
