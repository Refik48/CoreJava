package day16_forloop;

import java.util.Scanner;

public class C3_ForLoop03 {

	public static void main(String[] args) {
		// Kullanicidan pozitif bir tamsayi alin
		// 1'den kullanicinin girdigi sayiya kadar olan tum tamsayilarin toplamini yazdirin
	
		
		// 5 = 1 2 3 4 5 == 15
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir tam sayi yaziniz");
		int sayi = scan.nextInt();
		
		int toplam = 0; // Toplami 0 yazdim
		
		for (int i = 1; i<=sayi; i++) // burada surekli i degeri kullanicinin yazdigi degere kadar artacak
		toplam +=i;                    // burada da her artan i'i direk buraya ekliyor boylecek toplama islemi otomatik olarak yapiyor.
		System.out.println(toplam); 
		
 scan.close(); }

	}

