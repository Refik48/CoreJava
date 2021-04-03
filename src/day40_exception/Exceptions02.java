package day40_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions02 {

	public static void main(String[] args) throws FileNotFoundException , IOException    {  // 2 tanede ekleyebiliyoruz.
		// throws'un amaci : Kodum dogru benim sorunum yok sen hata verme bana yoluna Java kardes bak demek icindir.
		/*
		 * THROWS
		 * - Throws keyword “checked exceptions” icin kullanilir.
		 * - Throws keyword, exception handle yapilmak istenmiyorsa kullanilir. (Exception olusunca program calismasi durur)
		 * - Throws keyword’den sonra, aralarina virgule konularak, birden fazla exception yazilabilir
		 * - Throws keyword method body icinde kullanilamaz, kullanilacaksa method isminin oldugu satirda yazilmalidir.
		 * - Throws keyword’den sonra birden fazla exception kullanilacaksa ve yazilan 
		 *  exception’lar arasinda parent child iliskisi varsa , child exception yazilabilir ama tavsiye edilmez. 
		 *  Cunku parent exception tum durumlari kapsayacaktir. (Hedef farkli durumlar icin aciklama yazip 
		 *  handle etmek olmadigindan, bir exception’in calismasi yeterlidir)
		 */
		
		FileInputStream fis = new FileInputStream("C:\\Users\\nihat\\eclipse-workspace\\winter2021turkish\\src\\day39_exception\\File");
		// Ustune geldim ve Add throws declaration'a tikladim . Main'e throws FileNotFoundException . Import etmezse import et.
		
		/*
		 * Try-catch blogu exception ile handle etmekde kullanilir.
		 * Throws keyword'u ise sadece declaration'dir, dolayisiyla throws kullanilan bir method'da exception olursa KOD BLOKE OLUR. 
		 */
		int k = 0;
		
			while((k=fis.read())!=-1) {  // Dun burada ki hatayi cozmek icin 3 farkli yol gormustum. Ustune gelip Add throws declaration'a tiklayinca
				System.out.print((char) k); // main'e throws IOException ekliyor. Yukardaki ile farkli exception turleri , ne yapacagim ? 
				// Eger birden fazla exception varsa throws keyword'u kullanacaksak, yazacagimiz exception'larin arasindaki iliski ve siralama onemli
				// olur . Eger yazdigimiz exception'lar arasinda parent-child iliskisi varsa once Child exception yazilmalidir.
				// Aksi takdirde child exception erisilemez olur. Class'lar siralamasi icin FileIntputStream ya da while icerisine mouse'u goturerek
				// internet ile bilgi yerine baglanirsak siralamayi goruruz.
				// Eger yazacaklarimiz arasinda Parent-Child iliskisi varsa istersek sadece Parent'i yazmamiz da yeterli olur
				

	}
		}
	
}

