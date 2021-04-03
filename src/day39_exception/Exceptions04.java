package day39_exception;

import java.io.FileInputStream;
import java.io.IOException;

public class Exceptions04 {

	public static void main(String[] args) {
		/*
		 * Eger handle edilecek exception'lar arasinda parent child iliskisi varsa bu durumda child exception icin 
		 * catch blogu yazmasak da kodumuz calisir. 
		 * Child Exception'i silmenin pozitif yani : Tek catch blogu ile tum exception'lar handle edilebilir.
		 * Child Exception'i silmenin negatif yani : Bir sorunla karsilastigimizda bunun dosya bulunamadigi icin mi 
		 * yoksa dosya okunamadigi icin mi oldugu anlasilamaz.
		 * 
		 */
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\nihat\\eclipse-workspace\\winter2021turkish\\src\\day39_exception\\File");
            int k=0;
           
                while((k=fis.read())!=-1) {
                    System.out.print((char)k);
fis.close();                }
            
        } catch (IOException e) { // Bu butun exception'larin dedesi.
            
            
            System.out.println(e.getMessage());
        }
        System.out.println("");
        System.out.println("Kod bloke olmamisss");
   }

	}


