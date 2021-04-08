package day46_collections;

import java.util.HashSet;
import java.util.Set;

public class C1_Set01 {

	public static void main(String[] args) {
		
		Set<String> set1 = new HashSet<>();
		
		set1.add("F");
		set1.add("B");
		set1.add("A");
		set1.add("B");
		set1.add("C");
		set1.add("B");
		set1.add("A");
		
		System.out.println("set1 : " + set1); // [A, B, C, F] 
		System.out.println(set1.hashCode()); // 268 
		
		set1.add("Z");
		set1.add("K");
		set1.add("N");
		
		System.out.println("set1 : " + set1); // [A, B, C, F, Z, K, N]
		// Set'de onemli olan ozellik No dublication(tekrar eden yok) ve elemanin kumede var olup olmamasidir.
		// Siralama Set icin onemli degildir.
		// Set icin elemanlari girdigimiz sirada verir veya elemanlari natural siralama ile verir gibi bir cumle KULLANAMAYIZ.
		
		System.out.println(set1.hashCode()); // 511
		// Collections'da hashCode() method'u o collection icindeki tum elemanlarin hash code'larinin TOPLAMINI verir.
		// Yeni eleman eklersek dogal olarak hashCode()'da degisir.
		

	}

}
