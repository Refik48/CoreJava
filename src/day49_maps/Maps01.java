package day49_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Maps01 {

	public static void main(String[] args) {
		
		Map<Integer,String> map1 = new HashMap<>();
		map1.put(101, "Ali, Can, Java");
		map1.putIfAbsent(102, "Veli, Yan, Java");
		map1.put(103, "Ali, Yan, C#");
		
		System.out.println(map1); // {101=Ali, Can, Java, 102=Veli, Yan, Java, 103=Ali, Yan, C#}
		System.out.println(map1.size()); // 3
		
		System.out.println("=====Map entrySet=====");
		System.out.println(map1.entrySet()); // [101=Ali, Can, Java, 102=Veli, Yan, Java, 103=Ali, Yan, C#] 
		// Ayni sekilde yazdirdi ama [ ] parantezleri ile yazdirdi Set'e cevirdi .
		
		System.out.println(map1.entrySet().size()); // 3 Normalde virgullerden dolayi 9 eleman diyebilirsiniz sonucta Set'e cevirdik diyip fakat
		// 101=Ali, Can, Java 1 eleman / 102=Veli, Yan, Java / 103=Ali, Yan, C# olarak dusunuyor. entry key, value ikilisinden olusan tum eleman
		
		System.out.println("\n=====Map Set'e donustu=====");
		// Set<String> mapdenSet = map1.entrySet(); // Set'e cevirirsek hata veriyor asagiya duzeltilmis halini yazdim.
		Set<Entry<Integer, String>> mapdenSet = map1.entrySet();
		
		for (Entry<Integer, String> w : mapdenSet) {
			System.out.println(w);
			// 101=Ali, Can, Java
			// 102=Veli, Yan, Java
			// 103=Ali, Yan, C#
		}
		
		System.out.println("\n=====Map equals=====");
		System.out.println(map1.equals(mapdenSet)); // False / Icindeki elemanlar ayni olsa bile birisi map diger set yani 
		// ikisi birbirine esit olamaz. Map'lerin ayni olabilmesi icin bire bir ayni olmasi gerekiyor.
		
		System.out.println("\n=====Map get====="); // En cok kullanilan method'lardan birisi.
		System.out.println(map1.get(101)); // Ali, Can, Java
	}

}
