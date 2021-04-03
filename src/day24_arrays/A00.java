package day24_arrays;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class A00 {

	public static void main(String[] args) {
		
		// Kullanicidan degerler alarak int bir array olusturun
				// Once kullanicidan girecegi sayi adedini almamiz lazim ki array'i olusturalim
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Kac syi gireceginizi yaziniz");
		int uzunluk = scan.nextInt();
		
		int arr[] = new int[uzunluk];
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Lutfen " + (i+1) + ". sayiyi giriniz");
			arr[i]=scan.nextInt();
		}
		
		System.out.println(Arrays.toString(arr));
		
	/*	int arr[]= {1,2,3,4,5}; // 2 3 4 5 1
		int temp = arr[arr.length-1];
		System.out.println(arr.length); // 5 
		for (int i=arr.length-1; i>0; i--) { // 5 4 3 2 1
			
			arr[i]=arr[i-1]; // arr[2] = arr[1] arr[3]=arr[2]  arr[5] = arr[4]
			
		}
		
		arr[0]=temp;
		System.out.println(Arrays.toString(arr)); */

	}

}
