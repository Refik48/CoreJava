package day42_abstractclasses;

public class Isci extends Personel { // Extends yaptigimda hata verdi Isci yazisini alti cizildi.
	// The type must implement the inherited abstract method Personel.mesaiBilgisi() 
	// Java 2 secenek sunuyor bana Add umimplemented methods'u seciyorum. 
	
	// Isci son nokta ise abstract yapmayiz

	public static void main(String[] args) {
		
		Isci isci1 = new Isci();
		isci1.maasHesapla();
		isci1.mesaiBilgisi();
		isci1.isim = "Ahtapot"; // Absract parent class'daki variable'lari istersem kullanirim istersem kullanmam.
		System.out.println(isci1.isim);
		
		// System.out.println(isim); // Static yaparsan ulasabilirsin diyor
		
		isci1.ozelSigorta(); // Abstract parent class'daki concrete method'u istersem kullanirim istersem kullanmam.
		// Bu method'u override etmedik ama parent-child iliskisi ile kullanabildik.
	}

	@Override
	public void maasHesapla() { // OVERRIDE EDILMESI ZORUNLU
		// Parent class'daki abstract method'u implement (uyarlama) etti
		// 1 - Sen absract bir class'i parent edindiysen mutlaka oradaki abstract method'u implement etmelisin
		// 2 - Parent class'daki method'da body olmadigi icin onu kullanmanin anlami yok.
		// Biz child class'a body olan method (concrate) kullanip islem yapmaliyiz.
		System.out.println("Isciler icin mass 5000 TL");
		
	}

	@Override
	public void mesaiBilgisi() { // OVERRIDE EDILMESI ZORUNLU
		System.out.println("Isciler cok calisiyor yigenim");
		
	}

}
