package day45_iterators;

import java.util.LinkedList;

public class C4_LinkedList04 {

	public static void main(String[] args) {

		LinkedList<String> ll1 = new LinkedList<>(); // LinkList bir class'dir , class'lardan obje uretilebilir.

		ll1.add("A");
		ll1.add("B");
		System.out.println(ll1); // [A, B]
		
		ll1.contains("A"); // Iceriyor mu diye sordurma islemi yapariz, o yuzden syso icinde yaziyoruz.
		System.out.println(ll1.contains("A")); // true
		
		System.out.println("\n=====ll2 CONTAINS=====");
		LinkedList<String> ll2 = new LinkedList<>();
		
		ll2.add("A");
		ll2.add("B");
		ll2.add("C");
		ll2.add("D");
		System.out.println(ll2); // [A, B, C, D]
		
		System.out.println(ll2.containsAll(ll1)); // ll2 , ll1'yi iceriyor mu diye sorar . TRUE
		System.out.println(ll1.containsAll(ll2)); // ll1 , ll2'yi iceriyor mu diye sorar . FALSE

		System.out.println("\n=====ll2 GET=====");
		System.out.println(ll2.get(2)); // C // 2. indexi getirir.
		System.out.println(ll2.getFirst()); // A
		System.out.println(ll2.getLast()); // D
		
		ll2.add("A");
		ll2.add("B");
		ll2.add("C");
		ll2.add("D");
		
		System.out.println("\n=====ll2 isEmpty, indexOf, lastIndexOf=====");
		System.out.println(ll2.isEmpty()); // Bos mu sorusunu sorar FALSE
		
		System.out.println("ll2 Elemanlari : " + ll2); // [A, B, C, D, A, B, C, D]
		System.out.println(ll2.indexOf("A")); // Ilk "A" nerede diye sorar 0.index'de old. icin 0 verir
		System.out.println(ll2.lastIndexOf("A")); // Son "A" nerede diye sorar 4. index'de old. icin 4 verir.
		
		
		
	}

}
