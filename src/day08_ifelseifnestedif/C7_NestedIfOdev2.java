package day08_ifelseifnestedif;

import java.util.Scanner;

public class C7_NestedIfOdev2 {

	public static void main(String[] args) {
		/*
        Soru 12) Kullanıcıdan 4 basamakli bir sayi girmesini isteyin. 
        Girdiği sayi 5’e bölünüyorsa  son rakamını kontrol edin. 
        Son rakamı 0 ise ekrana “5’e bölünen çift sayı”  yazdırın. 
        Son rakamı 0 değil ise “5’e bölünen tek sayı” yazdırın. 
        Girdiği password  5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın. 
         */ 
Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen 4 basamakli bir tam sayi giriniz");
		
		int sayi = scan.nextInt();	
		
		if(sayi>0)
		{
			if((sayi/1000>=1) && (sayi/1000<=9)) 
			{						
				if (sayi%5==0) 
				{				
					if (sayi%10==0) 
					{					   
						System.out.println("5'e bolunen pozitif cift sayi");				
					} 
					else 
					{
						System.out.println("5'e bolunen pozitif tek sayi");
					}			
				} 
			
				else if (sayi%5!=0) 
				{			
					System.out.println("Girdiginiz 4 basamakli pozitif tam sayi 5'e bolunemiyor. Tekrar Deneyiniz");				
				}
			}
			else 
			{				
				System.out.println("Pozitif 4 basamakli olmayan bir sayi girdiniz. Lutfen 4 basamakli bir sayi giriniz");
			}
		}
		
		
		
		else if(sayi<0) 
		{					
			if((sayi/1000<=-1)&&(sayi/1000>=-9)) 
			{						
				if (sayi%5==0) 
				{				
					if (sayi%10==0) 
					{					   
						System.out.println("5'e bolunen negatif cift sayi");				
					} 
					else 
					{
						System.out.println("5'e bolunen negatif tek sayi");
					}			
				} 
			
				else if (sayi%5!=0) 
				{			
					System.out.println("Girdiginiz 4 basamakli negatif tam sayi 5'e bolunemiyor.Tekrar Deneyiniz");				
				}
			}
			else 
			{				
				System.out.println("Negatif 4 basamakli olmayan bir sayi girdiniz. Lutfen 4 basamakli bir sayi giriniz");
			}
		}
		else 
		{
			System.out.println("Lutfen 0 girmeyiniz. 4 basamakli bir tam sayi giriniz");
		}
		
		scan.close();
	}

 

{
// Kullanıcıdan 4 basamakli bir sayi girmesini isteyin.
// Girdiği sayi 5’e bölünüyorsa son rakamını kontrol edin.
// Son rakamı 0 ise ekrana “5’e bölünen çift sayı” yazdırın.
// Son rakamı 0 değil ise “5’e bölünen tek sayı” yazdırın.
// Girdiği password 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın.
Scanner scan = new Scanner(System.in);
System.out.println("Lutfen 4 basamakli bir sayi giriniz");
int sayi = scan.nextInt();
if (sayi >= 1000 && sayi <= 9999) {
    if (sayi % 5 == 0) {
        if (sayi % 10 == 00) {
            System.out.println("5'e bolunen cift sayi");
        } else {
            System.out.println("5'e bolunen tek sayi");
        }
    } else {
        System.out.println("tekrar deneyiniz");
    }
} else {
    System.out.println("lutfen 4 basamakli bir sayi giriniz");
}
scan.close();} } 

