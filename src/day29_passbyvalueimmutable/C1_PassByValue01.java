package day29_passbyvalueimmutable;

public class C1_PassByValue01 {

	public static void main(String[] args) {
		// PassByValue ve PassByReference
		
		/*
		 * Soru : Verilen bir fiyat icin %10 indirim yapan bir method olusturun.
         * - Method’da indirim uygulanan fiyati yazdirin
         * - Method Call sonrasi original fiyati yazdirin ve method’da yapilan degisikligin
         *  orginal degeri degistirip degistirmedigini kontrol edin.
		 */

		double fiyat = 100; // Java methoda fiyat gonderirken orjinal fiyat'i gondermez kopyasini gonderir.
		
		indirimUygula(fiyat); // method call
		System.out.println("Method call sonrasi fiyat : " + fiyat);
	}

	public static void indirimUygula(double fiyat) { // Burada ki kopyasi olan fiyattir.
		
		fiyat = fiyat * 0.90; // 90
		
		System.out.println("%10 indirimli fiyat : " + fiyat*0.90); // 81
		System.out.println(fiyat-10); // 81
		
	}

}
