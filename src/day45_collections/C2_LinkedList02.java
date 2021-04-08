package day45_collections;

import java.util.LinkedList;

public class C2_LinkedList02 {

	public static void main(String[] args) {
		
		LinkedList<Object> ll1 = new LinkedList<>();
		// Collections'da esitligin sol tarafinda <> icinde data type yazilmasa veya data type olarak Object yazilsa collections calisir.
		// Ama boyle bir kullanimda surekli testin yapildigi icin zaman ve hafiza acisindan verimli degildir.
		// Hizlarina bakmak istersek LocalTime ile bakabiliriz. 03 class'inda. Object olunca java surekli yeni object olusturuyor ve
		// bu da javayi hem yoruyor hem de hafizayi kullaniyor . Soyle dusunebiliriz biz burada 1 2 object olusturuyoruz belki ama
		// buyuk siteler bunu gunde milyonlarca kez yapiyor ve hiz bu acidan cok onemli bir hal aliyor.
		
		ll1.add("A");
		ll1.add(10); // LinkedList<String> ll1 = new LinkedList<>(); String ile olusturmustuk o yuzden sadece String olanlari kabul ediyordu.
		ll1.add('A');  // String yerine Object kullanirsak hepsini kabul eder cunku Object ilk Class'lardir. Parent'larin parent'idir.
		System.out.println(ll1); // [A, 10, A]
		
		LinkedList ll2 = new LinkedList<>(); // <Object> kismini sildim. Kabul ediyor hala . Collection flexibil old. icin kabul ediyor 
		// ama sari uyarilarda veriyor yani cok memnun degil bu durumdan. 
		
		ll2.add("B"); 
		ll2.add(20); 
		ll2.add('B'); 
		System.out.println(ll2); // [B, 20, B]
		
		LinkedList<String> ll3 = new LinkedList<>();
		
		ll3.add("C");
		ll3.add(""+30); // LinkedList<String> ll1 = new LinkedList<>(); String ile olusturmustuk o yuzden sadece String olanlari kabul ediyordu.
		ll3.add(""+'C');  // String yerine Object kullanirsak hepsini kabul eder cunku Object ilk Class'lardir. Parent'larin parent'idir.
		System.out.println(ll3); // [C, 30, C]

	}

}
