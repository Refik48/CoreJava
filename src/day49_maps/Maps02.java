package day49_maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Maps02 {

	public static void main(String[] args) {
		
		// Verilen bir String’deki harfleri ve harflerin kacar kez kullanildigini return eden bir method yaziniz ?
		// Ornek : Input : Hellooo , Output : H=1, e=1, l=2, o=3
		
		// Soruya baslamadan 2 sey belirlemem gerekiyor . 
		// 1) Method'a ne gidecek ? String input = Hellooo;
		// 2) Method ne return edecek ? Map<String, Integer>
		
		String input = "Hellooo";
		Map<String,Integer> methoddangelenMap = harfSayisiBul(input);
		System.out.println("CEVABIMIZ : " + methoddangelenMap);


	}

	public static Map<String, Integer> harfSayisiBul(String input) {
		
		String harfler [] = input.split(""); 
		System.out.println(Arrays.toString(harfler)); // [H, e, l, l, o, o, o]
		Map<String, Integer> map = new HashMap<>();
		
		for (String w : harfler) { // Benim bir map'e ihtiyacim var , tek tek harfleri alacagim ve o harfler map'de var mi diye bakacagim.
			// Eger Map'de yoksa ekleyecegim . Eger var olan tekrardan gelirse (bkz : L harfi) , L koymayacagiz onun yerine , L olani bul
			// ve value'sunu +1 yap diyecegim.
			
			if(!map.containsKey(w)) { // System.out.println(harfKullanimSayisi); 
				map.put(w, 1);        // Her birini yazdirdi ama value'lar gene ayni kaldi (hepsinde 1)
				
			} else { // Value'lari 1 arttiracagim.
				map.put(w, map.get(w)+1); // Hepsinin value'su suan 1 fakat tekrar eden olursa onun value'suna 1 ekleyecek.
			}
		}
		
		return map;
	}

}
