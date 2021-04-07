package day45_iterators;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C1_LinkedList01 {

	public static void main(String[] args) {
		/*
		 Linked : Bagli demektir. 
		 LinkedList : Tum elemanlar, tek sira halinde (tren gibi) birbirine baglidir.
		 Ilk eleman Head'dir ve sadece adres icerir.
		 Head (sadece adres icerir) 2 parcadan olusur. Adres (pointer) , Value(Deger). Node = Adres + Value.
		 Biz bir linkList olusturdugumuzda Java bir Head (Heap memory'de) olusturur. Ikinci bir eleman ekledigimde onu rastgele bir 
		 yerde olusturur fakat 1. olusturulan 2. olusturulani ifade eder 2 3'u , 3 4'u .... seklinde gider. 
		 Tum adresler birbirini gosterir. Son eleman artik benim gosterecegim bir sey yok der ve null'i gosterir.
		 
		 Slaytta yazilanlar : 
		 
		 1) Ilk eleman her zaman head’dir ve head’de data yoktur, sadece address vardir.
		 2) Son eleman(tail) null’i point eder.
		 3) Her elemanin icinde data ve address kismi olmak uzere iki kisim vardir.
		 4) Tum elemanlar pointer’lar ve address’ler kullanilarak birbirine baglanir.
		 5) Her eleman node olarak adlandirilir.
		 6) Array’lerden daha dynamic’dirler insert(ekleme) ve delete(silme) islemlerinde basarilidirlar.
		 7) Bir elemana ulasmada yavastirlar cunku index kullanmazlar.
		 */
		
		// List nasil olusturuluyorsa LinkList'de oyle olusturulur, bir tek Collection'a dikkat etmek lazim.
		// Collections'da obje olustururken olusturmak istedigimiz collection'in Class mi yoksa Interface mi olduguna bakmaliyiz.
		// Eger olusturmak istedigim collection interface ise data type olarak o interface'i, constructor olarak ise uygun bir class secmeliyiz.
		// Simdiye kadar List(Interface) olustururken cons. olarak ArrayList() seciyorduk.
		
		List<String> liste = new ArrayList<>(); // Bu list icin.
		liste.add("X");
		liste.add("Y"); 
		
		LinkedList<String> ll1 = new LinkedList<>(); // LinkList bir class'dir , class'lardan obje uretilebilir. 
		
		ll1.add("A");
		ll1.add("B");
		System.out.println(ll1); // [A, B]
		
		ll1.add(1, "C"); 
		System.out.println(ll1); // [A, C, B]
		
		ll1.addAll(liste); // Listeyi LinkedList'e ekledim. Bir listeyi veya herhangi bir collection'i eklemek icin adAll method()'u kullanirim.
		System.out.println(ll1); 
		
		ll1.addAll(2, liste); // 2. index'e liste'yi ekler.
		System.out.println(ll1); // [A, C, X, Y, B, X, Y]
		
		ll1.addLast("K"); // Normalde sadece add kullansaydim da sona ekleyecekti ? Neden boyle bir method'a ihtiyac duyduk ? 
		// LinkedList'in 2 tane parent'i vardir (List ve Queue) .
		
		// LinkedList, Link ve Queue interface'lerine implement ile child oldugundan 
		// her iki interface'deki tum method'lari override etmek zorundadir.
		// Islev olarak ayni isi yapan addLast() queue'dan ve add() ise List'den inherit edilmistir.
		
		// Bir linkedlist olusturalim ama sadece List ozelliklerini tasisin dersek , obje olustururken data type'i List yaparim.
		List<String> listlist = new LinkedList<>();
		listlist.add("Sadece List'ten gelen ozellikler var");
		
		// Bir linkedlist olusturalim ama sadece List ozelliklerini tasisin dersek , obje olustururken data type'i List yaparim.
		Queue<String> queueList = new LinkedList<>();
		queueList.add("Sadece queue'dan gelen ozellikler var");
		
		
		
	}

}
