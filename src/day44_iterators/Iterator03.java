package day44_iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Iterator03 {

	public static void main(String[] args) {
		/*
		 * Bir listedeki istenen sayi araliginda olmayan elementleri silen bir program yaziniz … 
		 * (2. liste olusturmadan, gecerli liste uzerinde islem yapiniz)
		 * Orn : [2,13,56,23,45,14,40] istenen aralik 20 ile 40 arasi (sinirlar dahil) output: [23,40]
		 */
		
		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(13);
		list.add(56);
		list.add(23);
		list.add(45);
		list.add(14);
		list.add(40);
		ListIterator li = list.listIterator();
		
		while(li.hasNext()) {
			
			int temp = (int) li.next(); // Cunku if icerisinde 2 kez li.next yazilacakti ve 2 kez next olacakti sayi.
			if(temp<20 || temp>20) {
				li.remove();
			}
		}
		System.out.println(list);

	}

}
