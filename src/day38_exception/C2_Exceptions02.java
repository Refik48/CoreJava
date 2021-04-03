package day38_exception;

public class C2_Exceptions02 {

	public static void main(String[] args) {
		
		// try catch blogundaki e'nin gorevi
		
		int sayi1 = 10;
		int sayi2 = 0;
		
		C1_Exceptions01 exp = new C1_Exceptions01(); // Esitligin solundaki C1_Exceptions01 hem Class adi hem de exp objesi icin data turu.
		
		try {
			System.out.println(sayi1/sayi2);
		} catch (ArithmeticException e) {
			// ArithmeticException Java'da bir class ve e objesi icin data turu. e ise ArithmeticException class'indan olusturdugumuz objenin adi.
			// O zaman ismi e olmak zorunda degil ama genel kullanim e seklindedir. 
			System.out.println(e);
			// System.out.println(e); ile hem Java'ya sorunu yazmasi icin firsat vermis oluyoruz hem de aplication'i bloke etmemis oluruz.
			
			System.out.println(e.getMessage()); // / by zero , hatanin neden kaynaklandigini yazdiriyor.
			
			e.printStackTrace(); // java.lang.ArithmeticException: / by zero
			                     // at day38_exception.C2_Exceptions02.main(C2_Exceptions02.java:15) hatanin tamamini verir.
			                     // Bu yazdirma biraz daha mantikli cunku programi calistiran biri (teknik ekipten), 
			                     // bu hatayi alirsa hatanin sebebi ve hangi class'da old. yazdiriyoruz
			                     // ve bu try-catch yolu ile kod bloke olmaz kod durmaz, sonuc ekranina hata verdirir ve calismaya devam eder.
			
			System.out.println("Kod bloke olmamisss");

		}
		
		
		
		/* Class ArithmeticException
		 * java.lang.Object
             java.lang.Throwable
               java.lang.Exception
                 java.lang.RuntimeException
                    java.lang.ArithmeticException
		 */
		

	}

}
