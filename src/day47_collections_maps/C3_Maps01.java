package day47_collections_maps;

import java.util.HashMap;

public class C3_Maps01 {

	public static void main(String[] args) {

		
		/*
		   Bir database'den Javaya gecis "MAP" ile olur %99, cok istisnai durumlar haric.
		   Maps key – value pairs kullanir. ( anahtar –deger(ler) ). Key’ler unique olmalidir.
		   
		   1) HashMap synchronized degildir. Thread-safe degildir.
		   2) HashTable synchronized’dir. Thread-safe’dir ve thread’ler tarafindan ortak kullanilabilir.
		   3)TreeMap synchronized degildir. Thread-safe degildir.
		   
		   Okul Programi dusunelim , Yeni kayit olmadikca veya ayrilan olmadikca database'im degismez. 
		   Okulda 500 ogrenci olsun . Ogreci Map'ine yuklerim. Okuma islemlerini hic database'e baglanmadan yaparim.
		   Update gerekmedikce gerektiren bir islem oldugunda database'e baglanir islemi yaparim. 
		   Sonra hemen yeni ogrenci map olustururum. NOT : BIR DAHA IZLE DAHA IYI NOT AL.
		 */
		
		HashMap<Integer,String> objeMap = new HashMap<>();
		
		objeMap.put(101, "Ali, Can, Java"); 
		objeMap.put(102, "Veli, Yan, Java"); 
		objeMap.put(103, "Ali, Yan, C#");
		
		System.out.println(objeMap); // {101=Ali, Can, Java, 102=Veli, Yan, Java, 103=Ali, Yan, C#}
		// Eger bir esitlik gorursek orada Map kullanilmis demektir.

	}

}
