package day16_forloop;

public class C4_ForLoop04 {

	public static void main(String[] args) {
		// 50'den buyuk 150'den kucuk olan tam sayilardan 7 ile tam bolunebilenleri toplayin
		
int toplam=0;
		
		for (int i=50; i<=150; i++) {
			if (i%7==0) {
				toplam +=i;
				System.out.println("Bolunen sayilar " + i + " Toplamlari ise " + toplam);
			} 
		} 
		
		
		
		
		
		/*
		int toplam = 0;
		
		for (int i=56; i<=150; i+=7) {
			toplam+=i;
	 
	}	System.out.println(toplam);
		// Hocanin cozumu
		int x=0;
		for (int i = 51; i<150; i++) {
			
		if (i%7==0) {
			x+=i;
		}
	}
		System.out.println(x);*/
	}
}
