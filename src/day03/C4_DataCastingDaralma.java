package day03;

public class C4_DataCastingDaralma {

	public static void main(String[] args) {
		// double bir degisken olusturalim ve bunu int ve sonra da byte'a cevirelim
		
		double numDouble = 131.56;
		
		int numInt = (int) numDouble; // int numInt = numDouble; bunu yazınca double'dan int'e ceviremiyorum diyor.numDouble'in sola (int) yazıyoruz
		System.out.println("Int degisken degeri: " + numInt);
		
		byte numByte = (byte) numInt;
		System.out.println("Byte degisken degeri: " + numByte);

		// Java ondalikli bolumu siler (15.99 bile olsa 15 olarak cikar)
		// 131.56 aldigimiz zaman byte -125 cikar, neden ? 
		// Cunku byte -128 ise 127 arasindadir, 127'den sonrasi için tekrardan basa döner ve -125 olur. (saat gibi dusun)
		// daha dar (narrow) bir data tipine cevirirken eger data tipinin sinirinden buyukse saymaya negatif en kucuk sayidan devam eder.
		// istenen sayiya gelince kadar tekrar tekrar en kucuk negatif sayiya gider.
	}

}
