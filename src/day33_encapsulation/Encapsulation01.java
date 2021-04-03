package day33_encapsulation;

import day20_scope.Scope1;
import day21_scope.Scope6;

public class Encapsulation01 {

	public static void main(String[] args) {
		/*
		 * OOP Concept
		 * Object Oriented Programing
		 * Bir proje kapsamindaki class'larda olusturulan variable ve method'larin baska class'larda tekrar tekrar yazilmamasi
		 * var oldugu class'dan uretilerek bu variable ve methodlarin istendigi kadar kullanilmasidir. (teknik karsiligi resuability 
		 * yeniden yeniden kullanilabilmek anlamindadir)
		 * Write Once Run Everywehere
		 */
		
		// Scope 6 class'indaki ve methodlara ulasmak istiyorum bunun icin Scope6 class'indan obje uretmeliyiz.
		
		Scope6 obj1 = new Scope6(); // Boyle yazinca obje urettik fakat sikayet etmeye devam ediyor cunku Scanner ve diger obje olusumlarinda
		                           // yaptigimiz gibi import etmeliyiz baska package'den kullandigimiz icin.
		// obj1. yazica scope6'da ki name ve num1 gozukmuyor . Cunku Scope6'da onlarin access modifier'i yazilmadigi icin default'tur 
		// ve default olunca sadece o package icin kullanilir . Baslarina o class'a gidip basina PUBLIC yazinca baska package'lerde de kullanilabilir
		// bkz : public int num1;   ///   public String name = "Ali";
		// Esitligin sol tarafi declaration . Declaration 2 parcadir ilk parca Data Turu, 
		// ikinci kisim isim np'ler icin data turu ayni zamanda class ismi olabilir.
		// Esitligin saginda ise deger, 2 parcada olusur ilk parcasi new keyword'u , ikincisi ise constructor.
		// Hangi class'dan obje uretmek istersek o class'in cond.'ini kullaniriz.
		
		obj1.name = "Kazim Nihat";
		System.out.println(obj1.name);
		obj1.num1=10;
		System.out.println(obj1.num1);
		
		obj1.add(); // Java run time'dir, obj1'in oldugu Class'a gitti ve "add" adinda ki methodu calistirdi ve o methodun icinde olanlari yazdirdi..
		
		// deneme method'unu main method icinden cagirabilir miyiz ? 
		// deneme(); cagiramiyorum cunku static degil. 
		// Eger cagirmam gerekiyorsa obje olusturmam gereklidir (Static degilse, Static ise zaten 35.satirda yaptigim gibi yaparim). 
		// Bunun yerine icinde oldugumuz class'dan bir obje uretip onun uzerinden static olmayan method'lari da cagirabiliriz.
		
		Encapsulation01 obj3 = new Encapsulation01();
		obj3.deneme(); // obj3 uzerinden deneme method'u calisir . 
		
	}
	
	public void deneme() {
		// Projemiz kapsaminda bulunan tum Class'lardan public variable ve method'lara istedigim yerden obje ureterek ulasabilirim.
		// Eger ulasmak istedigim class uyeleri(class member) public degilse baska package'lerden ulasmak icin extra islem yapmamiz gerekir.
		// Class Member(Uye) = bir class icerisinden olan class seviyesinde ki instance variable'lar,static variable'lar ve class methodlaridir.
		Scope1 obj2 = new Scope1(); // Day20'deScope1 var, Day21'de de var hangisinden cagiracagimizi import ederken seciyoruz.
		obj2.isim="Stewie";
		obj2.soyisim="Griffin";
		obj2.sayi=25;
		obj2.method(); 
		
		// Ben istedigim class'dan obje uretip oradaki public class uyelerine ulasabilirim.
	}

}
