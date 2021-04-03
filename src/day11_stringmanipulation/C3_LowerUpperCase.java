package day11_stringmanipulation;

import java.util.Locale;

public class C3_LowerUpperCase {

	public static void main(String[] args) {
		// str.toLowerCase() verilen butun str'i kucuk harfe cevirir.
		// str.toUpperCase() verilen butun str'i buyuk harfe cevirir.
		
		String str = "Techproeducation";
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		
		// str'i buyuk harfe cevirmek istersek (atama yapmak lazim)
		str = str.toUpperCase();
		System.out.println(str);
		
		System.out.println(str.toUpperCase(Locale.forLanguageTag("tr"))); // cok onemli degil sadece bilgi icin kodu tr diline cevirdi
		
		
	}

}
