package day34_inheritance;

public class EncapsulationRunner {

	public static void main(String[] args) {
		
		Encapsulation obj1 = new Encapsulation();
		System.out.println(obj1.getOkulIsmi());
		System.out.println(obj1.getOkulHesapNo());
		System.out.println(obj1.isOkulAcikMi());
		
		 obj1.setOkulIsmi("Uludag Koleji"); // Dedigimiz zaman parantez icine String bir sey yazmami istiyor ve bana bir sey dondurmuyor.
		 System.out.println(obj1.getOkulIsmi()); 
		 Encapsulation obj2 = new Encapsulation();
		 System.out.println(obj2.getOkulIsmi());
		 // Obj1 icin yapilan degisiklikler obj2'yi baglamaz.
		 
		 /*
		  * Encapsulation adinda bir class'im var. 7. satirda bir obje olusturdum obj1 adinda, Java hemen gider obj1 adindaki variable'lari
		  * oraya yerlestirir.
		  */
		 
	}

}
