package day13_stringmanupalation;

public class C11_Examples2 {

	public static void main(String[] args) {
		/*
		 *String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
			String str1 = “$13.99”
			String str2 = “$10.55”
			ipucu : Double.parseDouble() methodunu kullanabilirsiniz.
		 */
		
		String str1 = "$13.99";
		str1 = str1.replaceAll("\\D", ""); // sayisal olmayanlari sildik
		System.out.println(str1); // 1399
		
		String str2 = "$10.55";
		str2 = str2.replaceAll("\\D", "");
		System.out.println(str2); // 1055
		
		// str1+str2 Yapamayiz cunku sayi olsalar bile onlar String yani toplama yapamayiz.
		// Eger iceriginin tamamen sayi oldugunu bildigimiz String varsa parseDouble() veya parseInteger() methodu kullanabiliriz
		/// Ancak primitive data tipleri method'a sahip olmadiklarindan wrapper class kullanmam lazim .
		double sayi1=Double.parseDouble(str1);
		double sayi2=Double.parseDouble(str2);
		double toplam= (sayi1+sayi2)/100; // 100'e boldum cunku yukarda \\D ile .'yi da silmistik onu geri getirdik.
		System.out.println(toplam);
		
	}

}
