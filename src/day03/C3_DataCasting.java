package day03;

public class C3_DataCasting {

	public static void main(String[] args) {
		// byte veri turunde bir degisken olusturup deger atayalim 
		// olusturulan variable'i adim adim AUTO WIDENING ile genisletip yazdirin
		// Auto Widening sadece primitive ve sayilar arasinda olur
		
		byte numByte = 34;
		
		System.out.println("Byte degisken degeri: " + numByte); // +'nin solu yazi ise yazi seklinde cikar, deger ise toplar
		
		// short yapalim
		short numShort = numByte; // Short > Byte old. icin java sikayet etmiyor, Auto Widening ile degeri short variable'a atiyor
		System.out.println("Short degisken degeri: " + numShort);
		
		//int yapalim
		int numInt = numShort;
		System.out.println("Integer degisken degeri: " + numInt);
		
		// float yapalim
		float numFloat = numInt;
		System.out.println("Float degisken degeri: " + numFloat);
		
		// double yapalim
		double numDouble = numFloat;
		System.out.println("Double degisken degeri: " + numDouble);
	}

}
