package day18_whileloop;

import java.util.Scanner;

public class C5_WhileLoop04 {

	public static void main(String[] args) {
		// Kullanicidan bir sayi alin ve bu  sayiyi tam bolen sayilari ve toplam kac tane  olduklarini ekranda yazdirin

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bolenleri bulmak icin pozitif bir tamsayi giriniz");
		int sayi = scan.nextInt(); // Kullanici diyelim ki 100 girdi
		int count = 0;
		
		int bolen=1;
		while (bolen<=sayi) {
			if (sayi%bolen==0) {
				count++;
				System.out.print(bolen + " ");
			} 
			bolen++;
		}
        System.out.println("");
		System.out.println(sayi + " sayisinin bolenleri : " + count + " adettir.");
		
		//bolenleri su sekilde yazdirin
		// 1- 1
		// 2- 2
		// 3- 4
		// 4- 5
		// 6- 10
		bolen=1;
		count = 0;
		
		
		while (bolen<=sayi) {
			if (sayi%bolen==0) {
				count++;
				System.out.println(count + "- " + bolen);
			} 
			bolen++;
		}
        System.out.println("");
		System.out.println(sayi + " sayisinin bolenleri : " + count + " adettir.");
scan.close();	}
}