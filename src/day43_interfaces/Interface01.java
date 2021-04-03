package day43_interfaces;

public interface Interface01 {

	public void motor(); // Interface icinde abstract method'lar ve OZEL concrete method'lar olabilir.
	
	/*
	   - Bir abstract method'un body'si olmadigindan o method'un istenen dinamik ozelligi nasil gerceklestirecegini bilmemiz
	   mumkun degildir, sadece ne yapacagini biliriz.
	   - Bu method bize sunu anlatir : Beni inherit eden her concrete class;in dinamik motor ozelligi olmalidir.
	 
	 */
	
	void vites(); // Beni inherit eden her concrete class'in dinamik vites ozelligi olmalidir. 
	abstract void kasa(); // Beni inherit eden her concrete class'in dinamik kasa ozellligi olmalidir.
	
	/*
	 Interface'de sadece ABSTRACT, PUBLIC method'lar olur.
	 Bu iki keyword'u yazsak da yazmasak da Java tum tum method'lari BU SEKILDE KABUL EDER.
	 Java'da interface olusturmak istiyorsak bastan o sekilde olusturmaliyiz.
	 Bir class 
	 Interface'e sadece abstract public method'lar konabilir.
	 Return type'lar farkli olabilir.
	 Interface icindeki variable'lar mutlaka public static ve final olmalidir. Private veya protected variable'lar CTE verir.
	*/
	
	String ISIM = "Nihat"; // Java isim kelimesini italik ve bold yapti, 
	// demek ki tum variable'lar final ve statictir. O yuzden buyuk yazdik.
	// Eger hem final hem static oldugundan variable atamak zorundayiz
	
	/*
	   Interface'lar icin Inheritance Kurallari :
	   
	   1) Interface'lerde inheritance yapmak icin implements keyword'u kullanilir.
	   Class extends Class || Class implements Interfase || Interface extends Interface
	   
	   2) Bir class birden fazla Interface'e implements ile baglanabilir
	   public class Arabam impelents ElektrikMotor, OtomatikVites, Seda { } 
	   Arabam -> Class
	   ElektrikMotor, OtomatikVites, Seda -> Interface
	   
	   3) Birden fazla Interface'i implements ile inherit ettigimizde ayni isimde variable veya method'larla karsilasabiliriz.
	   Bu durumda Java ne yapacagini bilmek isteyeceginden istedigimiz variable ismini interface ismi ile birlikte yazariz.
	   Method'lar mecburen override yapilacagi icin hangi interface'den alindiginin hicbir onemi yoktur.
	   
	   4) Ayni isme fakat farkli return type'a sahip method'lari olan Interface'leri ayni class'dan inherit edemeyiz. 
	   Signature ayni , return type farkli ise (ikiside interface olmak sarti ile) inherit edemeyiz.
	   
	 */
}
