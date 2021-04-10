package day28_foreachloop;

public class C1_ForEachLoop01 {

	public static void main(String[] args) {
		
		// Bir array'in tum elemanlarini for loop ile yazdiralim 
		
		int arr [] = {2,4,6,8,10};
		
		for (int i = 0; i < arr.length; i++) { // Asil amac array'in tum elemanlarini loop'a getirmek
			System.out.print(arr[i]+" ");      
		}
		/*
		 * For loop yazmamizin amaci Array'in TUM ELEMANLARI uzerinde islem yapmak ise For Each Loop daha kolay kod yazmamizi saglar.
		 * Her yerde bunu yapamayiz , arrayler icin ideal , list icin ideal , ilerde kumeler gorcez onlar icin ideal.
		 * each ==> her bir demek 
		 * for each loop ==> istedigim bir toplulukltaki tum elemanlari birer birer bana getirir . 
		 * for each loop'da baslangic degeri YOKTUR, bitis degeri YOKTUR, index YOKTUR 
		 */
		
		System.out.println("==================================");
		for (int each : arr) { // 2 sey onemli . 1) Turu ne oldugu(int) git 2) Nereden geldigi
			// Array'a git butun integer'larini bir bir bana getir demektir. 
			System.out.print(each + " "); 
		}
		
		// int.02yni oldugu surece oraya ne yazdigimiz farketmiyor sayi each w alo veli falan...
		// ama en cok w ve each kullaniliyor.
		// ********************************************************************************************************************************
		// Ama sadece butun elemanlari sirasi ile yazdirir. Burada fibo serisi yapamayiz aralikli sayilar yazdiramayiz
		// cunku baska sartlar tanimlayamiyorum sadece array'e git her bir integer'i al gel yazdir diyebiliyorum.
		

	}

}
