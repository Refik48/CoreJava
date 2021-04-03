package day30_datetime;

import java.time.LocalDateTime;

public class C3_LocalDateTime {

	public static void main(String[] args) {
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt); // 2021-03-19T23:06:49.526
		
		System.out.println(ldt.toString()); // 2021-03-19T23:07:09.845
		
		String time = ldt.toString(); // ldt'yi String'e atadim . Boylece string methodlari ile kullanabilecegim. String manipulation yapabiliriz.
		
		System.out.println(time.startsWith("2021")); // True cunku time 2021 ile basliyor.

	}

}
