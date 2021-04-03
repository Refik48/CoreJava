package day29_passbyvalueimmutable;

public class C5_MutableImmutable02 {

	public static void main(String[] args) {
		
		/*
		 * Degisikligi kalici yapmak icin atama yaparsak, immutable class'lar nasil davranir ? Atama yapmadik diger classda atamam
		 */
		
		String isim = "Ali";
		
		isim = isim+"";
		System.out.println(isim.equals("Ali")); // true // equals sadece degere baktigi icin dogru
		System.out.println(isim=="Ali"); // false / == hem degere hem referansa bakiyor, deger Ali fakat referans farkli old. icin false verdi
		
		String str1 = new String("Mehmet"); // String bir obje oldugu icin new keyword'unu kullanabiliyorum cunku obje olusturuyorum
		String str2 = new String("Mehmet"); // new keyword oldugu icin once objeyi olusturur o yuzden referanslari farkli olur
		
		System.out.println(str1.equals(str2)); // True 
		System.out.println(str1==str2); // False 18.satirdaki aciklamadan dolayi false
		
		String str3 = "Mehmet"; // str3'u olusturduk. sonra str4'u olusturdugumuzda java diyor ki str3'de aynisi var bir daha neden olusturayim
		String str4 = "Mehmet"; // diyor ve str4'un referansini str3'e atayip hafiza tasarrufu yapiyor .(String havuzunda ki ayni objeye atiyor)
		
		
		System.out.println(str3.equals(str4)); // True 
		System.out.println(str3==str4); // True 24.satirdan dolayi referanslari aynidir, yani true verir.
		
		System.out.println(str3.equals(str1)); // True
		System.out.println(str3==str1); // False
		
		

	}

}
