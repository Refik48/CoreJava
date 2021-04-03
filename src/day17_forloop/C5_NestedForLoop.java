package day17_forloop;

import java.util.Scanner;

public class C5_NestedForLoop {

	public static void main(String[] args) {
		/*  Problem Tanımı
        Girilen bir sayı kadar satır ve sütünu olan ve
        sağ kenara dayalı üçgeni basan kodu yazınız.
        Ekran Çıktısı
        Bir sayi giriniz: 5
            *
           **
          ***
         ****
        *****
        */
		
		/*     
		 * 
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Pozitif bir rakam girin ve seklinizin keyfini cikarin");
		int sayi = scan.nextInt();
		
		for (int i = 1; i<=sayi; i++) { // 1 // 2 // 3 //
			System.out.println(" "); // Sonuc ekraninda alt satira gecmesi icin bosluk biraktik
			for (int j = 1; j<=i; j++) { // 1 // 1 2 // 1 2 3
				System.out.print("* ");
		} 
	  }
scan.close();
		for(int i=0; i<=5; i++) {
			for(int j=5; j>=5; j--) {
				System.out.print(" ");
				for(int k=0; k<=i; k++) {
					System.out.print("*");
				}
			}
			
			
		}
		
		
		
		
		
	}
}
	/*
		String bos = " ";
		
		   for(int bosluk=5; bosluk>=0; bosluk--) {
			  System.out.print(bos); }
		   for(int i=1; i<5; i++) {
				 System.out.print("*");
				 System.out.println("");
			} 
		}
		
			}
		 
		*/
		/* 
		   
		 
		 
		 
		 
		 
		 
		 
		 */
		
		
 



/*
 * 1 2 
 * 1 2
 * 1 2
 * 1 2
 * 1
 */
