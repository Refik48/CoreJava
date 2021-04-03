package day21_scope;

public class Scope1 {

	static int okulId = 1201;
	static String okulAdi="Yildiz Koleji";
	static boolean acikMi; // True || False verir.
	
	
	public static void main(String[] args) {
		
		
		System.out.println("12.satir " + okulId + " " + okulAdi + " " + acikMi);
		okulId=1202;
		acikMi=true;
		
		
		staticMethod();
		System.out.println("18.satir " + okulId + " " + okulAdi + " " + acikMi); 
		//Java en asagi kadar okuma yapar sonra (26. satirdaki paranteze kadar) daha sonra static method yazisina cikar(16.satir)
		// asagidan da 25.satirdan okulId 1203 oldugu icin burada 1203 yazdirir. 21. satira iner ve main method biter bu yuzden 
		// kod okuma biter yani 32 ve 33-+*. satirlar bosa yazilmis olur
		method();
		System.out.println("16.satir " + okulId + " " + okulAdi + " " + acikMi);
	}
	
	public static void staticMethod() {
		System.out.println("21.satir " + okulId + " " + okulAdi + " " + acikMi);
		okulId=1203;
		System.out.println("31.satir deneme " + okulId);
	}
	
	
	// static variable'lar class level'da olusturuldugu icin class'in her yerinden kullanilabilirler .
	// instance variable'lar static olmayan method'larda direkt kullanabiliyorken, static method'larda object olusturarak kullanilabilirdu.
	// Static variable'lar ise ister static isterse static olmayan tum method'lardan direkt kullanilabilir.
	
	public static void method() { // Method static degilse method call'da yazdiramayiz. Ama static olmayan method icine tanimlama yapabiliriz.
		okulId=1205;
		
	}
	
}
