package day19_dowhileloop;

import java.util.Random;
import java.util.Scanner;

public class C5_DoWhileLoop3IleriDuzey {

	public static void main(String[] args) {
		/*
		Javanin 0 ile 100 arasinda tuttugu sayiyi tahmin etme oyunu!!!
		Iyi eglenceler...:smile: 
		*/
		
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int upporbound = 101;
		int int_random = rand.nextInt(upporbound);
		int sayi = 0;
		int count = 0;
		System.out.println("Lutfen 0 ile 100 arasinda bir sayi tahmin edin");
		do {
			sayi = scan.nextInt();
			if(sayi<int_random) {
				System.out.println("Tahminini artir!!!!,sayi girin");
			}else if(sayi>int_random) {
				System.out.println("Tahminini azalt!!!!,sayi girin");
			}
			count++;
		}while(sayi!=int_random);
		System.out.println("Tebrikler " + count + ". denemede " +int_random + " sayisini dogru bildin!!!");
		scan.close();

		
	}

}
