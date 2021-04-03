package day32_stringbuilder;

import java.time.LocalTime;

public class C3_SB03 {

	public static void main(String[] args) {
		
		// 100.000 kere donecek bir loop yazalim , loop'da String ve SB kullanip ,
		// oncesinde ve sonrasinda zaman alalim hizlarini karsilastiralim
		
		String str = "";
		StringBuilder sb = new StringBuilder("");
		
		LocalTime lt1 = LocalTime.now();
		System.out.println(lt1);
		
		for (int i = 0; i < 10000; i++) { // 100.000'de 22 saniye suruyor . O yuzden 10.000'e cektim .
			str+=i;
		}
		
		LocalTime lt2 = LocalTime.now();
		System.out.println(lt2);
		
		LocalTime lt3 = LocalTime.now();
		System.out.println(lt3);
		
		for (int i = 0; i < 100000; i++) { // SB'de ise bir kac milisaniye surdu o yuzden HIZ ACISINDAN SB tercih ediyoruz.
			sb.append(i);
		}
		
		LocalTime lt4 = LocalTime.now();
		System.out.println(lt4);
		
	}

}
