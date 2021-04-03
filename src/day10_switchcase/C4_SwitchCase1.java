package day10_switchcase;

import java.util.Scanner;

public class C4_SwitchCase1 {

	public static void main(String[] args) {
		// C3_TernartyTekrar3'de ki soruyu burada Switch yolu ile cozecegiz
		// Kullanicidan bir rakam isteyin. Girilen rakimi yazi ile yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir rakam giriniz");
		
	    int rakam = scan.nextInt();
	    
	    switch (rakam) { // Switch'de long double float ve boolean kullanilmaz
	    case 1 : System.out.println("sayi = 1"); // char , int , byte , short kullanilir
	    break;
	    case 2 : System.out.println("Sayi = 2"); // Eger birden fazla case icin yapilacak islem ayni ise, 
	    break;
	    case 3 : System.out.println("Sayi = 3"); // Ayni sonucu veren caseler break olmadan alt alta yazilir en alttaki caseden sonra break yazilir.
	    break;
	    case 4 : System.out.println("Sayi = 4"); // bkz: C6_c3
	    break;
	    case 5 : System.out.println("Sayi = 5");
	    break;
	    case 6 : System.out.println("Sayi = 6");
	    break;
	    case 7 : System.out.println("Sayi = 7");
	    break;
	    case 8 : System.out.println("Sayi = 8");
	    break;
	    case 9 : System.out.println("Sayi = 9");
	    break;
	    case 0 : System.out.println("Sayi = 0");
	    break;
	    default : System.out.println("Sayi bunlardan biri degil");
	    }

scan.close();	}

}
