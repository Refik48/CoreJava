package day42_abstractclasses;

public class C1_Final01 {
	
	public static int SAYI = 20;
	// Final ve static yazinca ismini mavi ve bold yapar.
	// Bizde final ve static olunca ismini buyuk yaziyoruz.
	// Neden ? Cunku baskasi gorurse eger final ve static old. anlasin diye.
	// Final variable'lar static olarak tanimlansa bile degistirilemez
	// Bizde convention olarak  buyuk harfle yazariz
	
	String isim; // null
	// Instance variable'lara ilk deger atamasi yapmak zorunda degiliz.
	// Deger atamadigimizda Java data turune gore default bir deger atar.
	
	// final String soyisim;
	// final variable'larin degeri sonradan degistirilemeyecegi icin ilk atama yapilmadan olusturulmasina java izin vermez.
	
	public void deneme() {
		System.out.println("Parent class'daki overriden method");
	}
	
	public final void deneme2() {
		System.out.println("Final method'u calisti");
	}
	
	public static void main(String[] args) {
		
		System.out.println(SAYI);
		
	}

}
