package day05;

public class C3_Concatenation {

	public static void main(String[] args) {
		
		// Concatenation (Birlestirme): Java'da birden fazla String'i toplama isareti ile toplarsaniz, Stringler yanyana yazar
		
		String str1 = "Java "; // Javadan sonra bosluk yaptigim icin sonuc ekraninda bosluk varmis gibi cikti ,
		String str2 = "Guzeldir"; // Sonuc ekraninda cikti ama bunun yerine syso'da bosluk yaparsak daha saglikli olur .
		
		System.out.println(str1+str2);
		System.out.println(str1+" "+str2);
		System.out.println(str1+' '+str2); // Bu da olur fakat 
		
		String str3 = "Nihat";
		int int1 = 1;
		int int2 = 2;
		
		System.out.println(int1+int2+str3); // Once int'ler olursa rakamlar toplanir str yanina yazilir
		System.out.println(int1+str3+int2);
		System.out.println(str3+int1+int2); // Once str olunca rakamlar toplanmaz yanyana yazilir
		System.out.println(str3 + " " + int1+int2);		// Boylede rakamlari yanyana yazar
		System.out.println((str1+str2)+" "+(int1+int2)); // Sayilari parantez icinde yazarsak islem onceligi old. icin mat islemi yapar sonra yazar
		System.out.println(str1+str2+(int2-int1));       // Java soldan saga okuma yapar ama parantez islem onceligine girer.
		System.out.println(int1+int2+' '+str1+str2);     // ' ' boslugun ASCII degerini alir . ' ' = 32 (ASCII)
		System.out.println(str1+str2+' '+int1+int2);     //  str once olursa bosluk'ta str olarak algilandi
		System.out.println(int1+int2+str1+' '+str2);
		System.out.println(str1+str2+int1*int2);         // Islem onceligi vardır carpma'yi once yapar
		char char1='a';
		System.out.println(int1+char1); // Toplanan iki deger sayisal ise Java toplar, biri sayisal digeri char ise  
		                                 // sayisal deger ile char'in ascii degerini toplar, esitligin bir tarafında STR varsa Concatenation yapar
		
	}
	}
