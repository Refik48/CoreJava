package day30_datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class C4_DateTimeFormatter {

	public static void main(String[] args) {

		// Tarihi istedigimiz formatta yazmamizi saglar . Yani manipulation yapmamizi saglar.
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MMM/d"); // / ya da * koyabiliriz bize kalmis
		// Neden month buyuk M ile yazildi ? Cunku M=Month , m=minute.
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yy*MM*dd");
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("y$M$d");
		DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("y--MMMM--d");
		LocalDate tarih = LocalDate.now();
		
		System.out.println(dtf.format(tarih)); // 2021/Mar/19  
		System.out.println(dtf2.format(tarih)); // 21*03*19
		System.out.println(dtf3.format(tarih)); // 2021$3$19 
		System.out.println(dtf4.format(tarih)); // 2021--March--19
	}

}
