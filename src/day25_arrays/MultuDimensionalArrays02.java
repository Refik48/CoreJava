package day25_arrays;

import java.util.Arrays;

public class MultuDimensionalArrays02 {

	public static void main(String[] args) {
		// verilen 2 katli bir array'in tum elemanlarinin toplamini bulalim
		
		int arr [][]= {{1,2,3},{5,8},{9,6,5,1}};
		
		/*
		 * arr[0][0] = 1 // i = 0 olunca burasi
		 * arr[0][1] = 2
		 * arr[0][2] = 3 
		 * 
		 * arr[1][0] = 5 // i = 1 olunca burasi
		 * arr[1][1] = 8 
		 * 
		 * arr[2][0] = 9 // i = 2 olunca burasi
		 * arr[2][1] = 6
		 * arr[2][2] = 5
		 * arr[2][3] = 1 
		 */ 

		System.out.println(arr[2].length);
		int toplam = 0;
		for (int i = 0; i < arr.length; i++) { // arr.length = 3
			for (int j = 0; j < arr[i].length; j++) { /* i=0 olunca, arr[0].length oldu yani 3 oldu cunku yukarda da oldugu uzere 
			                                           *
			                                           */
				toplam+=arr[i][j];
            }
        }
        System.out.println("array'deki tum elemanlarin toplami : " + toplam);			
	}
}