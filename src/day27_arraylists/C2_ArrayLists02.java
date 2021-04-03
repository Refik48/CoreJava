package day27_arraylists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C2_ArrayLists02 {

	public static void main(String[] args) {
		// kullanicidan pozitif bir tamsayi aliniz
		// aldiginiz sayidan kucuk olan fibonacci dizisi elemanlarini yazdirin
		// 1 1 2 3 5 8 13 21 34...
		
		// 1567
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Deger");
		int sayi = scan.nextInt();
		List<Integer> fibo = new ArrayList<>();
		fibo.add(1); // 0.index
		fibo.add(1); // 1.index
		
		System.out.println(fibo); // [1, 1]
		
		for (int i =1; fibo.get(i-1)+fibo.get(i) < sayi ; i++) {
			
			fibo.add(fibo.get(i-1)+fibo.get(i));
			
			
		}
		
		System.out.println(fibo);
		
		
	
		int i=1;
		while(fibo.get(i-1)+fibo.get(i) < sayi) {
			
			fibo.add(fibo.get(i-1)+fibo.get(i));
			
			i++;
		}
		
		System.out.println(fibo);
		
		
		
		// [ 1 , 1 , 2 , 3 , 5 , 8 , 13 ]
		
scan.close();	}
}
