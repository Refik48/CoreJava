package day13_stringmanupalation;

public class C08_Substring {

	public static void main(String[] args) {
		
		String str = "Her ders Java gibi olsa";
						
		System.out.println(str.substring(10)); // 10.index dahil (inclusive) sonuna kadar tum String'i yazar.
		System.out.println(str.substring(str.length()-10)); // son 10 harfi yazdirir
		
		System.out.println(str.substring(0,10)); // 1'den 10'a kadar olani yazdirir. 0 inclusive, 10 exclusive'dir.
		// 11. karakterden sonuna kadar olan String'i yazdiralim.
		System.out.println(str.substring(10)); // Baslangic icin kacinci indexten baslicaksan +1'ini yazacaksin 0'dan basladigi icin
				
		// str'in ilk 10 harfini * ile gizleyin, geriye kalanlar normal yazilsin.
		
		System.out.println(str.substring(0, 11).replaceAll("\\D", "*") + str.substring(10));
		
	    System.out.println(str.substring(10, 10)); // baslangic indexi olsun der ama bitis indexi olmasin der, java son soyleneni yapar (bosluk verir)
	    // System.out.println(str.substring(10, 1));  // Hata verir
	    System.out.println(str.substring(23)); // bosluk verir , uzunlugu 23 ama 0'dan basladigi icin son karakter 22'dir.
	    System.out.println(str.length()); // uzunlugunu verir , 23
	    
	    // str'in ilk 10 harfini * ile gizleyin, geriye kalanlar normal yazilsin.
	    String str2=str.substring(0, 10); // str'nin ilk 10 harfini aldik
	    str2=str2.replaceAll("\\W","a"); // bosluklari harfe donusturdum
	    System.out.println(str2.replaceAll("\\w", "*") + str.substring(10)); // ilk 10'unu * gerisini normal yazdirdik
	}
}
