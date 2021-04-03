package day30_datetime;

import java.time.LocalTime;
import java.time.ZoneId;

public class C2_LocalTime {

	public static void main(String[] args) {
		// Java'da saat ile islem yapmak icin LocalTime Class'indan obje kullaniriz
		// TIME'LARDA NEW KULLANMIYORUZ
		
		LocalTime saat = LocalTime.now(); // Esitligin sol tarafi Declaration . LocalTime bir saat olusturdum.
		System.out.println(saat); // 22:38:08.280
		
		for (int i = 0; i < 1000000; i++) {
			i+=1;			
		}
		
		LocalTime saat2 = LocalTime.now();
		System.out.println(saat2); // i'yi 1 milyon kez calistirip topladi ve 3 milisaniye'de yapti islemi gormek icin yazdik bunu
		
		System.out.println(saat.plusHours(15)); // 13:56:34.831 // 15 saat sonra , gunu vermiyor ama
		
		System.out.println(saat.getSecond()); // Saniyeyi gosteriyor
		
		System.out.println(saat.minusSeconds(18656142)); // Bu kadar saniye once saat kacti ? Gunu vermiyor ama
		
		System.out.println(saat.now(ZoneId.of("Japan"))); // Japonyada ki saat veriyor 05:00:35.8069
		
		System.out.println(saat.now(ZoneId.of("America/Chicago"))); // 15:05:29.314
 	} 
}
