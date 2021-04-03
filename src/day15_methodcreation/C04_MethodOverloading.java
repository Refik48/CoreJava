package day15_methodcreation;

public class C04_MethodOverloading {

	public static void main(String[] args) {
		/* Overloading asiri yukleme demektir.
		 * Java da ayni isimle birden fazla method olusturulursa buna Overloading denir.
		 * Overloading yapabilmek icin Method Signature'larinin farkli olmasi gerekir
		 * Method Signature = METHOD ISMI + PARAMETRE SAYISI + PARAMETRE DATA TIPLERI
		 * Birbirini kapsayan data turleri old. Java en optimum cozumu uretir.
		 * Birebir uyan varsa o methodu calistirir, bire bir uyan yoksa en en fazla uyan methodu kullanir
		 * Eger kapsayan bir method da bulamazsa Java CTE verir ("ali","b") mesela.
		 */
		toplama(2,3.2);

	} 
	
	public static void toplama(byte sayi1, byte sayi2) { // Java byte ve short yerine int olani calistiriyor .
		System.out.println("byte method sonucu: " + (sayi1 + sayi2));
		
	}
	
	public static void toplama(short sayi1, short sayi2) { // Java byte ve short yerine int olani calistiriyor .
		System.out.println("short method sonucu: " + (sayi1 + sayi2));
		
	}
	public static void toplama(int sayi1, int sayi2) {

		System.out.println("integer method sonucu: " + (sayi1 + sayi2));
	}

	public static void toplama(double sayi1, double sayi2) {

		System.out.println("double method sonucu: " + (sayi1 + sayi2));
	}

	public static void toplama(int sayi1, double sayi2) {

		System.out.println("int/double method sonucu: " + (sayi1 + sayi2));
	}
	
	public static void toplama(double sayi1, int sayi2) {
		
		System.out.println("double/int method sonucu: " + (sayi1 + sayi2));
	}

	public static void toplama(char char1, char char2) {

		System.out.println("char method sonucu: " + (char1 + char2));
	}

	public static void toplama(String str1, String str2) {

		System.out.println("str method sonucu: " + (str1 + str2));
	}

}
