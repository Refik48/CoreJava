package day20_scope;

import java.util.Scanner;

public class Scope1 {
	
	public int sayi; // class'in icinde fakat Main Methodun disinda olusuturulan ve STATIC OLMAYAN variable'lara INSTANCE(OBJECT) VARIABLE denir
	// Olusturulmasi yeterlidir deger atamak zorunda degiliz.
	// Class icinde veya baska Class'larda direkt kullanilamaz, kullanmak istedigimizde mutlaka object olusturmali ve object uzerinden ulasilmalidir
	// Class level'da olusturuldugu icin class'in her yerinden belli sartlarla kullanilabilir
	// Baska method icinde de olabilir onemli olan main methodun icinde olmamasi. (Baska method'da class icinde olmus oluyor)
	// Instance variable'lar object'e bagli olarak calisir (Ogretmen adina benzer, Mehmet Hocanin derste anlattigi)
	public String isim = "Mehmet";
	public String soyisim; // Str - null // sayi - 0 // boolean false // char - (space)
	public boolean booleanDefault;
	public char charDefault; // Day33 Class1 icin public yaptim.
	// Biz Run dedigimizde Java gene main methoddan sonra okumaya baslar
	
	
	
	public static void main(String[] args) {
		/* OOP : Object Oriented Programming . Nesne yonelimli program . Java classlar arasi kullanima izin verir.
		 * Bir Class icerisinde olusturulan variable'lar icin Scope, o variable'a nereden,nasil ulasalabilecegini 
		 * ve nerede gecerli old. ifade eder.
		 * Scope'a uymayan bir kullanimda Java Compile Error verir
		 * Java'da olusturulan variable'lar icin 4 scope mevcuttur.
		 * 1) Instance (Object) Variables // Ogretmen adi ogrenci notu gibi. Nihat tek basina bir sey ifade etmez Ogrenci Nihat, Personel Nihat vs
		 * 2) Static (Class) Variables // Okul adi, adresi gibidir . Bunu degistirdiginiz de herkes icin degisir
		 * 3) Local (Method) Variables // 
		 * 4) Loop Variables //
		 */
		int a; // local variable'larin deafult degeri olamaz
		
		
		// System.out.println(sayi); // Main methodun icin STATIC OLMAYAN bir variable'a static method icinden ulasamayiz.
		// main methodumuz static oldugu icin main method icerisinden static olmayan variable veya methodlara direkt ulasamayiz
		// satir 5'i static int sayi; yaparsa java sikayeti durdurur.  35.satiri gorunmez yapiyorum
		
		// method(); // java bunu da static yap diyor . Asagida 81.satida static yazmadigi icin hata veriyor
		// instance bir variable'a main method icerisinden ulasmak istedigimizde OBEJCT olusturmaliyiz. 
		
		// OBJECT nasil olusturulur ? 
		Scanner                 scan     =       new                     Scanner(System.in); // Bu Java'daki standart Object Creation formudur.
		// Scanner Class ismi // Scan Obje ismi  //new= Obje olusturmada keyword  //Scanner yeniden class ismi //System.in=parametre
		
		Scope1 obje1 = new Scope1(); // System.in Parametredir olmasa da olur her zaman yazmak zorunda degiliz
		System.out.println("sayi default " + obje1.sayi); // Bunu calistirdigimizda "0" degerini verir .
		
		System.out.println(obje1.isim); // burada isim'e itiraz etti cunku sayiyi obje uzerinden yazdirdim olmaz / obje1.isim yazmam lazim
		// Instance variable'lar olusturuldugunda biz istersek deger atayabiliriz.
		// Instance variable'lara eger biz deger atamazsak Java Default degerini verir .
		System.out.println(obje1.soyisim); // String default degeri Null'dir.
		
		Scope1 obje2 = new Scope1();
		obje2.isim="Muslum";
		obje2.soyisim="Baba";
		
		System.out.println(obje2.isim + " " + obje2.soyisim); // Muslum Baba
		System.out.println(obje1.isim + " " + obje1.soyisim); // Mehmet null // 
		System.out.println("Boolean default: " + obje1.booleanDefault);
		System.out.println("char default:" + obje1.charDefault);
		
		// boolean icin default False
		// sayi icin 0
		// String icin null
		// Char icin Bos deger (Space)
		
		Scope1 obje3 = new Scope1();
		obje3.isim="Ferdi";
		obje3.soyisim="Tayfur";
		obje3.booleanDefault = true;
		System.out.println(obje3.isim + " " + obje3.soyisim + " " + obje3.booleanDefault);
scan.close();		
} // Simdiye kadar hep main methodu icinde isleme basladik.
	
	public static void staticMethod() {
	
		String name;
	}
	
	public void method() {
		
		System.out.println("78.Satir" + sayi);
		
		// Bu method static olmadigi icin instance variable'lara direkt erisebilir
		sayi=sayi+20; // ve bu method icerisinde gecerli olmak uzere degerini degistirebilir.
		System.out.println(sayi); // ???? Anlamadim burayi // 
		Scope1 obje5 = new Scope1();
		System.out.println(obje5.sayi); 
	}
	
}
