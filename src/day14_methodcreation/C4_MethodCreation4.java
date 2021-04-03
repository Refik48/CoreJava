package day14_methodcreation;

public class C4_MethodCreation4 {

	public static void main(String[] args) {

		toplama(1,2);
		toplama(3.3,3.4);
		toplama(5,5.5);
		toplama('a','b'); // ASCII degerlerini toplar
		toplama("Ali","veli");
		
		toplama(60.2,50); // asagida sadece double method sonucu buna uyuyor. double>int oldugu icin double olan yere int yazilir
		// fakat bu ortalama int/double'a uymaz cunku int yazan yere double yazamayiz.
		// Method kolunda double yazip , method'a float yazinca kabul etmiyor
		// Method koluna double yazip  , method'a int yazinca kabul etmiyor
		// Method koluna 'a' yazinca  , method'a int yazinca ASCII degerini aliyor. (byte short yazinca hata veriyor)
		// Sinir degerlerinden buyuk deger yazinca kabul etmiyor.
		

	} // MM sonu

	public static void toplama(int sayi1, int sayi2) {

		System.out.println("integer method sonucu: " + (sayi1 + sayi2));
	}

	public static void toplama(double sayi1, double sayi2) {

		System.out.println("double method sonucu: " + (sayi1 + sayi2));
	}

	public static void toplama(int sayi1, double sayi2) {

		System.out.println("int/double method sonucu: " + (sayi1 + sayi2));
	}

	public static void toplama(char char1, char char2) {

		System.out.println("char method sonucu: " + (char1 + char2));
	}

	public static void toplama(String str1, String str2) {

		System.out.println("str method sonucu: " + (str1 + str2));
	}

} // Class Sonu
