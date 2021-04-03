package day24_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays04 {

	public static void main(String[] args) {
		
		// Kullanicidan degerler alarak int bir array olusturun
		// Once kullanicidan girecegi sayi adedini almamiz lazim ki array'i olusturalim
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen kac sayidan olusan bir array istediginizi yaziniz");
		int uzunluk = scan.nextInt();
		
		int arr[] = new int[uzunluk]; // Array olusturduk.
		// Farz edelim kullanici 5 girdi. Biz 5 kez o elemani alip array icinde yerlestirmemiz lazim
		
		System.out.println("Lutfen sayilari giriniz"); // while ile de yapabiliriz, do while ile de.
		for (int i = 0; i < arr.length; i++) { // 0 oldugu icin <'tur. 1 olsaydi <= olacakti.
			arr[i] = scan.nextInt();
		}
		System.out.println(Arrays.toString(arr));
scan.close();	}
}
