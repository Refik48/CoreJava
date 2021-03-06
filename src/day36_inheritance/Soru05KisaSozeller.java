package day36_inheritance;

public class Soru05KisaSozeller {
	
	/*
	 * 1) Encapsulation nedir?
	 *  Encapsulation, hassas datalari korumak icin kullanilan data saklama yontemidir
	 *  
	 * 2) Datalari nasil saklariz?
	 *  Data値ari private access modifier kullanarak saklariz.
	 *  
	 * 3) Saklanan datalara diger class値ardan ulasabiliriz?
	 *  Getter ve setter method値arini kullanarak ulasabiliriz.
	 *  
	 * 4) getter() method置 ne yapar ?
	 *  Saklanan datalari okumamizi saglar.
	 *  
	 * 5) setter() method置 ne yapar ?
	 *  Saklanan datalari obje uzerinden update edebilmemizi saglar.
	 *  
	 * 6) immutable class nedir?
	 *  Encapsule edilen bir class壇a sadece getter method置 olusturursak datalari okuyabiliriz ama degistiremeyiz.
	 *  Bu tur class値ara immutable class denir.
	 *  
	 * 7) setter() method値ari icin naming convention nedir?
	 *  Tum data turleri icin isimler 都et? ile baslar.
	 *  
	 * 8) getter() method値ari icin naming convention nedir?
	 *  Boolean data turu icin 妬s? ile, diger data turleri icin 堵et? ile baslar.
	 */
	
	/*
	 * 
	 * 1) Inheritance段n avantajlari nelerdir ?
	 *   Reusability, Maintenance, Less Code.
	 *   
	 * 2) Bir Class誕 Parent Class olusturmak icin Syntax nedir?
	 *   public class ChildClassIsmi extends ParentClassIsmi
	 *   
	 * 3) Hangi access modifier値ar inherit edilebilir ?
	 *   public ve protected olanlar heryerden, default olanlar ayni paketten inherit edilebilir.
	 *   
	 * 4) super() ile this()段n farki nedir?
	 *   super() parent class壇an, this() ise icinde bulunulan class壇an constructor cagirmak icin kullanilir
	 *   
	 * 5) super() ile super.地in farki nedir?
	 *   super() parent class壇an constructor, super. ise variable veya method cagirmak icin kullanilir
	 *   
	 * 6) this() ile this.地in farki nedir?
	 *   this() constructor, this. ise class variable veya method置 cagirmak icin kullanilir
	 *   
	 * 7) super. ile this.地in farki nedir?
	 *   super parent class壇an variable veya method cagirmak icin kullanilir, 
	 *   this. ise icinde bulunulan class壇a class level variable veya method値ari cagirmak icin kullanilir.
	 *   this. ile parent class壇an da variable veya method cagrilabilir ancak ayni isimde bir
	 *   variable/method hem icinde bulunulan class壇a hem de parent class壇a olursa this parent class壇a
	 *   olani degil icinde bulunulan class壇akini cagirir.
	 *   Emin olmak icin parent class icin super kullaniriz.
	 *   
	 * 8) super() ve this() bulunduklari constructor壇a ilk sirada olmalidir. 
	 *   (True) 
	 * 
	 * 9) super() ve this() bir constructor壇a sadece 1 kere kullanilabilir. 
	 *   (True)
	 * 
	 * 10) super() ve this() birlikte ayni constructor壇a kullanilabilir.
	 *   (False) Cunku ikisi de ilk satirda olmasi lazim birisi varsa digeri olamaz
	 */
	
}
