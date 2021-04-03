package day33_encapsulation;

public class Encapsulation04SuleymanHoca {

	
		/*
		 * 1) Encapsulation kisaca "data hiding(saklamak)" demektir. 
		 * 2) Basarili bir Encapsulation asagidaki ozelliklere sahip olmalidir :
		 *   a) Nasil kullanilacagi belli olmali (Direksiyon gibi)
		 *   b) Kod'un karmasikligi kullanimin karmasikligina sebep olmamali. Yani cok karmasik kodlardan olusan bir yapi basit bir sekilde kullanilmali.
		 *   c) Bir bolumun bozulmasi baska bolumlerin bozulmasina sebep olmamali. 
		 *   
		 * 3) Encapsulayion nasil yapilir ? 
		 *   a) Access Modifier'lari "private" olarak kullaniniz. 
		 *   b) getter ve setter methodlari ile "encapsulated" data'lara ulasip onlari okuyabilir(getter) ve degistirebiliriz(setter)
		 *   
		 * 4) Encapsulation'in faydalari :
		 *   a) Esneklik (flexibility). Normalde asagida "age" variable'inin degeri 25'dir . Ama diger class'larda setAge() methodunu kullanarak age
		 *  variable'inin degerini istedigimiz gibi degistirip kullanabiliriz.
		 *   b) Reusability(Tekrar kullanabilirlik). getter ve setter method'larini bir kez olustururuz sonra prohe icindeki tum class'lardan
		 *  istedigimiz kadar kullanabiliriz.
		 *   c) Istedigimiz datayi getter() method'u olusturarak okunabilir hale getirebiliriz.
		 *      Istedigimiz datayi getter() method'u olusturmayarak OKUNAMAZ hale getirebilirim.
		 *   d) Istedigimiz datayi setter() method'u olusturarak degistirilebilir yapabiliriz.
		 *      Istedigimiz datayi setter() method'u olusturmayarak DEGISTIRILEMEZ yapabiliriz. 
		 *   e) Kullanicinin kulandigi sistem arkasindaki karmasik yapiyi kullaniciya gostermez. Boylece kullanici yapmak istediklerini daha rahat yapar.
		 * Note : Tum variable'lar private ve sadece getter() methodlari olusturdum.  Bu tarz bir class'da datalar sadece okunabilir ama degistirilemez.
		 * String'lerde degistirilemez yani immutable'dir . Bu tarz class'lara immutable class denir, yani Setter'i OLMAYAN classlara denir. 
		 * 
		 * 5) Bir Class'da
		 *   a) Tum variable'lar "private" ise 
		 *   b) Tum getter()'ler ve tum setter()'ler olusturulmus ise bu class " FULLY ENCAPSULATED" olarak adlandirilir. 
		 * 
		 * 6) Getter() ve Setter() methodlarina ayni zamanda "Java Beans"da denir. 
		 * 
		 */

		private int age = 25; 
		private String name = "ali";
	}


