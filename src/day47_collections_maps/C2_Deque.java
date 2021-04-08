package day47_collections_maps;

import java.util.Deque;
import java.util.LinkedList;

public class C2_Deque {
	
	public static void main(String[] args) {
		
		// De : Double Ended demektir.
		
		Deque<String> dk1 = new LinkedList<>();
		
		
		dk1.addFirst("C"); // Ilk index'e ekler
		dk1.add("M"); // Normal add son idex'e yazdirir.
		dk1.add("A");
		System.out.println("Deque dk1 : " + dk1); // [C, M, A]
		dk1.addLast("L"); // Bu da son index'e yazdirir
		System.out.println("Deque dk1 : " + dk1); // [C, M, A, L]
		
		System.out.println("\n=====Queue getFirst=====");
		System.out.println(dk1.getFirst()); // C 
		System.out.println(dk1.getLast()); // L
		
		System.out.println("\n=====Queue pop====="); // Ilk indexi silip kanit olarak getiriyor.
		System.out.println(dk1.pop()); // C 
		System.out.println("Deque dk1 : " + dk1); 
		
		System.out.println("\n=====Queue push====="); // This method is equivalent to addFirst. / addFirst method'u ile esdegerdir.
		System.out.println(dk1);
		dk1.push("Y");
		System.out.println(dk1); // Ilk indexe yerlestirir.
	}

}
