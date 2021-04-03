package day39_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptions01 {

	public static void main(String[] args) {
		// Java'ya bir dosyayi okumasini veya dosyaya yazmasini soyledigimizde, 
		// Java "Ya dosyayi bulamazsam" der ve bizden cozum uretmenizi bekler, dosya bulma ile ilgili exception turumuz FileNotFoundException'dir.
		// Java kodu yazar yazmaz buradaki olasi problemi gorur ve CTE verir.
		// Kodumuzu yazdigimiz anda ortaya cikan bu tur exception'lara Checked Exceptions denir. 
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\nihat\\eclipse-workspace\\winter2021turkish\\src\\day39_exception\\File");
		} catch (FileNotFoundException e) {  // FileNotFoundException Belirtilen yol yoksa ortaya cikan hata turudur. 
			
			//e.printStackTrace(); // src'nin yanina 1 koydugum zaman yanlis yol oldugu icin run yapinca hata verdi.
			// tum hata aciklamalarini yazdirir ama kodumuz bloke olmaz. 
			System.out.println(e.getMessage()); // daha az hata aciklamasi yazdirir.
		} 
		System.out.println("Kod bloke olmamis");
		// File dosyasi icin File'a sag klik yap, Properties'i sec, Location'i kopyala ve buraya yapistir. 
		// Sikayete hala devam ediyor ustune gel Surrond with try catch'i sec
		// fis = FileInputStream
		

	}

}
