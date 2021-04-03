package day34_inheritance;

public class Isci extends Muhasebe {

	public static void main(String[] args) {
		
		Isci isci1 = new Isci(); // Muhasebe class'indakileri kullanabilmek icin obje olusturdum.
		// Muhasebede : saatUcreti, statu, maas var. 
		// Muhasebe'de Personelin child classi oldugu icin oradakileri de kullanabiliyorum
		// Personelde : isim, soyisim, id, izindeMi var.
		
		isci1.isim="Kazim Nihat";
		isci1.soyisim="Tekiner";
		isci1.id=376;
		isci1.izindeMi=false;
		isci1.saatUcreti=25;
		isci1.statu="Muhendis";
		isci1.maas=isci1.maasHesapla(); // Sadece bilgi yazmak istiyorum o yuzden boyle yazdim.
		
		System.out.println(isci1.id + " " + isci1.isim + " " + isci1.soyisim + " " + isci1.statu + " " + isci1.maas + " TL");
		
		// Bu derse kadar hangi class'dan bilgi elde etmek istiyorsak o class'dan obje olusturuyorduk. 
		// Inheritance ile bu mecburiyet ortadan kalkti .
		// Childe Class'da olusturdugumuz obje ile tum parent class'larda bulunan variable ve method'lari inherit edebilirim.
		
		// Bir obje daha olusturmak icin usttekini copy paste yapip degistirmek 
		
		Isci isci2 = new Isci(); 
		isci2.isim="Stewie";
		isci2.soyisim="Griffin";
		isci2.id=837;
		isci2.izindeMi=true;
		isci2.saatUcreti=15;
		isci2.statu="Tercuman";
		isci2.maas=isci2.maasHesapla();
		System.out.println(isci2.id + " " + isci2.isim + " " + isci2.soyisim + " " + isci2.statu + " " + isci2.maas + " TL");

	}

}
