package day31_varargsstringbuilder;

public class C6_StringBuilder01 {

	public static void main(String[] args) {
		
		/*
		 * StringBuilder mutable(degisebilir) String elde etmemize olanak tanir . Cunku String normalde Immutable(Degistirilemez)'di.
		 * Boylece hafizada her seferinde yeni bir alan acilmadan var olan alan uzerinde degisiklik yapilabilir . Bu da SB sinifini hafiza
		 * kullanimi olarak String sinifinin onune gecirir.
		 * SB thread-safe degildir. Yani synchronized degildir. Thread'li bir ilsem kullanilacaksa SB kullanilmasi guvenli degildir.
		 * Not: StringBuffer, StringBuilder’a benzer. StringBuilder, StringBuffer’dan hizlidir. Multi-thread icin StringBuffer kullanilir.
		 */
		
		StringBuilder sb1 = new StringBuilder(); // Bos bir SB olusturur.
		System.out.println("sb1 : " + sb1); // Bos bir deger verir
		StringBuilder sb2 = new StringBuilder("Mehmet"); // Icinde Mehmet degeri olan SB uretir.
		System.out.println("sb2 : " + sb2); // Mehmet 
		
		StringBuilder sb3 = new StringBuilder(10); // 10 karakter kapasitesi olan bir SB uretir.
		System.out.println("sb3 : " + sb3);
		
		sb1.append("Hoca"); // append ile ekleme yaptim . 
		System.out.println("sb1 append : " + sb1);
		
		sb2.append("Hoca");
		System.out.println("sb2 append : " + sb2); // Mehmet Hoca
		
		sb3.append("Hoca");
		System.out.println("sb3 append : " + sb3); // Hoca
		
		// length(); SB;in uzunlugunu verir.
		System.out.println(sb1.length()); // 4 "Hoca"
		System.out.println(sb2.length()); // 10 
		System.out.println(sb3.length()); // 4
		
		// capacity(); SB'un kapasitesini verir
		System.out.println(sb1.capacity()); // 16 Bir deger yazmadigimiz icin def.cap.16
		System.out.println(sb2.capacity()); // 22 // Basta biz Mehmet olusturduk 16'da def.deger olusturdu.
		System.out.println(sb3.capacity()); // 20 
		
		
		// Eger bir SB'i uzunluk belirterek olusturduysak , o kapasitede bir alan olusturur ve o kapasiteyi doldurana kadar , oraya
		// yazi yazmaya devam . Kapasiteden fazla yazi yazmak istedigimiz zaman orantisiz sekilde arttirmaya devam eder. (2 * x + 2)
		// Capacity meselesi hafiza yonetimi icin cok onemlidir. 
		//Kod yazilirken sbt uzunluk veya max. uzunluk belli ise altta ki gibi method ile olusturarak HAFIZA KULLANIMINI optimize edebiliriz.
		
		StringBuilder sb4 = new StringBuilder(5);
		System.out.println(sb4.length()); // 0
		System.out.println(sb4.capacity()); // 5
		
		sb4.append("Kemal");
		System.out.println(sb4.length()); // 5
		System.out.println(sb4.capacity()); // 5
		
		sb4.append(" Can");
		System.out.println(sb4.length()); // 9
		System.out.println(sb4.capacity()); // 12 
		
		 
		
	}

}
