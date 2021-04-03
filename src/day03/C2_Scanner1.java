package day03;

import java.util.Scanner;

public class C2_Scanner1 {

	public static void main(String[] args) {
		 
		// Kullanıcıdan ismini isteyip ilk harfini büyük harf olarak yazdırın
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen isminizi giriniz");
		char ilkHarf = scan.next().toUpperCase().charAt(0); // char ilkHarf = scan.next(); böyle yazdıktan sonra hata verecek 
		                                                    // sol taraf char sağ taraf string 
		                                          // next(). koyuyoruz ne istiyorsak ona göre seçiyoruz (harflerin indeksleri 0'dan başlar)
		                                          // Büyük harf için next().'dan sonra toUpper seçiyoruz , ilk harf için tekrar . yazıp charAt(0) yaz
		                                          // Önce toUpper sonra charAt .Önce charAt yazıp sonra toupper yazamayız
		                                          // Çünkü charAt(0) metodu kullanılınca variable char oluyor .
		                                          // Char primitive data tipidir ve primitive data tipleri metodlara sahip değildir 
		System.out.println("Bas harfiniz: " + ilkHarf);
		
		scan.close();
		
	}

}
