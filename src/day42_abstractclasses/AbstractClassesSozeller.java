package day42_abstractclasses;

public class AbstractClassesSozeller {

	/*
	   - Abstract class, genellikle ortak özellikleri olan nesneleri tek bir çatı altında toplamak için kullanılır.
	   - Tum child class’larda olmasini istedigimiz dinamik ozellikleri (methods) abstract class’da abstract method olarak olustururuz.
	   - Abstract olmayan (concrete) tum child class’lar abstract method’lari override etmek zorundadir. 
	    Boylece tum child class’lar ayni dinamik ozelliklere (methods) sahip olurlar.
	    
	   - Abstract class nasil olusturulur ? Abstract class olusturmak icin class keyword’unden once abstract keyword’u yazilmalidir.
	    public abstract class Personel {
	 }
	   - Abstract method nasil olusturulur ? Abstract method olusturmak icin abstract keyword’u yazilmalidir. 
	   - Abstract method’un body’si OLMAZ (No implementation), body olusturursaniz CTE olusur.
	   - Abstract method private, final veya static olarak tanimlanamaz.
	    public abstract void maasHesapla();
	    
	   Not : Bir abstract class, abstract veya concrete method’lara sahip olabilir.
	   Not : Concrete class icinde Abstract method OLUSTURULAMAZ
	   
	   Kural 1) Concrete bir child class, parent’i olan abstract class’lardaki tum abstract method’lari implement etmelidir, diger turlu CTE olusur.
	   Kural 2) Abstract method’lari implement etmek icin oncelikle overriding yapilmalidir.
	   Kural 3) Abstract class, abstract olmayan (concrete) method’lara da sahip olabilir. Cocrete method’lar implement edilmek ZORUNDA DEGILDIR. 
	     Parent-child iliskisi ile kullanilabilirler veya istenirse override edilebilirler.
	   Kural 4) Abstract bir child class, parent’i olan abstract class’lardaki method’lari implement etmek ZORUNDA DEGILDIR. 
	     Parent-child iliskisi ile tum method’lara ulasabilir.
	   Kural 5) Abstract class’lar somutlastirilamaz (can not be instantiated) yani abstract class’larda obje olusturulamaz.
	   Kural 6) Abstract class’lar private veya final olarak tanimlanamaz.
	   
	   Not : Bir abstract class, abstract veya concrete method’lara sahip olabilir.
	   Not : Concrete class icinde Abstract method OLUSTURULAMAZ
	 
	 
	 */

}
