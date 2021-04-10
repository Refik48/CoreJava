package day49_maps;

import java.util.HashMap;
import java.util.Map;

public class Maps03 {

	public static void main(String[] args) {
		
		Map<Integer,String> map1 = new HashMap<>();
		map1.put(101, "Ali, Can, Java");
		map1.putIfAbsent(102, "Veli, Yan, Java");
		map1.put(103, "Ali, Yan, C#");
		
		System.out.println(map1.get(101)); // Ali, Can, Java
		System.out.println(map1.get(105)); // null
		
		System.out.println(map1.getOrDefault(101, "Aradginiz key map'de yok")); // Ali, Can, Java / Eger varsa dondurur ve yaziyi calistirmaz.
		System.out.println(map1.getOrDefault(105, "Aradginiz key map'de yok")); // Aradginiz key map'de yok / Yoksa yaziyi dondurur.
		
		System.out.println("\n=====Map Set'e keySet=====");
		System.out.println(map1.keySet()); // [101, 102, 103] 
		
		System.out.println("\n=====Map Set'e remove=====");
		map1.replace(103, "Mezud, Aksu, Java"); // put ile de bu islemi yapabiliriz.
		
		System.out.println("\n=====Map Set'e remove=====");
		map1.remove(101);
		System.out.println(map1);
		map1.remove(105, 4); // Suna bir bak
		System.out.println(map1);
		
		System.out.println("\n=====Map Compute=====");
		Map<String, Integer> map2 = new HashMap<>();
		map2.put("H", 1);
		map2.put("e", 1);
		map2.put("l", 2);
		map2.put("o", 3);
		
		System.out.println(map2);
		
		map2.compute("H", (key, value)->10); // Key'i "H" olan elemani bul . Value'sunu 10 yap diyorum. {e=1, H=1, l=2, o=3}
		System.out.println(map2); // {e=1, H=10, l=2, o=3}
		
		System.out.println("\n=====Map ComputeIfAbsent=====");
		map2.computeIfAbsent("A", value -> 15); // A'nin olmadigi durumda calisacak yani A'yi ekleyecegiz put desek de olurdu . 
		// Key olarak olmayani ekledim, value'sunu da yazdim. (value yazisi bir sembol orada onun yerine a b osman x istedigini yazabilirsin)
		System.out.println(map2);
		
		System.out.println("\n=====Map ComputeIfPresent=====");
		//map2.computeIfPresent("H", 999);
		//map2.computeIfPresent("m", 777);
		System.out.println(map2);
		
	}

}
