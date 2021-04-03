package day28_foreachloop;

import java.util.ArrayList;
import java.util.List;

public class C3_ForEachLoop03 {

	public static void main(String[] args) {
		
		// Verilen bir array'daki tum elemanlari bir listeye aktaran bir method yaziniz.
		
	   String arr []= { "Ali","Veli","Ayse","Fatma"};
	   
	   List <String> list = listeyeCevir(arr);

	   list.add(0, "Bu is bu kadar"); // Array'dan List'e cevirdigimiz zaman eleman ekleyemiyorduk yani uzunlugunu degistiremiyorduk
	   // fakat bizim burada array'dan list'e cevirme yapmadim . Yeni bir list olusturup array elemanlarini ekledim.
	   // Hatta remove edebiliyoruz list methodlarini kullanabiliyoruz. 19.satir
	   System.out.println(list);
	   list.remove(1); // Ali'yi silecek
	   System.out.println(list);
	}

	public static List<String> listeyeCevir(String[] arr) {
		
		/*
		 * public access modifier 
		 * static olmasinin sebebi main method'dan cagirabilmek icin
		 * listeyeCevir(String[] arr) listeyeCevir kismi isim . (String[] arr) kismi ise Parametredir.
		 * List<String> Return type, bana String bir List dondurecek, nereden anladi ? Biz 14.satiri asiagne ettik, java kendisi otomatik cevirdi
		 * Elimizde String arr var bunu String List'e dondurecegiz
		 */
		List<String> geciciList = new ArrayList<>(); // Elimizde Array ve gececiList var. Array'deki tum elemanlari list'e atmak icin;
		
		for (String w : arr) { // arr'deki her bir String'i aldik ve bunlari geciciList'e add yapacagim
			geciciList.add(w);
		}  
		
		return geciciList;
	}

}
