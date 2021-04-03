package day13_stringmanupalation;

import java.util.Scanner;

public class C02_Contains {

	public static void main(String[] args) {
		// Kullanicidan mail adresini isteyin. Mail adresi @gmail.com iceriyorsa "Mailiniz kaydedildi" yazsin,
		// yoksa "Yanlis adres, tekrar deniyiz" yazsin

	    Scanner scan = new Scanner(System.in);
	    System.out.println("Kayit icin mail adresinizi giriniz");
	    String mail = scan.next();
	    int son = mail.indexOf("@gmail.com", mail.length()-10);
	    if (mail.contains("@gmail.com")) {
	    	   	System.out.println("Mailiniz kaydedildi");
	    } else {
	    	System.out.println("Yanlis adres, tekrar deniyiz");
	    }
	    
	    
	    
	    if (mail.contains("@gmail.com") && son!=-1) {
	    	System.out.println("Mailiniz kaydedildi haci");
	    } else {
	    	System.out.println("Mailiniz kontrol edip tekrar deneyin");
	    }

scan.close();  } 
}       
        // bu yazimda @gmail.com'u nereye koyarsan koy kabul edecek, nihat@gmail.com.com.aswqeq12312 yazsak bile @gmail.com var diye kabul edecek
        // eger @gmail.com'un en sonda oldugunu kontrol etmek istersek
        // int son = mail.indexOf("@gmail.com", mail.length()-10)  .... index olarak length()-10 yazarsam bu en sonda demektir
        // eger mail gmail.com ile bitiyorsa bu islemin sonucu bir index olur (int)
        // eger mail gmail.com ile bitmiyorsa -1 yazar
        // 