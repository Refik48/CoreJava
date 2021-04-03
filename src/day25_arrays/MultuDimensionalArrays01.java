package day25_arrays;

import java.util.Arrays;

public class MultuDimensionalArrays01 {

	public static void main(String[] args) {
		/*
		 * 1- Ic Icice array olusturdugumuzda disardaki ana array’e outer array icerdeki kucuk array’lere ise inner array denir.
         * 2- Eger icerdeki array’lerin boyutlari birbirinden farkli ise Array’i ancak tum elemenlari yazarak declare edebiliriz 
         * 3- Multi dimensional array’de bir elemanin indexi icin 
         *  en distaki array haric, elemania kadar ic ice olan tum arraylerin indexlerini yazmak gerekir.
		 */
		
		int arr [] [] = {{1,3,5}, {3,5}, {5,9,11,3}, {1}};  // iki katli bir array'dir
		System.out.println(Arrays.toString(arr));
		// 11 sayisini index ile ifade etmek istersek arr[2][2]
		
		System.out.println(Arrays.deepToString(arr)); // Multi Array'leri yazdirmak icin deeptoString methodunu kullaniyoruz.
		
		// eger Array'i uzunlukla declare etmek istersek inner array uzunluklari esit olmali.
		int arr2[][]= new int [3][2]; // burada sagda [3][] boyle yazarsak null null null degerini verir yani yanlis bir cozum yolu
		// 3 tane [1,2] [3,4] [5,6] var bunlarin her birinin icinde de 2 tane sayi var anlaminda [3][2]
		// [3] ilk yazilan sayi outer array'in icinde kac tane inner array old. belirtir
		// [2] her bir inner aray'in uzunlugu :
		System.out.println("24.satir " + Arrays.toString(arr2)); 
		// Eger Arrays multi ise bu sekilde yazdirinca referans degerlerini veriyor	
		// Multidimensional array'leri yazdirmak icin toString method'u kullanilamaz.
		// cunku toString methodu outer array'i String'e cevirir
		// outer array'in icinde inner array'ler oldugundan toStrging method'unda inner array'lerin referans degerleri yazdirilir.
		 
		System.out.println("30.Satir " + Arrays.deepToString(arr2));
		
		arr2 [0][1]=6;
		System.out.println(Arrays.deepToString(arr2));
		arr2 [2][0]=2;
		System.out.println(Arrays.deepToString(arr2));
	
	}
}
