package day11_stringmanipulation;

public class C4_Equals {

	public static void main(String[] args) {
		// str.equals(str2) str ve str2'yi karsilastirir ve String olarak esit olup olmadiklarina bakar
		// sonuc olarak true veya false dondurur (Sonuc)
		
		// bazi methodlarin yaptiklari islem ile dondurdukleri sonuc farkli olabilir
		// bir methoda git ali ismindeki elementi sil deriz
		// o da gidip ali'yi bulur ve siler
		
		String str1 = "Ali Can";
		String str2 = "Ali Can";
		String str3 = "Ali can"; // str1 ile str2'nin esit olup olmadigini yazdirin . Esit veya Esit Degil yazdirin.
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str1.equals(str2) ? "Esit" : "Esit degil");
		System.out.println(str1.equals(str3) ? "Esit" : "Esit degil");
		
		// Java'da String'ler case sensitive'dir.(Buyuk kucuk harf duyarli)
		// Bir harf bile farkli olsa Stringler esit olmaz

	}

}
