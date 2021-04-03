package day35_inheritance;

public class Personel {

	public String isim;
	public int sayi;
		/*
		 * -Her Class default constructor'a sahiptir.
		 * -Default constructor'in parametresi yoktur.
		 * -Biz parametreli veya parametresiz bir constructor olusturdugumuzda default constructor silinir.
		 * -Eger biz en az bir parametreli bir constructor olusturursak, Java default olani sildigi icin parametresiz cons. kalmaz.
		 * Dolayisiyla biz default constructor'i manuel olarak olusturmak zorundayiz.
		 */
	public Personel() { 
		// Source'e gittik , Generate Constructer using fiels'i sectikten sonra tikleri kaldirdigimiz zaman parametresiz bir cons. uretmis olduk.
		// super();
		// Java'dan yardim alarak bir constructor olusturdugumuzda, Java constructor'in ilk satirina super(); keyword'unu ekler.
		// Eger icinde oldugumuz class bir child class degilse super(); keyword'u silinebilir.
		// Bugune kadar biz olusturdugumuz constructor'larda hic super keyword'u kullanmadik.
		// Ancak bizim class'larimiz child class olmadigindan bir sorun olmadi. Burada da child class olmadigi icin super'leri kaldirabiliriz.
		
		System.out.println("Personel parametresiz constructor calisti");
	}
		public Personel(String isim, int sayi) {
			// super();
			//this.isim = isim;
			//this.sayi = sayi; bunlari da getiriyor simdilik kapattim isim yok.
			System.out.println("Personel 2 parametreli constructor calisti");
		}
	
		
	
	
	
}
