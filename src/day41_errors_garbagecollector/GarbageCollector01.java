package day41_errors_garbagecollector;

import java.util.ArrayList;
import java.util.List;

public class GarbageCollector01 { // Java'da GarbageCollector isimli bir class olabilir diye o yuzden sonuna 01 koydum
	  // (Not : Baktim yokmus olsun gene de riske gerek yok idi)

	public static void main(String[] args) {
		
		String str = "";
		for(int i = 0; i<1000; i++) {
			str+=i;
		}
		
		/*
		 * Bu kod calistiginda kac tane obje olusur ? 
		 * 1001 tane olusturur.
		 * Ilk basta 1 tane olusturduk sonra her dongude str'a concatination yapilacak ama String Class'i immutable old. icin
		 * her yerni degeri koymak icin yeni bir String objesi olusturulur ve eski objeden pointer silinir.
		 * Dolayisiyla loop bittiginde str icin 1 tane pointer'in isaret ettigi obje, 1000 tane de hic bir pointer'in isaret etmedigi 
		 * obje heap memory'de bulunur.
		 */
		
		List <Integer> List = new ArrayList<>(); 
		// Bu satir java'ya yeni bir obje olusturmasini soyluyor
		// New keyword'u yazdigimizda yer var mi diye heap memory'i kontrol eder ve memory kritik seviyede ise
		// gabage collector'u devreye sokar.
		
		// Teknik kismi
		// Garbage collector finalize() methodunu calistirir,
		// finalize method'u silinecek objeleri isaretler ve sonra Garbage Collector finalize olan objeleri siler.
		
	}

}
