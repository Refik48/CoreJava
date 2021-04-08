package day46_collections;

import java.util.HashSet;
import java.util.Set;

public class C3_HashSet02 {
	
	public static void main(String[] args) {
		
		 Set<String> set1 = new HashSet<>();
	        set1.add("F");
	        set1.add("B");
	        set1.add("A");
	        set1.add("B");
	        set1.add("C");
	        set1.add("B");
	        set1.add("A");
	        set1.add("Y");
	        set1.add("D");
	        System.out.println("set1 : " + set1); // [A, B, C, D, F, Y]
	        
	        System.out.println("\n=====SET clear=====");
	        set1.clear(); // Set'i temizler.
	        System.out.println("set1 : " + set1);
	        set1.add("F");
	        set1.add("B");
	        set1.add("A");
	        set1.add("B");
	        System.out.println("set1 : " + set1); // [A, B, F]
	        
	        Set<String> set2 = new HashSet<>();
	        set2.add("F");
	        set2.add("B");
	        set2.add("A");
	        System.out.println("set2 : " + set2);
	        
	        System.out.println("\n=====SET containsAll=====");
	        System.out.println(set1.containsAll(set2)); // True / Set1, Set2'yi iceriyor mu diye bakar . Sonucu True or False seklinde dondurur.
	        
	        System.out.println("\n=====SET equals=====");
	        System.out.println(set1.equals(set2)); // True doner / Set1, Set2'ye esit mi diye bakar . Sonucu True or False seklinde dondurur.
	        
	        System.out.println("\n=====SET removeAll=====");
	        set1.removeAll(set2); // Set1'den , Set2'nin butun elemanlarini cikar.
	        System.out.println("set1 : " + set1); // []   
	        System.out.println("set2 : " + set2); // [A, B, F]
	        
	        System.out.println("\n=====SET removeAll True/False Hali=====");
	        set1.add("X");
	        set1.add("Z");
	        set1.add("Q");
	        set1.add("W");
	        System.out.println("set1 : " + set1);
	        System.out.println("set2 : " + set2);
	        System.out.println(set1.removeAll(set2)); // False
	        
	        set1.add("A");
	        System.out.println("set1 : " + set1);
	        System.out.println("set2 : " + set2);
	        System.out.println(set1.removeAll(set2)); // True / 1 tane bile bir sey remove ederse True dondurur.
	        
	        System.out.println("\n=====SET retainAll=====");
	        set1.add("F");
	        set1.add("B");
	        set1.add("A");
	        
	        System.out.println("set1 : " + set1);
	        System.out.println("set2 : " + set2);
	       
	        set1.retainAll(set2); // Set1'de calisir , Set2'de olan elemanlari tutar ve Set2'de olmayan elemanlari siler.
	        // Yani Set1'i , Set2'ye esitler.
	        System.out.println("set1 : " + set1);
	        System.out.println("set2 : " + set2);
	       
	        System.out.println("\n=====SET addAll=====");
	        Set<String> set3 = new HashSet<>();
	        Set<String> set4 = new HashSet<>();
	        set3.add("A");
	        set3.add("B");
	        set3.add("C");
	        set4.add("X");
	        set4.add("Y");
	        set4.add("Z");
	        System.out.println("set3 : " + set3);
	        System.out.println("set4 : " + set4);
	        set3.addAll(set4); // Set3'e , Set4'u ekledi. 
	        System.out.println("set3 : " + set3);
	        System.out.println("set4 : " + set4);
	        
	        System.out.println("\n=====SET contains=====");
	        Set<String> set5 = new HashSet<>();
	        set5.add("A");
	        System.out.println("set3 : " + set3);
	        System.out.println("set4 : " + set4);
	        System.out.println("set5 : " + set5);
	        System.out.println(set3.contains(set4)); // FALSE
	        System.out.println(set3.contains(set5)); // FALSE
	        
	        System.out.println("\n=====SET containsAll=====");
	        System.out.println(set3.containsAll(set4)); // TRUE
	        
	       
	}

}
