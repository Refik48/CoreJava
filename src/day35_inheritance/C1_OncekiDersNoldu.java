package day35_inheritance;

public class C1_OncekiDersNoldu {

	public static void main(String[] args) {
		/*
		 * Inheritance : OOP consept'in onemli bir karakteridir. Child class'in hic bir extra islem yapmadan parent class'lardaki 
		 * class uyelerine ulasabilmesini saglar.
		 * 
		 * Parent class'daki private class uyeleri inherit edilemez default olanlar ise sadece ayni package icinden inherit edilebilirler.
		 * Publi ve protected icin sorunsuz calisir.
		 * Static class uyeler inherit edilemez.
		 * 
		 * Inheritance child(sub) class'dan parent (super) class'a dogru olur . Child parent'in her seyini inherit edebilir ama 
		 * parent child'dan inherit edemez.
		 * Genel ozellikler parent class'da, spesifik ozellikler child class'da olusturulurlar.
		 * 
		 * Faydalari : 
		 * a) Reusability
		 * b) Kolay maintanance
		 * c) Az kodla cok is yapma
		 * d) Tekrarlari engelleme
		 * 
		 * Inheritance'a proje olusturulurken karar verilir.
		 */
		//BURASI YENI DERS*********************************************************************//////////////////////////////////////////
		/* Inheritance Cesitleri ;
		 * 1) Single Inheritance :
		 * Java single heritance kabul eder. Bir child class'in sadece bir tane parent class'i olabilir.
		 * Bir class'a 2 kez extends yapamayiz . BIR COCUGUN BIR AILESI OLUR.2 ayri parents'a extends edemem.
		 * Java multiple inheritance KABUL ETMEZ. 
		 * 
		 * 2) Hierarchical Inheritance : 
		 * Birden fazla class ayni class'i parent olarak kullanabilir. BIR AILENIN BIRDEN FAZLA COCUGU OLABILIR. 
		 * 
		 * 3) Multilevel Inheritance : 
		 * Java Inheritance zincirini kabul eder. Bir child class'in sadece bir tane parent class'i olabilir.
		 * Insanlarda ki soyagaci gibi, child class'in parent'i ve grandparent'leri olabilir.
		 * 
		 * java.lang.Object Class : 
		 * Java'da butun class'lar Object Class'dan inherit ederler. Object Class butun class'larin parent'idir ve 
		 * Object Class parent'i olmayan tek class'dir.
		 * 
		 */
		
		/*
		 * child ->IS A parent
         * parent ->HAS A child
		 */

	}

}
