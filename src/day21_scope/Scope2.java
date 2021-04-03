package day21_scope;

public class Scope2 {
	
	

	public static void main(String[] args) {
		// Static variable'lar icin object olusturma ihtiyaci yoktur. 
		// Baska bir Class'dan static variable'lara ulsmak istedigimizde ulsmak istedigimiz class'in adi, static variable adi yazmamiz yeterlidir.
		
		System.out.println(Scope1.okulAdi);
		System.out.println(Scope1.okulId); // Java Run Time programdir. // 1201 yazdirir
		// Scope2 class'i calistirdiginda Scope1 classi CALISMAZ 
		// Bu yuzden en basta olusturulan veya atanan degerler gecerli olur
		
		Scope1.okulAdi="Mehmet Koleji";
		System.out.println(Scope1.okulId+Scope1.okulAdi); // Mehmet koleji
		
		Scope1.staticMethod();
		System.out.println(Scope1.okulId); // 1203 yazdirir cunku bir ust satirda static methodu calistirdik orada okulId 1203 olarak tanimli idi
		System.out.println(Scope1.okulAdi); // Mehmet Koleji yazdirir cunku static method icinde okulAdi diye deger yok.
		// Diger method burada cagirildiginda oraya gider ve o methodun bitimine kadar calisir diger method'u calistirmaz.

		Scope1.okulAdi="Kazim Koleji";
		System.out.println(Scope1.okulAdi);
	}

}
