package day44_iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterator04 {

	public static void main(String[] args) {
		
		// Iterator'i kullanarak listenin elemanlarini sondan basa dogru yazdirin.
		
		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(13);
		list.add(56);
		list.add(23);
		list.add(45);
		list.add(14);
		list.add(40);
		
		System.out.println(list); // [2, 13, 56, 23, 45, 14, 40]
		
		ListIterator li = list.listIterator(); 
		
		while(li.hasNext()) { // Imleci sona goturmek icin bos bir while loop olusturdum.
			li.next();        // Tek tek butun elemanlardan gecerek imleci sona goturdu.
		}
		
		while(li.hasPrevious()) { // Ilk elemandan oncesi var mi diye sorguluyoruz ama bize ilk once sondaki eleman lazim.
			                     // Sondaki elemana gitmek icin once bos bir while loop yaziyorum 26.satira
			System.out.print(li.previous() + " "); // Imlec sonda idi simdi o imlecten bir oncesine git ve yazdir diyorum.
		}
		System.out.println("");
		System.out.println(list); // Listeyi degistirmedik sadece listeye bakip sondakini yazdir seklinde bir islem yaptik.

	}

}
