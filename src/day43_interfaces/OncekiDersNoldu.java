package day43_interfaces;

public class OncekiDersNoldu {

	/*
	   - Abstract class : Soyut class demektir. Child class'larda olmasini istedigimiz dinamik ozelliklerin(method) yazildigi, 
	   ortak ozelliklerin belirlendigi bir class'dir.
	   - Abstract class'larin icinde abstract(body'siz) method'lar ve concrete method'lar olabilir.
	   - Abstract bir class yine abstract olan bir class'i inherit ettiginde abstract method'lari override etmek ZORUNDA DEGILDIR.
	   Ancak abstract class'lardan sonra gelen ilk concrete class tum abstract parent(lar)indaki tum Abstract method;lari override etmelidir.
	   - Abstract class icindeki concrete method'larin override edilmesi veya Abstract class'daki variable'larin kullanilmasi opsiyoneldir.
	   Istersek kullaniriz, istemezsek kullanmayiz. 
	   - Concrete bir class icerisinde Abstract bir method OLUSTURULAMAZ.
	   - Abstract method'lar static, final ve private olarak tanimlanamaz.	 
	   - Abstract class'lar consturctor'a SAHIPTIR fakat instantinate (orneklendirme=turkcesi) (obje olusturma=teknik karsiligi) YAPILAMAZ. 
	   Abstract class'dan obje uretemezsiniz.
	 */
}
