package day19_dowhileloop;

import java.util.Scanner;

public class C3_DoWhileLoop {

	public static void main(String[] args) {
		/* 
	    * do whileloop'ta istedigi sonucu verene kadar tekrar tekrar sorar.
		* While Loop, dongunun baslagicinda kosulu kontrol eder ve kosul saglanirsa body icindeki kodlar calistirir.
		* Do-While Loop'ta ise kosul body icerisindeki kodlar 1 kere calistiktan sonra kontrol edilir
		* Bir while loop'daki kosul yanlissa loop hic calismaz.
		* Do-While Loop'ta ise kosul yanlissa kodlar 1 kere calisir.
		*/
		
		Scanner scan = new Scanner(System.in);
		
		int sayi=0;
		int toplam = 0;
		
		do {
			
            System.out.println("Lutfen pozitif bir tamsayi giriniz");
            
            sayi= scan.nextInt();
            
            toplam+=sayi;
            
        } while (sayi!=0);
        System.out.println("aferin");
        System.out.println(toplam);
        
        scan.close();

	}

}
