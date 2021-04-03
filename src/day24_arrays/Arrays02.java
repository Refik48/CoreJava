package day24_arrays;

import java.util.Arrays;
import java.util.Iterator;

public class Arrays02 {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5}; // Kodlarimizi dinamik yapmak isteriz yani sabit olmayan,her kosulda calisan.
        // 0 1 2 3 4                // Eger kodumuz bu sekilde degilde arr[0]=2 dersem kodum dinamik olmaz, arr[0]=arr[1] seklinde olmasi lazim
         // 1
		int temp = arr[0];
        //	           i<4 //  
        for (int i=0; i<arr.length-1; i++) { // int=1; i<arr.length; i++ / arr[i-1] = arr [i] olursa da ayni sonucu elde ederiz
	         arr[i]=arr[i+1];                // Degisecek olan sol taraftaki .
        }     	
            // i<=arr.length
        
         arr[arr.length-1]=temp;
        System.out.println(Arrays.toString(arr));
        
           /*
            * arr[0]=arr[1]
            * arr[1]=arr[2]
            * arr[2]=arr[3]
            * arr[3]=arr[4]
            * arr[4]=arr[0]
            */
}
}
                    /* for(int i=1; i < arr.length; i++) { 
                    arr[i-1] = arr [i]; }
               */
		
		
		/*
		 * Verilen 3 elemanli bir array’in tum elemanlarini bir soldaki konuma tasiyacak bir program yazin.
		 *  Ornek; array [1,2, 3] ise output [2, 3, 1] olacak
		 
		
		int arr[]= {1,2,3,4,5}; // 
		          //0 1 2 3 4
		
		
		int temp = arr[arr.length-1]; // 5
		System.out.println(temp);
		
		for (int i=arr.length-1; i>0; i--) {
			arr[i]=arr[i-1]; // 4 3  // 2 3 // 1 2 // 0 1 //
		}
		/*
		 * arr[4]=arr[3]
		 * arr[3]=arr[2]
		 * arr[2]=arr[1]
		 * arr[1]=arr[0]
		 
		
		arr[0]=temp;
		System.out.println(Arrays.toString(arr));

	}
}*/