package day42_abstractclasses;

public class IdariPersonelChildClass extends IdariPersonel {
	// Burada bir itiraz yok cunku benim parent class'imda concrect var . 
	// Grandparent class'inda abstract olmasi bir sey ifade etmez parent class'da biz onu duzelttik.

	public static void main(String[] args) {
		
		IdariPersonelChildClass obj1 = new IdariPersonelChildClass();
		obj1.maasHesapla(); // idari personel maas 4000 tl
		
		

	}

}
