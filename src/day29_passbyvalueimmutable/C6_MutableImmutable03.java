package day29_passbyvalueimmutable;

public class C6_MutableImmutable03 {

	public static void main(String[] args) {
		
		// Atama yapildiginda ne olur ? 
		
		String isim = "";
		
		for (int i = 0; i < 10; i++) {
			
			isim=isim+i;
			System.out.println(isim);
		}
		
		System.out.println("================================");
		System.out.println(isim); 
		
		/*
		 * Java burada kac tane obje olusturur ? Java isim diye bir variable olusturdu, ici bos olan . i referansina esitlendi .
		 * For loop'un icinde i=0 oldu , i=0 oldugu icin isim=isim+0 oldu. String immutable idi dolayisiyla Stringe yeni bir deger atamak isterseniz
		 * Java 0 variable icin ayri bir obje olusturur ve bunun referansini farkli yapar. Her bir i degeri icin ayri bir obje olusturur. 
		 * Onceki isim'ler silinmis oldu fakat referanslari kaldi. 
		 * Forloop bittiginde yeni atama yapmiyorsak en son ki isim degiskeni=0123456789 ve referansi i11 olacak.
		 * Peki once ki isimler nolacak ? Java'da garbage collector var . Isi bitmis objeleri toparlar .
		 */

		String a = "";
		a+=2; // concatination
		a+='c'; // concatination
		a+=false; // concatination / boolean'lar tirnak icinde yazilmaz.
		if (a=="2cfalse") {
			System.out.println("=="); // a=="2cfalse" yazi oldugu icin false olur bu calismaz.
		}
		if (a.equals("2cfalse")) {
			System.out.println("equals"); 
		}
		/*
		 *  Referans     Obje
		 *     a1         "" 
		 *     a2         2 
		 *     a3         2c
		 *     a4         2cfalse 
		 *     Atama oldugu icin yeni obje olusturuyor ve onceki objeleri garbage'in toplayacagi sekilde birakiyor.
		 *    
		 *     
		 */
	}

}
