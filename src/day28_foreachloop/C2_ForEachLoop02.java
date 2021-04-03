package day28_foreachloop;

public class C2_ForEachLoop02 {

	public static void main(String[] args) {
		
		// Bir integer array olusturunuz ve bu array'deki tum sayilarin carpimini for each olusturarak bulunuz. Sonucu ekrana yazdirinin.
		
		int arr[] = {1,2,1,2,4,3,1,2};
		
		int carpim =1;
		for (int w : arr) { 
			carpim*=w;
			
		} 
		System.out.println(carpim); // for icinde yazarsam tek tek carpimlarini yazdirir. Disina yazarsam direkt sonucu yazdirir.
	}

}
