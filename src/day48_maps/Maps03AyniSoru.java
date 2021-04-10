package day48_maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Maps03AyniSoru {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();

		map.put(101, "Ali, Can, java");
		map.put(102, "Veli, Yan, java");
		map.put(103, "Ali, Yan, C#");
		
		String dil = "java";
		List<String> list = javaOlanlar(map, dil); 
		System.out.println(list);

	}

	public static List<String> javaOlanlar(Map<Integer, String> map, String dil) {
		
		List<String> methodList = new ArrayList<>();
		
		for(String w : map.values()) { // Bu method ile map'den collection'a gecis yaptim ve artik foreach kullanabilirim.
			
			String arr [] = w.split(", "); // Collections'daki stringleri array'e cevirerek indexlerine bakiyorum.
			
			if(arr[2].equalsIgnoreCase(dil)) {
				methodList.add(arr[0]);
			}
			
		}
		return methodList;
	}

}
