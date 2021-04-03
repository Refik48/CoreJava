package day25_arrays;

import java.util.Arrays; //*************************************************53. SATIRA BAK****************************************************

public class Arrays02_StringeCevirme {

	public static void main(String[] args) {
		// verilen array'de bir elemanin var olup olmadigini nasil kontrol ederiz ?
		
		int arr [] = {10,25,3,16,75};
		
		int sayi = 25; // bu sayinin array'de var olup olmadigini nasil sordurabiliriz.
		
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==sayi) {
				flag=true;
			}
		}
		
		if (flag) { // True olursa ust taraf false olursa else kismi calisiyor ? o.O
			System.out.println("array sorulan elemani iceriyor");
		} else {
			System.out.println("array sorulan elemani icermiyor");
		}
		
		// Arrays class'indan method kullanarak yapalim
		System.out.println("28.SATIR");
		Arrays.sort(arr); // ilk once siralama yapmaliyiz
		System.out.println(Arrays.toString(arr)); // [3, 10, 16, 25, 75]
		Arrays.binarySearch(arr, sayi); // Arrays.binary yazdiktan sonra parametrelerden istedigimizi secebiliriz
		System.out.println(Arrays.binarySearch(arr, 25)); // Sonuc olarak true veya false degil onun indexini doner
		
		
		
		// 25 yaziyor yukarda neden 3. indexi verdi ???
		// Cunku sort yaptik array siralandi [3,10,16,25,75] seklinde oldu 25 burada 3. index o yuzden sonuc ekrani 3 veriyor
		System.out.println(Arrays.binarySearch(arr, 10)); // 10 sayisi 1. index
		
		System.out.println(Arrays.binarySearch(arr, 28)); // -5 veriyor neden ? Cunku java eger pozitif olsaydi bu sayi
		// 25 ile 75 arasinda olacakti, bununda indexi 4 oluyor buraya gore fakat java index olarak degil kacinci sirada ki sayi olurdu diye
		// bakiyor o da 5. sayiya denk geliyor.      [3, 10, 16, 25, 75]
		System.out.println("41.SATIR");
		System.out.println(Arrays.binarySearch(arr, 5)); // Bu sayi yok ama olsaydi 2. sayi olurdu anlaminda (-2)
		System.out.println(Arrays.binarySearch(arr, 1000)); // -6
		
		/*
		 * Binary search sonuc olarak aradigimiz eleman varsa indexini verir ,
		 * Aradigimiz eleman yoksa olsaydi kacinci eleman olacagini (index degil siralama olarak) - isareti ile donduruyor.
		 */
		
		 int arr2[]= {12,15,25,14,3,12,65};
	        
	        Arrays.sort(arr2); 
	        System.out.println(Arrays.toString(arr2)); // [3,12,12,14,15,25,65]
	        System.out.println(Arrays.binarySearch(arr2, 14)); // 3
	        System.out.println(Arrays.binarySearch(arr2, 20)); // -6
	        System.out.println(Arrays.binarySearch(arr2, 12)); // 1 // Ayni iki sayi varsa ilk olanin indexini verir.
	        System.out.println(Arrays.binarySearch(arr2, 2)); // -1

		// Array nasil String'e cevrilir ??
		
		String arrayString = Arrays.toString(arr); // Bunun ne onemi var ? Bunu artik String'e cevirdik boylece 
		// Bizim ogrendigimiz String manupalation methodlarini kullanabiliriz ******************ONEMLI BAYA*****************
		System.out.println(arrayString);
	    System.out.println(arrayString.substring(5)); // bastaki [ dahil tum array'i String'e cevirir
		
	}

}
