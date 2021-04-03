package day08_ifelseifnestedif;

import java.util.Scanner;

public class C4_ArtilYilNestedIfCozum {

	public static void main(String[] args) {
		// Kullanicidan artik yil olup olmadigini kontrol etmek icin yil girmesini isteyin
				// artik yil subat'in 29 cektigi yillardir 
				// 4'e bolunup 100'e bolunmeyenler artik yildir .
				// 4'e bolunup 100'e bolunup 400'e bolunenler artik yildir . 
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir yil giriniz");
		int yil = scan.nextInt();
		
		if (yil%100==0) { // 100'e bolunebiliyor
            
            if (yil%400==0) {
                System.out.println("Artik yil");
            } else {
                System.out.println("Artik yil degil");    
            }       
            
        } else { // 100'e bolunemiyor
            
            if (yil%4==0) {
                System.out.println("Artik yil");
            } else {
                System.out.println("Artik yil degil");
            }
        }
        scan.close();
}
}
