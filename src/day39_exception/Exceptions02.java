package day39_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions02 {

	public static void main(String[] args) {

		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\nihat\\eclipse-workspace\\winter2021turkish\\src\\day39_exception\\File");
			// Cok anlamayip, ezberlemeye calisma sadece kafanin kosesinde bu bilgi de vardi diye dursun.
			int k = 0;
			try { 
				while((k=fis.read())!=-1) { // k'ya fis objesi uzerinden read yazdim. Simdi bunu Boolean'lastiracagim. While icinde sart olmasi lazim.
					System.out.print((char) k); //Atamayi parantez icine al ve sona !=-1 yaz, alt satira in syso(k) yaz .
					// ASCII kodlarinda -1 olmadigi icin,-1  esit degilse calıs(true) anlaminda -1'e esitledim . Hala sikayet var ustune gel
					// Surrond with try catch yap . Bunun sebebi nedir ? Bir once ki exception turumuz FileNotFoundException'idi (Ya evde yoksa).
					// Dosyayi bulduk ama okuyamiyorsak exception aliyorsak o durumlar icin bunu yapiyoruz .
					// System.out.print(k); boyle oldugu zaman File icinde yazilanlarin ASCII degerlerini veriyor normal degerleri yazdirmak icin;
					// System.out.print((char) k); yazarsak ASCII degil normal yazilanlari veriyor.
					
					/* Nested try catch var. Disarda olan Dosya bulunamazsa diyeydi, FileNotFoundException. 
					* Dosyayi buldu diyelim simdi icerideki try catch'e bakacagim burada ise Dosyayi Okuyamazsam durumuna bakiyorum, IOException.
					* FileNotFoundException is-A IOException iliskisi var . Eger kodumuzu yazdigimizda birden fazla exception'la iliskili durum
					* olusuyorsa, nested try-catch bloklari olusturabiliriz. Bu ornekte ilk once dosyayi okutmak istedik,
					* Java, "Ya dosyayi bulamazsam ? " diye bizden yardim istedi . Biz de try-catch blogu ile FileNOTDounfException ile 
					* handle etmesinde yardimci olduk. Sonra dosyadaki yazilari okumaya calistik ve Java yeniden "Ya dosyayi okuyamazsam"
					* diye yardim istedi, biz de try-catch blogu ile IOException ile handle etmesini sagladik.
					*/ 
				}
			} catch (IOException e) { // Dosyalarla ilgili genel yazma ve okuma sorunlari ile handle eder.
				
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) { 
						
			
			System.out.println(e.getMessage()); 
						
		} 
		System.out.println("Kod bloke olmamis");

	}

}
