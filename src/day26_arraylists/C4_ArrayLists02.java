package day26_arraylists;

import java.util.ArrayList;
import java.util.List;

public class C4_ArrayLists02 {

	public static void main(String[] args) {
		/*
        Soru 6) Verilen bir Array’den istenen degere esit olan elamanlari kaldirip, 
        kalanlari yeni bir Array olarak yazdiran bir method yaziniz
        */
       
       int arr[]= {2,3,5,3,6,4,3,6,7}; // ************* C1_Array01 Kolay Cozumu*****************************
       int sayi=5;
       
      List<Integer> list = new ArrayList<>();
      
      for (int i = 0; i < arr.length; i++) {
    	  
		if (arr[i] != sayi) {   // arr[1] = 2 != 5   >    list.add(2)
			
			list.add(arr[i]);
			
		}
	}
      
      System.out.println(list);

	}

}
