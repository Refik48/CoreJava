package day27_arraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C5_ArrayLists05 {

	public static void main(String[] args) {
		
		// Verilen listeyi Array'e nasil ceviririz ? 
		
		List<String> list = new ArrayList<>();
		list.add("Ali");
		list.add("Veli");
		list.add("Hasan");
		
		String arr [] = list.toArray(new String[3]); // new String[0] yazarsak olusturduktan sonra yeni bir eleman ilave edemiyoruz. 
		// Yukarda kac tane eleman yazdiysam o uzunlugu koruyor. Sonradan eleman eklemek icin burada ki 0'i degistirmem lazim .
		// new String[4] mesela 4 yazinca artik sonradan fazladan bir eleman daha yazabilmek icin bir bosluk olusturuyorum
		
		list.add("k");
		System.out.println(list);
		arr[3]="a";
		
		System.out.println(Arrays.toString(arr));
		
		/*
		  Array : boyut sayısının belli olduğu ve değerlerin çok sık değiştirilmediği durumlarda kullanılır. 
          Daha sonradan boyutu değiştirilemiyor.
          
          ArrayList : Boyutu dinamik yani değişken ve değerlerin hızlı değişmesi durumunda daha hızlı çalışır.
         
          ArrayList ve array Arasında Seçim: Programcı, ne zaman ArrayList ve ne zaman array kullanması gerektiği konusunda ikileme düşebilir. 
          Eğer, depoya konulacak öğe sayısı belirli ve o sayı sık sık değişmeyecekse array seçimi uygun olur. 
          Ama öğe sayısı baştan bilinemiyor ya da o sayı sık sık değişiyorsa ArrayList doğru bir seçimdir. 
          
          Tabii, buna ek olarak şunu söylemeliyiz: ArrayList nesnelerin depolanması içindir. 
          İlkel veri tipleri depolamak için array seçilmesi uygun olur.
          Bütün bunların ötesinde ArrayList sınıfı List arayüzünün metotlarını kullanma yeteneğine sahiptir; 
          dolayısıyla array yapısına oranla programcıya daha çok kolaylık sağlar.
         */

		
		
	}

}
