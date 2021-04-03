package day30_datetime;

import java.time.LocalDate;

public class C1_LocalDate01 {

	public static void main(String[] args) {
		// Java'da sadece tarih kullanmak istiyorsak Local Date Class'indan bir obje uretiriz
		// TARIH OLUSTURURKEN ""NEW"" KELIMESINI KULLANMIYORUZ******************************************************
		
		LocalDate tarih = LocalDate.now();
		System.out.println(tarih); // 20221-03-19
		
		System.out.println(tarih.plusWeeks(20)); // 2021-08-06 / 20 hafta sonra tarih kac olur ?
		System.out.println(tarih.plusDays(500)); // 2022-08-01 / 500 gun sonra tarih kac olur ?
		System.out.println(tarih.plusYears(3).plusMonths(5).plusDays(12)); // 2024-08-31 3 yil 5 ay 12 gun sonra tarih ne olur ?
		
		// plus toplama , minus cikartma
		
		System.out.println(tarih.minusMonths(15)); // 2019-12-19 // 15 ay once tarih ne idi ?
		System.out.println(tarih.minusYears(3).minusMonths(4).minusDays(10)); // 207-11-09 3 yil 4 ay 10 gun once ne idi
		
		System.out.println(tarih.getDayOfYear()); // 78 Bugun yilin 78. gunu
		System.out.println(tarih.getMonthValue()); // integer olarak hangi ay'da oldugumuzu soyler. 
		System.out.println(tarih.getDayOfWeek()); // Friday 
		LocalDate dogumGunu = LocalDate.of(1996, 8, 6);
		System.out.println(dogumGunu.getDayOfWeek()); // TUESDAY / Dogdumuz gunu yazdirdi.
		
		System.out.println(tarih.getMonth()); // MARCH / Hangi ay'da oldugumuzu verdi.
		
		System.out.println(tarih.isLeapYear()); // false artik yili sordurtuyoruz.
		
		LocalDate tarih1 = LocalDate.of(1995, 12, 15); // Eger suan ki tarih ile degil de eski bir tarih ile islem yapacaksak
		LocalDate tarih2 = LocalDate.of(1995, 12, 10); // LocalDate.of(); methodunu kullaniyoruz
		// mesela 2 insanin yasini karsilastirmak icin kullanican alip buralara yerlestirebiliriz.
		
		System.out.println(tarih1.isAfter(tarih2)); // True , tarih1 tarih2'den sonra mi
		System.out.println(tarih1.isBefore(tarih2)); // False , tarih2 tarih1'den sonra mi
		

	}

}
