package day39_exception;

public class Exceptions07 {

	public static void main(String[] args) {
		
		// Data turlerini casting yaparken uygun olmayan islem yaparsaniz Java ClassCastException verir.
		// Eger tamamen sayilardan olusmayan bir String'i int'e cevirmeye calisirsaniz Java NumberFormatException verir,
		
		int sayi = 10;
		// String str = sayi; Bu CTE turudur, exception degildir.
		
		String str = "123456";
		
		System.out.println(str+sayi); // concat yapar 12345610
		
		int strSayi = Integer.parseInt(str); // String'i int'e cevirdik.
		System.out.println(strSayi + sayi); // 123466 
		
		String str2 = "123a45";
		// System.out.println(Integer.parseInt(str2)); // NumberFormatException
		
		Object sayi2 = 40;
		String sayiStr =(String)sayi2; // Explicit narrowing castion 
		                               // ClassCastException 
		

	}

}
