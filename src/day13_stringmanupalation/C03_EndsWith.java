package day13_stringmanupalation;

import java.util.Scanner;

public class C03_EndsWith {

	public static void main(String[] args) {
		// Yazilan cumlenin sonu yazdigimiz seyler bitiyor sorusunun cevabini verir
		
		String str = "Java ile hayat ne guzel";
		
		System.out.println(str.endsWith("zel"));
		System.out.println(str.endsWith("ne guzel"));
		System.out.println(str.endsWith("zel "));
		
		// Kullanicidan br email adresi isteyiniz.
		// Eger @ isareti iceriyorsa "girdiginiz bilgi email degil"
		// Eger @ isareti iceriyor ama @gmail.com icermiyorsa "Lutfen gmail adresi girin yazin"
		// Eger ilk iki sarti sagliyor ama @gmail.com ile bitmiyorsa "gecersiz gmail adresi" yazsin.
		
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Kayit icin mail adresinizi giriniz");
	    String email = scan.next();
	    
	    if (!email.contains("@")) { // bunun sonucu bir boolean, bunun basina ! isareti koyarsak boolean'i tersine cevirir. Burada email "@" isareti icermiyorsa oldu
	    System.out.println("Girdiginiz email adresi degil");
	} else if (!email.contains("@gmail.com")) {
		System.out.println("Lutfen gmail adresi yaziniz");
	} else if (email.endsWith("@gmail.com") && (email.indexOf("@gmail.com", email.length()-10)==-1)) {
		System.out.println("Email adresiniz basari ile kaydedildi");
	} else {
		System.out.println("Gecersiz gmail adresi");
	}
	scan.close();	
	}
}
