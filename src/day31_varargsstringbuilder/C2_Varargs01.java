package day31_varargsstringbuilder;

public class C2_Varargs01 {

	public static void main(String[] args) {
		
	   /* 
	    * - Varargs tek method’a istediğimiz kadar parametre yollayarak sonuç almamizi sağlar. Yani parametre sayımiz değişken ancak method’un 
	    * yapacağı iş sabitse Varargs kullanarak tek method’la kodumuzu yazabiliriz.
		* - Varargs ozellik olarak list gibi calisir (uzunlugu esnektir) fakat varargs’in arka planinda Java Array ile calisir.(List olarak degil)
		* - Varargs’i declare etmek icin data type’dan sonra ... kullaniriz. (int... sayi vb..)
		* - Bir method’da varargs disinda parametre varsa varargs parametre olarak en sona yazilmalidir.(aksidurumda varargs nerede duracagini bilemez)
		* - Bir method’da sadece 1 varargs kullanilabilir
		*/
		
		// Verilen iki sayiyi toplayan ve sonucu yazdiran bir method yaziniz.
		
		int sayi1=10;
		int sayi2=20;
		int sayi3=30;
		
		toplama(sayi1,sayi2);
		
		// Verilen uc sayiyi toplayan ve sonucu yazdiran bir method yaziniz.
		
		toplama(sayi1,sayi2,sayi3);

		// OYLE BIR METHOD YAZALIM KI ICINE KAC SAYI YAZARSAK YAZALIM TOPLASIN
		toplama(2,3); // iki sayinin toplami methodu calisir.
		toplama(2,5,8); // uc sayinin toplami methodu calisir
		// Istedigimiz kadar sayiyi yazabilecegimiz methodu olusturabilmemiz icin Java varargs olusturmus. DIGER CLASSTA******
	
	}

	public static void toplama(int sayi1, int sayi2, int sayi3) {
		
		System.out.println("uc sayinin toplami : " + (sayi1+sayi2+sayi3));
		
	}

	public static void toplama(int sayi1, int sayi2) {
		
		System.out.println("iki sayinin toplami : " + (sayi1+sayi2));
		
	}

}
