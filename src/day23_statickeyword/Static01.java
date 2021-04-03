package day23_statickeyword;

public class Static01 {
	
	static String isim = "Mehmet"; // Static variable'i degistiridigimiz de butun class icinde degisiyor. 
	int yas = 49; // Inst. variable degismiyordu. 

	public static void main(String[] args) {
		/*
		 * Static variable'lar olusturulan tum objeler icin gecerlidir. (Okul adi gibi)
		 * Mesela bir class'da bir instance ve bir static variable olsun 
		 */
		
		Static01 st1 = new Static01(); // Obje olusuyor . Cons.'i kullaniyoruz
		Static01 st2 = new Static01();
		Static01 st3 = new Static01();
		
		st1.isim="Hasan";
		st1.yas=25;
		System.out.println(st1.isim + " " + st1.yas); // Hasan 25
		System.out.println("===============");
		
		st2.isim="Ayse";
		st2.yas=30;
		System.out.println(st2.isim + " " + st2.yas); // Ayse 30 //
		System.out.println(st1.isim + " " + st1.yas); // Ayse 25 // Neden burasi da ayse oldu ? Cunku st2.isim Static turunden oldugu icin direkt
		                                                         // en ust Static String isim = "Ayse"; olarak tanimlandi.
		System.out.println("===============");
		st3.isim="Alican";
		st3.yas=40;
		System.out.println(st3.isim + " " + st3.yas); // Alican 40 // Isim static varabile oldugu icin komple degisti ve hepsi Alican oldu
		System.out.println(st2.isim + " " + st2.yas); // Alican 30 // yas instance bir variable oldugu icin her seferinde degistirebildim 
		System.out.println(st1.isim + " " + st1.yas); // Alican 25 // o yuzden hepsinde farkli yazdiriyor.
		
	}

}
