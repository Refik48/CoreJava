package day09_ternary;

public class C1_ternary01 {

	public static void main(String[] args) {
		// Ternary islemi If Statement ile yapacagimiz islemleri basit olarak yapmamizi saglar.
		// Ternary islemi bize bir sonuc donecegi icin, bu islemi bir variable'a atamaliyiz
		// Ternary icin = Condition ? (kod1) : (kod2);

		int sayi = 10;
		
		// ternary islemi bir sonuc dondurdugunden bir variable olusturup ona assign etmeliyiz
		String sonuc = (sayi%2==0) ? "cift sayi" : "tek sayi" ;
			System.out.println(sonuc);
			
		// ben bir variable'a assign etmek istemezsem syso icine yazabilirim
		// yani turkce meali String sonuc = (sayi%2==0) ? "cift sayi" : "tek sayi" ; bunu yazmak yerine
			
			System.out.println("islem sonucu : " + (sayi%2==0 ? "cift sayi" : "tek sayi"));
	
	}

}
