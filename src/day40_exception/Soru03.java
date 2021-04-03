package day40_exception;

public class Soru03 {

	public static void main(String[] args) {

		System.out.print(exceptions()); // nethod call

	}

	@SuppressWarnings("finally")
	public static String exceptions() {
		String result = "";
		String v = null; // bir deger degildir NullPointerException var unutma.

		try {
			try {
				result = result + "a"; // result = "a" oldu
				v.length(); // Bu satir NullPointerException verir ve kod burada calismayi durdurur ve bu try body'sinde geriye kalanlar calismaz.
				result = result + "b"; // Calismadi bir ust satirdan dolayi
			} catch (NullPointerException e) { // NullPointerException aldigi icin burasi calisir ,
				result = result + "c"; // result = "ac" oldu.
			} finally { // Her turlu calisir burasi.
				result = result + "d"; // result = "acd" oldu.
				throw new Exception(); // Yeni exc. firlatacak , try body'sinde exception ariyorduk hemen catch body'sine gecek. 
				// Eger burasi olmasaydi altta catch blogu icinde Exception'i yakalayamacakti ve e'yi yazdirmayacakti.
			}
		} catch (Exception e) { // Exception'i yakaladik ,
			result = result + "e"; // result = "acde" oldu.
		}
		return result;
	}
}
