package day36_inheritance;

public class Soru05KisaSozeller {
	
	/*
	 * 1) Encapsulation nedir?
	 *  Encapsulation, hassas datalari korumak icin kullanilan data saklama yontemidir
	 *  
	 * 2) Datalari nasil saklariz?
	 *  Data’lari private access modifier kullanarak saklariz.
	 *  
	 * 3) Saklanan datalara diger class’lardan ulasabiliriz?
	 *  Getter ve setter method’larini kullanarak ulasabiliriz.
	 *  
	 * 4) getter() method’u ne yapar ?
	 *  Saklanan datalari okumamizi saglar.
	 *  
	 * 5) setter() method’u ne yapar ?
	 *  Saklanan datalari obje uzerinden update edebilmemizi saglar.
	 *  
	 * 6) immutable class nedir?
	 *  Encapsule edilen bir class’da sadece getter method’u olusturursak datalari okuyabiliriz ama degistiremeyiz.
	 *  Bu tur class’lara immutable class denir.
	 *  
	 * 7) setter() method’lari icin naming convention nedir?
	 *  Tum data turleri icin isimler “set” ile baslar.
	 *  
	 * 8) getter() method’lari icin naming convention nedir?
	 *  Boolean data turu icin “is” ile, diger data turleri icin “get” ile baslar.
	 */
	
	/*
	 * 
	 * 1) Inheritance’in avantajlari nelerdir ?
	 *   Reusability, Maintenance, Less Code.
	 *   
	 * 2) Bir Class’a Parent Class olusturmak icin Syntax nedir?
	 *   public class ChildClassIsmi extends ParentClassIsmi
	 *   
	 * 3) Hangi access modifier’lar inherit edilebilir ?
	 *   public ve protected olanlar heryerden, default olanlar ayni paketten inherit edilebilir.
	 *   
	 * 4) super() ile this()’in farki nedir?
	 *   super() parent class’dan, this() ise icinde bulunulan class’dan constructor cagirmak icin kullanilir
	 *   
	 * 5) super() ile super.’nin farki nedir?
	 *   super() parent class’dan constructor, super. ise variable veya method cagirmak icin kullanilir
	 *   
	 * 6) this() ile this.’nin farki nedir?
	 *   this() constructor, this. ise class variable veya method’u cagirmak icin kullanilir
	 *   
	 * 7) super. ile this.’nin farki nedir?
	 *   super parent class’dan variable veya method cagirmak icin kullanilir, 
	 *   this. ise icinde bulunulan class’da class level variable veya method’lari cagirmak icin kullanilir.
	 *   this. ile parent class’dan da variable veya method cagrilabilir ancak ayni isimde bir
	 *   variable/method hem icinde bulunulan class’da hem de parent class’da olursa this parent class’da
	 *   olani degil icinde bulunulan class’dakini cagirir.
	 *   Emin olmak icin parent class icin super kullaniriz.
	 *   
	 * 8) super() ve this() bulunduklari constructor’da ilk sirada olmalidir. 
	 *   (True) 
	 * 
	 * 9) super() ve this() bir constructor’da sadece 1 kere kullanilabilir. 
	 *   (True)
	 * 
	 * 10) super() ve this() birlikte ayni constructor’da kullanilabilir.
	 *   (False) Cunku ikisi de ilk satirda olmasi lazim birisi varsa digeri olamaz
	 */
	
}
