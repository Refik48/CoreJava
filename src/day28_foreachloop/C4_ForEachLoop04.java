package day28_foreachloop;

import java.util.ArrayList;
import java.util.List;

public class C4_ForEachLoop04 {

	public static void main(String[] args) {

		// iki String array olusturunuz ve bu array’lerdeki ortak elemanlari For-each loop kullanarak bulunuz. Sonucu ekrana yazdiriniz.
		// Ortak eleman yoksa ekrana “Ortak eleman yok” yazdiriniz

		String arr1[]= {"Ali", "Can","Ayse","Seher"};
		String arr2[]= {"Ali", "Veli","Mesut","Seher", "Sedat"};
		String arr3[]= {"Kazim","Ali"};
		String arr4[]= {"Ali"};

		// Ortak elemanlari koymak icin bir List olusturalim
		List <String> ortakElemanlar = new ArrayList<>();
		
		// foreach ile git arr1'deki her bir elemani getir derim, 2. foreach olusturup arr2'deki her elemani getir derim
		// 1. foreach'deki getirdigin eleman ile 2. foreach'deki eleman birbirine esit ise ortak elemanlar List'ine ekle dicem.
		
		for (String w1 : arr1) {
			for (String w2 : arr2) { // Neden equals sectik . Cunku String'lerde equals methodu kullanabiliyoruz. == kullanamiyoruz.
				if(w1.equals(w2)) {
					ortakElemanlar.add(w1); // w1 ya da w2 yazdigim onemli degil cunku iki degerde ayni.
				
		}
				System.out.println(ortakElemanlar);
			
	   }
	}
		
		
	}
}

