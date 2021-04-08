package day46_collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class C4_LinkedHashSet {

	public static void main(String[] args) {
		
		// Tekrarli eleman kabul etmezler
		// Elemanlari ekleme sirasina (insertion order)'e gore dizerler.
		// Ekleme ve remove islemleride hizlidirlar.
		// LinkedHashSet, HashSet'den yavastir.
		
		Set<String> set1 = new LinkedHashSet<>();
		
		set1.add("D"); // 23.satirdan sonra yazdim
		set1.add("B"); // 22. satirdan sonra yazdim.
		set1.add("A");
		set1.add("F");
		set1.add("D");
		System.out.println(set1); // [A, F, D] Ekleme sirasina gore yazdirdi. 
		// 18. satira bir ekleme daha yaptim B diye [B, A, F, D] oldu. 
		// 17. Satira bir ekleme daha yapip D ekledim ve D'yi basa yazdi ama tekrardan dolayi sona yazmadi. [D, B, A, F]
		
		System.out.println(System.currentTimeMillis());
        for (int i = 0; i < 10000; i++) { // 17 milisaniye / TreeSet daha yavas.
            set1.add(""+i);
        }
        
        System.out.println(System.currentTimeMillis());
        
        System.out.println("=================");
        
        Set<String> set2 = new HashSet<>();
        System.out.println(System.currentTimeMillis());
        for (int i = 0; i < 10000; i++) { // 7 milisaniye / HashSet Daha hizli.
            set2.add(""+i);
        }
        
        System.out.println(System.currentTimeMillis());

	}

}
