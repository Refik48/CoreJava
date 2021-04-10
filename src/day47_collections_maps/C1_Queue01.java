package day47_collections_maps;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class C1_Queue01 {

	public static void main(String[] args) {
		// Queue bir interface'dir dolayisiyla obje uretemeyiz.
		// Child Class'i olan Priority ve LinkedList constructor secimine gore olusturdugumuz Queue'nun davranislari degisir.
		Queue<String> k1 = new PriorityQueue<>(); 
		
		k1.add("D");
		k1.add("C");
		k1.add("N");
		k1.add("A");
		
		System.out.println("Queue k1 : " + k1); // [A, C, N, D]
		// Queue(Kuyruk) yapisi geregi insertion order'a (ekleme sirasi) gore siralama yapmasi beklenir. 
		// Ancak constructor olarak PriorityQueue sectigimiz icin Java tarafindan belirlenen priority'e gore siralama yapar.
		
		// Biz de istersek Priority kuralini tanimlayabiliriz . O zaman bizim istegimize gore siralar. 
		
		Queue<String> k2 = new LinkedList<>();
		// Ayni elemanlarla fakat LinkedList constructor'i kullanarak olusturdugumuz 
		// Queue ise beklenenlere uygun olarak ekleme sirasina gore yazdirir.
		
		k2.add("D");
		k2.add("C");
		k2.add("N");
		k2.add("A");
		System.out.println("Queue k2 : " + k2); // [D, C, N, A]
		
		// Queue'nun yapisi geregi FIFO kurali gecerlidir.
		System.out.println("\n=====Queue offer====="); // En sona eleman ekler.
		k2.offer("Z");
		System.out.println("Queue k2 : " + k2); // [D, C, N, A, Z]
		
		k2.offer("E"); 
		System.out.println("Queue k2 : " + k2); // [D, C, N, A, Z, E]
		
		k1.offer("E");
		System.out.println("Queue k1 : " + k1); // [A, C, N, D, E]
		
		System.out.println("\n=====Queue peek====="); // Silmeden ilk elemani bize dondrurur.
		k2.peek();
		System.out.println("Queue k2 : " + k2); // [D, C, N, A, Z, E]
		System.out.println(k2.peek()); 
		System.out.println("Queue k2 : " + k2); // [D, C, N, A, Z, E]
		
		System.out.println("\n=====Queue remove====="); // Ilk elemani siler veya istenen elemani siler .
		k2.remove();
		System.out.println("Queue k2 : " + k2); // [C, N, A, Z, E]
		k2.remove();
		System.out.println("Queue k2 : " + k2); // [N, A, Z, E]
		k2.remove("A");
		System.out.println("Queue k2 : " + k2); // [N, Z, E]
		System.out.println("Remove icinde String : " + k2.remove("Z")); // True 
		
		System.out.println("\n=====Queue poll=====");
		System.out.println("Queue k2 : " + k2); // [N, E]
		System.out.println(k2.poll());
		System.out.println("Queue k2 : " + k2); // [E]
		k2.poll();
		System.out.println("Queue k2 : " + k2); // []
		System.out.println(k2.poll());    // Null
		System.out.println("Queue k2 : " + k2); // [] 
		// k2.remove(); 
		// Remove method'u ile bos Queue'yu silmeye calisirsaniz exception verir.
		// poll() bos bir Queue'da kullanilirsa exception vermez, null dondurur.
		
		System.out.println("\n=====Queue element====="); // Silmeden bos elemani dondurur.
		System.out.println("Queue k1 : " + k1);
		System.out.println(k1.element());
		System.out.println("Queue k1 : " + k1);
		System.out.println("Queue k2 : " + k2);
		// System.out.println(k2.element()); // Queue bos ise exception firlatir.
	} 

}
