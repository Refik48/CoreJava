package day21_scope;

import day20_scope.A00;

public class Scope4 {

	public static void main(String[] args) {
		// LOCAL METHOD : Herhangi bir method icerisinde olusturulan variable'lardir(Main method dahil)
		// Local variable'lar sadece o method icerisinde dahildir.
		// Baska methodlarda da kullanilacak variablle'lari local olusturmak yerine 
		// Java local variable'lara default deger ATAMAZ
		// Sadece olusturdugunuzda Java SIKAYET ETMEZ (variable olusturuldu method icerisine deger atanacak diye bekler)
		// Olusturulan variable'lara deger atamadan kullanmaya calisirsaniz Java sikayet eder (CTE)
		
		int sayi;
		
		// 1- System.out.println(isim); alttaki method'da var burada isim nie yazdirmadi ?
		// 1- Cunku bir method icinde olusturulan variable, sadece o method icinde kullanilabilir.
	
		int sayi2; // 2- bir local variable deger atanmadan da olusturulabilir
		// 2- System.out.println(sayi2); burada initialize variable diyor yani ilk deger atamalisin . 
		// 2- ilk deger atamasi yapilmayan variable'lar kullanilamaz
		// 2- sayi++; ilk deger atanmadigi icin artirma yada azaltma da yapamayiz
		// 2- Java deger atamasi olmadan local variable olusturulmasina izin verir, ileride deger atanacak diye bekler
		
		sayi2 = 15; // 2- olusturma ayri satirda(18.satir), deger atamasi ayri satirda (24.satir) yapilabilir.
		System.out.println(sayi2);
		// 3- Birden fazla method'un oldugu class'larda her method'da kullanmamiz gereken 
		// 3- ortak variable'lar varsa Class level'da variable olusturmaliyim
		// 3- Ortak variable class'in yapisina bagli olarak instance veya static olabilir.
		staticMethod();
		
		A00 x = new A00();
		
	}

	static int sayi=888;
	public static void staticMethod() {
		
		
		System.out.println(sayi);
		Scope4 obje=new Scope4();
		obje.method();
		
	}
	
	public void method() {
		boolean isTrue = true;
		System.out.println("sadece method calisti");
		
		// 1- System.out.println(sayi); Bu kural static olan veya olmayam tum method'lar icin gecelidir
	}
	
}
