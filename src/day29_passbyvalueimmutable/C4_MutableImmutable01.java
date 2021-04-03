package day29_passbyvalueimmutable;

import java.util.ArrayList;
import java.util.List;

public class C4_MutableImmutable01 {

	public static void main(String[] args) {

		/*
		 * Immutable (Degismez) class'lar,objeleri bir kez oluşturulduktan sonra değiştiremedigimiz class’lardir.
		 * Mutable (Degisir) class'lar, ise tam tersi olarak, olusturdugumuz objeleri değiştirebildigimiz class’lardir.
		 * String ve tum Wrapper (Integer,Long,Double...) immutable classlardir. 
		 * Date,StringBuilder,StringBuffer,Arrays ve ArrayList'ler mutable classlar'dir
		 * Neden siniflara ihtiyac duyuyoruz ? Cunku thread safe(guvenli es zamanli calisma) konusudur. Immutable nesnelerin
         * değerleri değişmeyeceği için üzerinde kaç tane thread çalışırsa çalışsın hep aynı değerler üzerinden işlem yapılacaktır.
         * Immutable class’dan olusturulan objeler de immutable olurlar. Bu tur bir object’i oluşturabiliriz, fakat onları değiştiremeyiz. 
         * Bunun yerine, immutable bir  objeyi değiştirmek istersek, Java o objeyi klonlar ve yapilan degisiklikleri 
         * klonlanmis yeni obje uzerinde gerceklestirir.
		 */

		String isim ="Ali";
		isim.concat("can"); // concat Ekleme yontemidir fakat String Immutable bir class oldugu icin kalici degisiklikler yapamam 
		// yapmak istersen soyle yapabilirim ;
		System.out.println(isim); // Hala Ali
		System.out.println(isim.concat("can")); // Bu satira ozel alican olur fakat bundan sonra ki satirlarda Ali olmaya devam eder.
		
		System.out.println(isim); // Ali
		
		List<String> isimList = new ArrayList<>();
		System.out.println(isimList); // [] bos deger
		isimList.add("Ali");
		isimList.add("Can");
		System.out.println(isimList); // [Ali, Can] . List uzerinde methodla yaptigimiz degisiklikler List uzerinde kalici degisiklikler yapiyor
		isimList.remove(1); 
		System.out.println(isimList); // [Ali] // Yani List'ler bir mutable bir class'dir.
		
	}

}
