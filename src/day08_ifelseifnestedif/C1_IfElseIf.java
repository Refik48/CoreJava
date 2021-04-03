package day08_ifelseifnestedif;

import java.util.Scanner;

public class C1_IfElseIf {

	public static void main(String[] args) {
		// Kullanicidan gun ismini yazmasini isteyin . Girilen gecerli bir gun ise gun isminin 1. , 2. ve 3. harflerini ilk harf buyuk 
		// diger ikisi kucuk olarak yazdirin , gun ismi gecerli degilse "Gecerli gun ismi giriniz" yazdirin.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir gun ismi yaziniz");
		
		String gunAdi = scan.nextLine().toLowerCase(); // girin tum yaziyi kucuk harfe cevirdik
		                                               // nextLine yerine next olsaydi, kullanici "pazartesi gunleri" yazsaydi program sadece
		                                               // kelimeye bakar ve dogru yazilmis gibi kabul ederdi ama burada yanlis var uyari yapcaz
		                                               // yani spaceden sonra olmamasi lazim der hata verir.
		if(gunAdi.equalsIgnoreCase("pazar") || gunAdi.equalsIgnoreCase("pazARteSi")) { // IgnoreCase yazdirdigimiz zaman buyuk kucuk harfe bakmiyor
		  System.out.println("Paz");                                                   // o yuzden en bastaki toUpperCase'i sildik
      } else if(gunAdi.equalsIgnoreCase("Sali")) {                                     // Str old. zaman equals kullanmayi dene
    	  System.out.println("Sal");
      }  else if(gunAdi.equalsIgnoreCase("carsamba")) {
    	  System.out.println("Car");
      } else if(gunAdi.equalsIgnoreCase("persembe"))  {
    	  System.out.println("Per");
      } else if(gunAdi.equalsIgnoreCase("cuma") || gunAdi.equalsIgnoreCase("cumartesi") ) {
    	  System.out.println("Cum"); 
      }  else { System.out.println("Gecerli gun adi giriniz");
      }
 scan.close(); }
      }