package day22_constructor;

public class Car { // Sahibinden gibi satis programi yapiyoruz gibi dusunelim
	
	String marka; // Ben bunu Static yaparsam eger / Yeni marka atadigimda butun markalarin degeri degisir o yuzden Static kullanmiyoruz.
	String model;
	int yil;
	boolean kazasiVarMi;	

	
	public static void main(String[] args) {
	
		Car car1 = new Car(); /* data turu(car) / variable ismi(car1) / asigment isareti (=)
		 * Bir object olusturuldugunda esitligin saginda mutlaka Constructor kullanilir.
		 * Constructor ismi class ismi ile ayni olmalidir.
		 * Constructor mutlaka () olmalidir. / Car()
		 * Constructor'da parametre olmasi istege baglidir.
		 */
		
		System.out.println(car1.marka + " " + car1.model + " " + car1.yil + " " + car1.kazasiVarMi); // null null 0 false
		
		car1.marka="Ford";
		car1.model="Mustang";
		car1.yil=2019;
		car1.kazasiVarMi=false;
		System.out.println(car1.marka + " " + car1.model + " " + car1.yil + " " + car1.kazasiVarMi); // Ford Mustang 2019 false
		
		
		Car car2 = new Car();
		
		car2.marka="Opel";
		car2.model="Astra";
		car2.yil=2015;
		car2.kazasiVarMi=true;
		System.out.println(car2.marka + " " + car2.model + " " + car2.yil + " " + car2.kazasiVarMi); // Opel Astra 2015 true
		System.out.println(car1.marka + " " + car1.model + " " + car1.yil + " " + car1.kazasiVarMi); // For Mustang 2019 false
		
	}

}
