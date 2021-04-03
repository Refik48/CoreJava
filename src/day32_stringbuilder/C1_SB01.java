package day32_stringbuilder;

public class C1_SB01 {

	public static void main(String[] args) {
	
		/*
		 * StringBuffer, StringBuilder'e benzer fakat daha yavastir. Multi-thread icin StringBuffer kullanilir.
		 * StringBuilder'ler thread-safe degildir. SB'de concatination yoktur yani syso(sb1 + sb2) yazamam, hata verir.
		 * Eger + ile toplamak istiyorsam sb1.toString , sb2.toString yazarak toplamam gerekir.***** (Birini cevirmem yeterli 42.satir) 
		 */
		
		StringBuilder sb1 = new StringBuilder("Nihat");
		System.out.println(sb1);
		
		sb1.append(" ").append("Tekiner");
		System.out.println(sb1);
		
		sb1.append("Javayi cok sever", 7, 12); // int start int end olani sectik . 6.index inclusive(dahil) , 9.index exclusive
		// append sonuna yazar. 6. index'e bakalim c harfine geliyor ondan sonra olan 12.indexe kadar olan kismi sb1'in sonuna ekler.
		System.out.println(sb1);		
		System.out.println(sb1.length()); // 18 SB uzunluk bilgisi
		System.out.println(sb1.capacity()); // 21 SB Kapasite bilgesi
		// concatination'da yapilabilir.
		
		System.out.println(sb1.charAt(1)); // i , charAt icinde yazan indexi verir.
		
		sb1.delete(14, 18); 
		System.out.println(sb1); // 14'den 18.index'e kadar olanlari siler.(18 haric)
		
		sb1.deleteCharAt(13); // 13.indexi siler
		System.out.println(sb1);
		
		String isim = "Nihat Tekiner";
		System.out.println(sb1.equals(isim)); // data turleri FARKLI oldugu icin icerigin kiyaslanmasi mumkun degildir, hep FALSE verir.
		
		System.out.println("37. Satir");
		StringBuilder sb2 = new StringBuilder("Nihat Tekiner");
		System.out.println(sb1==sb2); // False  // EGER SB ILE STRING == ILE KARSILASTIRILMAK ISTENIRCE CTE VERIR.
		System.out.println(sb1.equals(sb2)); // False SB'da equals method'u String'den farkli calisir,ayni ile obje kiyaslandiginda true verir
		System.out.println(sb1.equals(sb1)); // TRUE kendisinden baskasi ile equals olamiyor.
		
		System.out.println("42.satir" + sb1.toString()+sb2);
		
		System.out.println(sb1.indexOf("Tek")); // 6
		System.out.println(sb1.indexOf("i", 5)); // 9 // i harfini 5. indexten sonra var mi diye baksin 9. indexte varmis
		System.out.println(sb1.indexOf("w", 0)); // w olmadigi icin -1 verir
		
		sb1.insert(7, "w"); // istedigimiz indexe istedigimiz yaziyi koyar digerlerini silmez yana kaydirir.
		System.out.println(sb1); // append'den farki olarak, append sona ekleme yapiyor.
		
		String cumle = "Merhaba dunya";
		sb1.insert(0, cumle, 0, 7); // 0. index'e cumleyi yerlestir , ama cumleninde 0. index ile 7.index arasini yerlestirir.
		System.out.println(sb1); // MerhabaNihat Twekiner
		System.out.println(sb1.length()-1);
		
		sb1.insert(21, cumle, 8, 13); // 21.indexe cumlenin 8. ile 13. index arasini yerlestirir. (8 dahil)
		System.out.println(sb1); //MerhabaNihat Twekinerdunya
		
		System.out.println(sb1.lastIndexOf("e")); // 19 // en son e harfi nerede diye bakar 
		System.out.println(sb1.lastIndexOf("e", 18)); // 15 // 18.index ve oncesinde e nerede diye bakar
		
		System.out.println("63.satir : " + sb1);
		sb1.replace(7, 21, "Esra"); // SB'in baslangic ve bitis index'leri yerine, oraya verilen deger,kelimeyi yerlestirir. 
		System.out.println(sb1);
		
		sb1.reverse(); // SB1'i tersine cevirir.
		System.out.println(sb1); // aynudarsEabahreM
		
		sb1.reverse();
		sb1.setCharAt(2, 'k'); // 2.indexe k harfini koyar // charat oldugu icin tek tirnak
		System.out.println(sb1); // MekhabaEsradunya
		
		System.out.println(sb1.subSequence(0, 3)); // Mek // 0 ile 3 index arasini verir. (0 dahil) 
		
		System.out.println(sb1.substring(7)); //Esradunya // 7.index ve sonrasini yazdirir
		
		sb1.subSequence(8, 13); // subsSequence kalici degisiklik yapmaz, cunku bunlar bilgi verici methodlardan sadece syso icinde bilgi verirler.
		System.out.println(sb1);
		sb1.substring(8, 13); // substring kalici degisiklik yapmaz, cunku bunlar bilgi verici methodlardan sadece syso icinde bilgi verirler.
		System.out.println(sb1);
		
		StringBuilder sb3 = new StringBuilder("Java cok guzel");
		StringBuilder sb4 = new StringBuilder("Java cok guzel");
		System.out.println(sb3.equals(sb4)); // FALSE // iceriklerinin esit olup olmadigina bakmak icin STRING'deki equals methodunu kullanalim.
		
		System.out.println(sb3.toString().equals(sb4.toString())); // TRUE
		// syso icinde bakmak lazim oncesinde sb3.toString ve sb4.toString yazip sonrasinda karsilastirinca kalici olarak etki etmiyor.
		
		sb3.toString().concat(" Insanin sevdikce sevesi geliyor"); // String methoduna ait methodlar kullanilinca kalici degisiklik olmaz.
		System.out.println(sb3);
		System.out.println(sb3.toString().concat(" Insanin sevdikce sevesi geliyor"));
		// sb3.toString yazinca sb3 artik String oluyor ve bundan sonra . koyarak tum String Methodlarini kullanabiliriz ama syso icinde....
		
		System.out.println(sb1.length()); // 16
		System.out.println(sb1.capacity()); // 44
		sb1.trimToSize(); // SB icin hazirlanan kapasitedeki fazlaliklari silerek length ile kapasiteyi esit duruma getirir.
		System.out.println(sb1.length()); // 16
		System.out.println(sb1.capacity()); // 16
		
		System.out.println("101.satir");
		System.out.println(sb1);
		System.out.println(sb3);
		System.out.println(sb4);
		System.out.println(sb1.compareTo(sb4)); // 3 // iki SB'in tum karakterlerinin esitligini kontrol eder 
		System.out.println(sb3.compareTo(sb4)); // Ikisi birbirine esit ise 0 verir.
		
		StringBuilder sb5 = new StringBuilder("Ali okula gel");
		StringBuilder sb6 = new StringBuilder("Abi okula gel");
		System.out.println(sb5.compareTo(sb6)); // 10 // arasindaki fark 10 diyor, b ile l arasinda c d e f g h i j k 9 var harf var, 10. harf m
		// Esit olmayan ilk harf 10 karakter farklidir anlamindadir. Sadece ILK farkli olan degerlerin ASCII farkini verir
		
		// append(char [] ch) method'u char array eklemek icin kullanilir.
		char ch [] = new char[] {'J','A','V','A'};
		sb6.append(ch);
		System.out.println(sb6);
	}
}
