package day45_collections;

import java.util.LinkedList;

public class C3_LinkedList03 {

	public static void main(String[] args) {

		LinkedList<String> ll1 = new LinkedList<>(); // LinkList bir class'dir , class'lardan obje uretilebilir. 
		
		ll1.add("A");
		ll1.add("B");
		System.out.println(ll1); // [A, B]
		
		System.out.println("\n=====INDEXLI REMOVE======");
		System.out.println(ll1.remove(0)); // A // remove(index) indexdeki elemani siler ve sildigi elemani bize dondurur.
		System.out.println(ll1); // [B]
		
		ll1.add("A");
		ll1.add("B");
		System.out.println(ll1); // [B, A, B]
		
		System.out.println("\n=====DEGERLI REMOVE=====");
		System.out.println(ll1.remove("B")); // true veya false dondurur. 
		// Yani remove icine index yazarsak sildigi degeri kanit olarak getirir AMA
		// Remove icine BIR DEGER yazarsam onu sildim anlaminda true veya false dondurur.
		System.out.println(ll1); // [A, B]
		
		System.out.println("\n=====FIRST OCCURRENCE=====");
		ll1.addFirst("B"); 
		System.out.println(ll1); // [B, A, B]
		ll1.removeFirstOccurrence("B"); // Ilk buldugu B harfini siler.
		System.out.println(ll1); // [B, A]
		System.out.println(ll1.removeFirstOccurrence("B")); // True dondurur
		System.out.println(ll1.removeFirstOccurrence(0)); // FALSE // Index olarak yazamiyoruz****
		// Eger listemiz integer'lardam olusuyorsa parantez icine yazdigimiz sayinin index mi yoksa sayi mi old.
		// karistirmamak icin Java parantez icine yazilani index olarak kabul eder.
		// System.out.println(ll1.removeFirstOccurrence("B")); bu method int.'lar icin calismak yukardaki aciklamadan dolayi
		
		// Occurrence kullanim demektir. removeFirstOccurence Ilk kullanimi kaldir anlamindadir.
		
		System.out.println(ll1);
		
		ll1.add("K");
		ll1.add("N");
		System.out.println("\n=====SADECE REMOVE=====");
		System.out.println(ll1); // [A, K, N]
		System.out.println(ll1.remove()); // Ilk indexi siler ve kanit olarak onu getirir.
		System.out.println(ll1); 
		
	}

}
