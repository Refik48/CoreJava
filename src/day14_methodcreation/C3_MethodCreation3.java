package day14_methodcreation;

public class C3_MethodCreation3 {

	public static void main(String[] args) {
		// verilen 3 double sayinin ortalamasini alan bir method yazin

		ortalama(99.9, 100.1, 100.7);
		ortalama(80,60);
		

	} // Main Method Sonu

	

	public static void ortalama(double s1, double s2, double s3) {
		System.out.println("Sayinin ortalamasi: " + (s1 + s2 + s3) / 3);
		// Not : burada double olarak tanimladim Yukarda sayilar int cinsinden yazarsam
		// sorun yok . Cunku double>int
		// Fakat burada int tanimlasaydim yukarda da double yazsaydim
		// burada int olarak tanimlasaydik ve bolme islemi virgullu ciksaydi her sey int
		// cinsinden oldugu icin java virgullu kismi yok sayardi

	}

	public static void ortalama(double sayi1, double sayi2) {  //
		// 2 tane ortalama var Java itiraz etmiyor cunku Parametre sayisi birinde 3 iken digerinde 2'dir.

		System.out.println("girdiginiz iki sayinin ortalamasi: " + (sayi1 + sayi2) / 2);
	}

} // Class Sonu
