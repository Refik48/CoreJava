package day31_varargsstringbuilder;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class C1_DateTimeFormatter {

	public static void main(String[] args) {
		
		/*
		 * yy : yilin son iki rakamini verir
		 * yyyy : yilin tamamini verir
		 * M : Ay sirasini verir , mart icin : 3
		 * MM : Ay sirasini verir, mart icin : 03
		 * MMM : Ay isminin ilk 3 harfini verir : Mar
		 * MMMM : Ay isminin tamamini verir.
		 */
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt); // 2021-03-20T17:10:30.327
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yy/MMMM/dd hh:mm"); // yearyear MONTHx4 dayday hourshours:minuteminute 
				// DateTimeFormatter. koyduktan sonra bir suru secenek cikiyor ofPattern'i seciyoruz
		System.out.println(dtf.format(ldt)); // 21/March/20 05:15
		
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yy/MMM/dd"); 
		System.out.println(dtf2.format(ldt)); // 21/Mar/20
		
		
		System.out.println(ldt); // bu print'i 10 bin asagi sonra yazsakta salise farki olmayacak cunku yukarda bunu yapinca onu hafizaya atti
		// ve burada ekrana verdi eger satirlar arasi salise veya zamani olceceksek yeni bir tane daha ldt olusturmamiz lazim.
		
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("HH:mm");
		DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("hh:mm");
		System.out.println(dtf3.format(ldt)); // 17:24
		System.out.println(dtf4.format(ldt)); // 05:24
		
		LocalDate dogumTarihi = LocalDate.of(1996, 8, 6);
		LocalDate bugun = LocalDate.now();
		
		Period benimYasim = Period.between(dogumTarihi, bugun); 
		System.out.println(benimYasim);
		int yas = Period.between(dogumTarihi, bugun).getMonths(); // Yil ounca sorun yok ama Months ve Days'de baska degerler veriyor yeniden dinle
		System.out.println(yas);
		
	}

}
