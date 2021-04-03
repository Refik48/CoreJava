package day13_stringmanupalation;

public class C09_Trim {

	public static void main(String[] args) {
		// 
		
		String str = " Java ogrenmek cok guzel. ";
		System.out.println(str); // basta ve sonda bosluklar var 
		System.out.println(str.length()); // o yuzden 26 karakterlidir
		System.out.println(str.trim()); // trim String'in basindaki ve sonundaki bosluklari siler
		System.out.println(str.trim().length()); // ve uzunlugu ona gore yazdirir . 24
		
		System.out.println("=========================================");
		
		String str2 = "JAVA GUZEL ";
		System.out.println(str2.trim());
		System.out.println(str2.trim().length());
	}

}
