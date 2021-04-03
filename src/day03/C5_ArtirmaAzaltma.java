package day03;

public class C5_ArtirmaAzaltma {

	public static void main(String[] args) {
		
		int num = 15; 
		
		int num2 = num + 2;
		
		System.out.println("num2= " + num2);
		System.out.println("num = " + num);
		
		num = num+5; // Basina int yazmadik cunku yukarda tanimladik bir daha tanimlamaya gerek yok .
	
		System.out.println("14. satirdan sonra num = " + num);
		
		System.out.println("18. satir num degeri: " + num+12); // +'nin sol tarafi yazi old. icin toplamak yerine yanina yazdi
		System.out.println(num+12);
		
		// Bir sayiyi artirmak icin (increment) o sayiya istedigimiz sayiyi ekler ve sonucu variable'a atariz
		// num'i 8 artir
		
		num = num+8;
		System.out.println("24.satir num degeri: " + num);
		
		// num'i 5 artir
		num +=5; 
		System.out.println("28. satir num: " + num);
		
		num2 +=5; // böyle yazmak daha pratik buna alis
		System.out.println("31. satirda num2: " + num2); // num2 yukarda 15+2 old. zaman 17 olmustu
		
		// sadece num'i 1 artirmak icin num++ yazmak yeter
		
		num++;
		System.out.println("Num'in son hali: " + num);
		
		
	}

}
