package day04;

import java.util.Scanner;

public class C3_Modulus2 {

	public static void main(String[] args) {
		// Kullanicidan 4 basamakli bir sayi alalim ve sayinin basamaklarini ters sirada yazdiralim
		// Bir sayinin basamaklarini elde etmek icin 2 islemi tekrar tekrar yapariz (LOOP DIYORUZ)
		// 1. islem en sondaki basamagi elde etmek
		// 2. islem en sondaki basamagi yok etmek 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Basamaklarini bulmak icin 4 basamakli bir sayi giriniz: ");
		
		int sayi = scan.nextInt(); // Bu satirdan itibaren elimizde 4 basamakli bir sayi var
		                           // 4 basamagi elde etmek icin yukarda yazdigimiz islemi 3 kez yapiyoruz
		// 1. Tekrar (Birler basamagi)
		int birlerBas = sayi % 10;
		sayi/=10; // artik sayimiz 3 basamakli
		
		// 2. Tekrar (Onlar basamagi)
		int onlarBas = sayi % 10;
		sayi/=10;
		
		// 3. Tekrar (Yuzler basamagi)
		int yuzlerBas = sayi % 10;
		sayi/=10;
		
		// bu satirdan sonra sayimiz tek basamakli 
		int binlerBas = sayi; // burada % islemi yapmak zorunda degiliz cunku sayimiz tek basamakli halde suan
		
		System.out.println("Birler basamagi: " + birlerBas);
		System.out.println("Onlar basamagi: " + onlarBas);
		System.out.println("Yuzler basamagi: " + yuzlerBas);
		System.out.println("Binler basamagi: " + binlerBas);
		System.out.println("Sayinizin ters hali: " + birlerBas + onlarBas + yuzlerBas + binlerBas);
		
		// Tersten yazdirmanin farkli yolu 
		System.out.print(birlerBas);
		System.out.print(onlarBas);
		System.out.print(yuzlerBas);  // sadece print yazarsak sonuclari yanyana yazar .
		System.out.print(binlerBas); // ln = line demek . println demek once print yapar sonra alt satira gecer .
		System.out.println();  // buraya bir tane boş println yazdık ki alt satıra geçsin, bunu yazmasaydik birleşik yazardi bir sonraki ile .

		// Sayinin rakamlar toplami
		System.out.println(birlerBas+onlarBas+yuzlerBas+binlerBas);
		
		scan.close();
	}

}
