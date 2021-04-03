package day22_constructor;

public class ParametreliRunner {

	public static void main(String[] args) {
		
		ParametreliCons oto1 = new ParametreliCons();
		System.out.println(oto1.marka + " " + oto1.model + " " + oto1.yil + " " + oto1.kazasiVarMi); // Default verir

		ParametreliCons oto2 = new ParametreliCons(2015); // itiraz etmiyor (2015) yazinca cunku //1'de int parametresi olusturdum
		System.out.println(oto2.marka + " " + oto2.model + " " + oto2.yil + " " + oto2.kazasiVarMi); 
		// null null 0 false yazdirdir , null null 2015 false yazdirmadi Cunku;
		// yukarda ki ayni sekilde idi gene default yazdirdi //1'in int olmasi bununla baglantisi yok yani
		
		/* 2015'i //1'e yolladi .(Runner Class'inda 10.Satir argumenti). 
		* //1'in icine int yil; argument olan yila esit olsun diye kod yazmamiz lazim.
		* this.yil=yil; seklinde yazarsak default degeri yerine parametre degeri verir
		*/
		
		ParametreliCons oto3 = new ParametreliCons("Toyota", "Corolla", 2010, true);
		System.out.println(oto3.marka + " " + oto3.model + " " + oto3.yil + " " + oto3.kazasiVarMi); 
		// ParametreliCons'da esitledim method icinde bunlar o yuzden default degerleri vermiyor.
	}
}
