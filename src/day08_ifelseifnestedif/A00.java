package day08_ifelseifnestedif;

import java.util.Scanner;

public class A00 {

	public static void main(String[] args) {

		// Kullanicidan artik yil olup olmadigini kontrol etmek icin yil girmesini
		// isteyin
		// artik yil subat'in 29 cektigi yillardir
		// 4'e bolunup 100'e bolunmeyenler artik yildir .
		// 4'e bolunup 100'e bolunup 400'e bolunenler artik yildir .

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen artik yil olup olmadigini bilmek istediginiz bir yil yazin");
		int yil = scan.nextInt();

		if (yil % 4 == 0 && yil % 100 != 0) {
			System.out.println("Artik yil");
		} else if (yil % 4 == 0 && yil % 100 == 0 && yil % 400 == 0) {
			System.out.println("Artik yil");
		} else {
			System.out.println("Artik yil degil");
		}

		System.out.println("========================");

		if (yil % 100 == 0) {
			if (yil % 4 == 0 && yil % 400 == 0) {
				System.out.println("artik yil");
			} else {
				System.out.println("artik yil degildir");
			}

		} else if (yil % 100 != 0) {
			if (yil % 4 == 0) {
				System.out.println("artik yil");
			} else {
				System.out.println("artik yil degil");
			} 
		} 
	}

}
