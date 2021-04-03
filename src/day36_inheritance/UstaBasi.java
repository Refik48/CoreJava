package day36_inheritance;

public class UstaBasi extends Isci {
	
	public String bolum = "takimhane";
	public int sorOldIscisay = 34;

	public static void main(String[] args) {
		
		UstaBasi ub1 = new UstaBasi(); // Objeyi torun class'inda olusturunca 3 class'a da ulasabiliyoruz.
		
		System.out.println(ub1.bolum); // takimhane
		System.out.println(ub1.sorOldIscisay); // 34
		System.out.println(ub1.saatUcreti); // 20
		System.out.println(ub1.isim); // Mehmet
		
		// UstaBasi isA iscidir
		// Isci isA personel
		// Ustabasi bir iscidir, o zaman obj2 olustururken bastaki class'i isci yapayim
		
		Isci ub2 = new UstaBasi();
		System.out.println(ub2.departman);
		System.out.println(ub2.izindeMi);
		
	   /* Java sorun etmedi olusturabiliyoruz fakat bu class'in variable'larini (en ustte ki instance variable'lari) kullanamiyorum. 
		* Bazen buna ihtiyac duyariz, amac kapsami genisletmektir. (Avantaj)
		* Iscinin baska child class'lari olsaydi, onlarin da variable'larini kullanabilecektik. (Avantaj)
		* Fakat kendi class'indaki variable'lara ulasamiyoruz ve kullanamiyoruz. (Dezavantaj)
		* Data Turu olarak sectigimiz(Personel,Isci..) class ve parent(larina) ait datalara ulasabiliriz.
		* Ayni isimde iki method varsa Data Turu'ne bakilir.
		*/

		Personel ub3 = new UstaBasi();
		System.out.println(ub3.id);
	}

	
}
