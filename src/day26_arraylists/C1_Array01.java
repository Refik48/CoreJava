package day26_arraylists;

import java.util.Arrays;

public class C1_Array01 {

	public static void main(String[] args) {
		// Verilen bir Array’den isten degere esit olan elamanlari kaldirip, kalanlari yeni bir  Array olarak yazdiran bir method yaziniz

		int arr [] = {2,3,5,3,6,4,3,6,7}; // Kullanicidan aldigimizi varsayalim ve uzunlugu bilmiyormus gibi davranalim
		int sayi = 3; // Array'in length'i degisemez o yuzden split yapip tekrardan Array'a donusturcem
		             // String'e cevirip 3'leri yok edebiliriz ama burada split yapacagiz
		
		// 1. Adim olarak arr icinde kaldirmam istenen sayi kac tane var, bulmam gerekior .
		
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==sayi) {
				count++;
			}
		}
		
		// 2. adim yeni array olusturalim
		int arr2[]= new int[arr.length-count]; // Eski arrayin uzunlugundan count'u cikardik . Count kac tane 3 degeri var onu veriyor .
		
		// 3. adim arr array'indan elemanlari tek tek alip istenen sayiya esit degilse arr2'ye ekleyecegim
		
		int temp = 0; // bununla yeni array'in incexlerini kontrol edecegim
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]!=sayi) {
				arr2[temp]=arr[i];
				temp++;
			}
		}
		System.out.println(Arrays.toString(arr2));
		
		/*
		 * i = 0 dan  8e giderken
		 *  index     sayi                             temp
		 *    0        2==3 F   arr[0]=2   temp++   0 idi 1 oldu     
		 *    1        3==3 T              artmadi      1
		 *    2        5==3 F   arr[1]=5   temp++       1              
		 *    3        3==3 T              artmadi      2                  
		 *    4        6==3 F   arr[2]=6   temp++       2        
		 *    5        4==3 F   arr[3]=4   temp++       3    
		 *    6        3==3 T              artmadi      4   
		 */                     
	}

}

