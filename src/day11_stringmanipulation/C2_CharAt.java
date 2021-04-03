package day11_stringmanipulation;

public class C2_CharAt {

	public static void main(String[] args) {
		// charAt (index)
		// scan.next().charAt(0) scan.next ilk kelimeyi alir , charat0 ilk harfi alir
		
		String str = "Java cok guzel";
		System.out.println(str.charAt(0)); // J verir
		System.out.println(str.charAt(5)); // c
		System.out.println(str.charAt(13)); // l
		System.out.println(str.length()-1);
		// kelimenin uzunlugu son index +1'dir
		// son index kelimenin uzunlugu(length) -1'dir
		// Kullanici 10 harfli bir kelime girerse , bana son harfi verecek kod :
		// str.charAt(9) cunku 0'dan basliyor
		
		// System.out.println(str.charAt(2999));
		String str3 = "word"; // burada "word" yerine sayi yazsaydim java hata verecekti algiliyordu ama yukarda charAt2999 hata olmasina ragmen vermedi
		// Str'de ki hata Compile Time Error CTE (Kod calismadan once javanin farkina varip altini kirmizi cizdigi hatalardir)
		// Ama syso icinde ki hata neden gozukmuyor ? Cunku java orada ki kelime uzunlugunu algilayamaz 
		// yani 2999 olup olmadigini calistir dedikten sonra algilar ve sonuc ekraninda hata verir
		System.out.println(str3);
		// bazi hatalar syntax'den anlasilmaz (like 2999), ancak kod calistirildiktan sonra java islemi yaparken anlasilir.
		// Kod Run (calistir) dendiginde ortaya ciktigi icin bu tur hatalara "Run Time Error"" denir (RTE) 
		
	}
}
