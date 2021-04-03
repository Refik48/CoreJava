package day20_scope;



public class Scope2 {

	public static void main(String[] args) {
		
		// Ben farkli Classlardan da Scope1 Classina object olusturarak ulasabilirim.
		
		Scope1 obje2 = new Scope1();
		
		System.out.println(obje2.isim + " " + obje2.soyisim); // Bu class disindan cagirdigimiz icin diger class icindeki degeri yazdirir
		obje2.isim="Ahmet";
		obje2.soyisim="Can";
		System.out.println(obje2.isim + " " + obje2.soyisim);
		
		
		/*
		 * Java Run Time program oldugu icin Scope1 Class'ini calistirmaz
		 * Ama yukarda obje olusturdugumuz icin gidip sadece instance variable'lari okuma yapti , devamini calistirmadi (Scope1 icin)
		 */
		
		Scope1 x = new Scope1();
		System.out.println(x.isim + " " + x.soyisim);
		x.isim="Kalem";
		System.out.println(x.isim + " " + x.soyisim);
		
		

	}

}
