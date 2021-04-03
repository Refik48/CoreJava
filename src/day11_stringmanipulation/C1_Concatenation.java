package day11_stringmanipulation;

public class C1_Concatenation {

	public static void main(String[] args) {
		// Concatenation : (Birlestirme), Java'da + islemi yapilirken eger toplanan ifadelerden biri veya her ikisi STR ise 
		// Java toplama degil birlestirme yapar
		
		System.out.println(15 + 20 + "Merhaba");
		System.out.println("Merhaba" + 15 + 20);
		System.out.println("Merhaba" + (15 + 20)); // Java butun islem onceliklerini bilir .
		
		String str1 = "Hello";
		String str2 = "World"; // Hello World yazdirmak istersek, 
		System.out.println(str1 + " " + str2);
		
		System.out.println(str1.concat(str2));
		System.out.println(str1.concat(" ").concat(str2));
		System.out.println(str1.concat(" " + str2));
		
	}

}
