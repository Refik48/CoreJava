package day27_arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C6_ArrayLists06 {

	public static void main(String[] args) {
		
		/*
		 *  ArrayList ve array Arasında Seçim: Programcı, ne zaman ArrayList ve ne zaman array kullanması gerektiği konusunda ikileme düşebilir.
		 *  Eğer, depoya konulacak öğe sayısı belirli ve o sayı sık sık değişmeyecekse array seçimi uygun olur. 
		 *  Ama öğe sayısı baştan bilinemiyor ya da o sayı sık sık değişiyorsa ArrayList doğru bir seçimdir. 
		 *  Tabii, buna ek olarak şunu söylemeliyiz: ArrayList nesnelerin depolanması içindir. 
		 *  İlkel veri tipleri depolamak için array seçilmesi uygun olur. 
		 *  Bütün bunların ötesinde ArrayList sınıfı List arayüzünün metotlarını kullanma yeteneğine sahiptir; 
		 *  dolayısıyla array yapısına oranla programcıya daha çok kolaylık sağlar.
		 */
		
		// Verilen bir array'da ki tekrarli elemanlari silip, tekrarsiz bir array olusturmak istiyoruz.
		// array veya list kullanarak bunu yapiniz.
		
        int arr [] = {1,2,3,5,1,2,4,3,5,1,6,7,1,2,6,4,2};
		
		List<Integer> list = new ArrayList<>(); // her elemani sirayla1 kontrol ettirip yazdiracagiz, tekrar eden varsa yazdirmayacagim.
		
		for (int i = 0; i < arr.length; i++) {
			
			if (!list.contains(arr[i])) { // ! var , eger i'yi arr icermiyorsa anlaminda burasi
				list.add(arr[i]);  // Burasi da icermiyorsa ekle anlaminda.
			}
			
		}
		System.out.println(list);
		Integer tekrarsizArray[] = list.toArray(new Integer[0]); // Soruda en son array'e cevirin dedigi icin cevirdik.
	}
}
