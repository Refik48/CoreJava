package day04;

public class C1_MatematikselIslemler {

	public static void main(String[] args) {
		
		int num1 = 38 / 2 * ( 4 + 3 ) * 2 ;
		System.out.println(num1);
		
		int num2 = 8 + 2 * ( 14 - 6 / 2 ) - 12 ;
		System.out.println(num2);
		
		int num3=10;
		
		double num4 = num1 * num2 / num3;
		System.out.println(num4);
		
		double num5 = (double)num1 * num2 / num3; // java once sag tarafi yapar . burada auto wending var 
		                                          // kusurat icin basina tanimlama yazmak gerek o yüzden sag tarafa parantez icinde tanimliyoruz
		double num55 = num1 * num2 / (double)num3;
		System.out.println(num55);
		
		System.out.println(num5);
		
		double num6 = 24.56;
		double num7 = 14.2;
		double num8 = num6 / num7;
		System.out.println(num8);
		
		System.out.println(num6/num3);	// num6 double , num3 int . sayilardan biri double oldugu icin double turunde sonuc verir 
		System.out.println(num3/num6);  // cunku double int kapsar

		long A=(long) 12.124577;
		double b= 2;
		System.out.println(A/b); // long double'i kapsamadigi icin sonuc long verir . double icin tanımlamak gerekiyor
		System.out.println(b/A);
		
		int sayi1 = 5;

		int sayi2 = 2;

		double sonuc1 = (sayi1 / sayi2); // Normalde 2.5 eder fakar Java once ='ligin sagini yapar yani 2 olur
		double sonuc2 = (double)sayi1/sayi2; // esitligin sag tarafini once yapacagi icin sag tarafi double olarak tanimlar isek sonuc 2.5 olur
		System.out.println(sonuc1);
		System.out.println(sonuc2);
		
		
		
	}

}
