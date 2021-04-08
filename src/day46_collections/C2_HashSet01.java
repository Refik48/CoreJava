package day46_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C2_HashSet01 {

	public static void main(String[] args) {
		
		// Verilen bir Array'deki tekrarli silip unique elemanlardan olusan bir Array'e ceviren bir method yaziniz.
		
		int arr [] = {2,3,4,3,5,3,6,4,7,8,5,6};
		
		int tekrarsizArray [] = tekrarlariSil(arr);
		
		System.out.println("Main method icinde array olarak : " + Arrays.toString(tekrarsizArray));

	}
	
	public static int [] tekrarlariSil(int [] arr) {
		
		Set<Integer> set1 = new HashSet<>(); // Set olusturduk
		
		for (Integer each : arr) { // Array'daki her bir elemani Set'e ekleyerek tekrarlardan kurtulduk
			set1.add(each);
		}
		System.out.println("Set olarak method icinde : " + set1); // [2, 3, 4, 5, 6, 7, 8]
		
		int tekrarsizArray [] = new int [set1.size()]; // Set'in size'ini alip bu buyuklukte bir Array olusturduk.
		int index = 0;
		for (int w : set1) { // Neden foreach loop kullandik ? Cunku Set'de index yok . Yani for'u kullanamam cunku orada index gerekiyor, 
			tekrarsizArray[index] = w; // burada ise kendisi tek tek aliyor. Set'deki elemanlari Array'e ekledik.
			index++;            // Array index'e ihtiyac duydugu icin int index = 0; local variable'ini olusturduk.
		}
		
		return tekrarsizArray;
	}

}
