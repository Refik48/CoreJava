package day42_abstractclasses;

public abstract class Personel { 
	
	// Bir class'i abstract yapmak icin class keyword'unden once abstract yazmak yeterlidir.
	
	// Abstract bir class'in icinde variable olabilir mi ? Evet olabilir .
	public String isim = "Nihat";
	public String job;
	
	// Variable'lar abstract olur mu ? Olamaz.
	// public abstract int sayi = 10; Illegal modifier hatasi
	
	// Abstract Class'in tum concrete child'lari abstract class'daki 
	// tum dinamik ozellikleri (yani methodlari) override etmek zorundadir.
	
	// Bir method abstract olur mu ve nasil yapilir ?
	public abstract void maasHesapla(); // Normalde bir method'da body olmasi lazim fakat abstract methodlarin body'si OLMAZ.
	public abstract void mesaiBilgisi();
	// Bir abstract class'da concrete method yazilabilir mi ?
	// Bir abstract class'da abstract ve concrete method'lar olabilir.
	// Arada ki fark nedir ?
	// Concrete child class'lar abstract method'lari override ETMEK ZORUNDADIR ama concrete methodlari override etmek istege baglidir.*****ONEMLI*****
	 public void ozelSigorta() {
         System.out.println("Bu personel ozel sigorta kapsamindadir");
     }
	
	
	
}
