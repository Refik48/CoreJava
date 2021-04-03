package day05;

public class C2_WrapperClass {

	public static void main(String[] args) {
		
		// wrapper Class : Java'nin primitive data turleri ile bazi methodlari kullanabilmemiz icin olusturdugu Classlar'dir.
		
		// bcb sil fd = boolean char byte short int long float double
		
		byte sayi1=10; // primitive'lerin bas harfi kucuktur . np'lerin buyuktur.
		Byte sayi2=11; // ismin primitive data turu olan np'lere "Wrapper" denir.
		
		System.out.println(sayi2);
		System.out.println(sayi1);
		
		Byte byteMinSayi = Byte.MIN_VALUE;
		System.out.println(byteMinSayi);
		
		Byte byteMaxSayi = Byte.MAX_VALUE;
		System.out.println(byteMaxSayi);
		
		// variable olusturmadan direk olarak shortun en kucuk ve en buyuk degerlerini yazalim
		
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		
		// integer veri turunun wrapper class'i INTEGER
		// int min max value ?
		
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		// Boolean , Character , Short , Integer , Long , Float , Double
				
	}

}
