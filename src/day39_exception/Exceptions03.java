package day39_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions03 {

	public static void main(String[] args) {
		
		/* Ic ice try catch yerine bir tane try ve mulltiple catch blogu kullanabiliriz. 
		 * Bu iki satiri siliyorum(17 ve 24) ancak bu durumda yazdigimiz exceptionlar arasinda Parent-Child iliskisi varsa 
		 * once child class'i yazmaliyiz aksi takdirde (yani once parent yazilirsa) child'e is kalmaz, java erisilemez catch-blogu diyerek CTE verir.
		 * Once child exception yaz sonra parent exception yazalim sikayet ortadan kalkar. (FileNotFoundException ile IOException yerini degistirelim)
		 */
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\nihat\\eclipse-workspace\\winter2021turkish\\src\\day39_exception\\File");
            int k=0;
            // try { bu iki satiri siliyorum(17 ve 24)
                while((k=fis.read())!=-1) {
                    System.out.print((char)k);
                }
            } catch (FileNotFoundException e) { // ONCE CHILD EXCEPTION
                
                e.printStackTrace();
          //  } bu iki satiri siliyorum(17 ve 24)
        } catch (IOException e) { // SONRA PARENT EXCEPTION boylece hata ortadan kalkar.
            
            
            System.out.println(e.getMessage());
        }
        System.out.println("");
        System.out.println("Kod bloke olmamisss");
    }

}
