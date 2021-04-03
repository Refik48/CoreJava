package day08_ifelseifnestedif;

import java.util.Scanner;

public class C3_IfElseInterviewQues {

	public static void main(String[] args) {
		// Kullanicidan artik yil olup olmadigini kontrol etmek icin yil girmesini isteyin
		// artik yil subat'in 29 cektigi yillardir 
		// 4'e bolunup 100'e bolunmeyenler artik yildir . // 2012 
		// 4'e bolunup 100'e bolunup 400'e bolunenler artik yildir . // 400 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir yil giriniz");
		
		int yil =scan.nextInt();
				
		if (yil%4==0 && yil%100!=0) {
			System.out.println("Artik yildir");
			
		} else if (yil%4==0 && yil%100==0 && yil%400==0) { 
			System.out.println("Artik yildir");

		} else {
			System.out.println("Artik yil degildir");
scan.close();		}
		
		

	}

}
