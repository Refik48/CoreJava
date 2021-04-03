package day26_arraylists;

import java.util.Arrays;

public class A00 {

	public static void main(String[] args) {
		
		// Sayi yazan yerdeki degeri array'den silip yeni bir array olusturacagiz
		
		int arr [] = {2,3,5,3,6,4,3,6,7};
		int sayi = 3;
		
		// int arr2 [] = {2,5,6,4,6,7}
		
		int count = 0;
		
		for (int i = 0; i<arr.length; i++) {
			if (arr[i]==sayi) { // arr[0] = 2 count =0 ;    
				count++;
			}
		}
		System.out.println(count);

		// 2. Adim yeni arrayimizi olusturacagiz
		
		int arr2 [] = new int[arr.length-count]; 
		
		int temp = 0;
		
		for (int i = 0; i < arr.length; i++) { // arr[2] = 5;
			
			if(arr [i] != sayi) { // 
				
				arr2 [temp] = arr[i];  // arr2 [0] = 2;
				    temp++;           // arr2 [1] = 5;
						             // arr2 [2] = ;
			}
		}
		System.out.println(Arrays.toString(arr2));
	}

}
