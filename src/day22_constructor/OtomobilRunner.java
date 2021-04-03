package day22_constructor;

public class OtomobilRunner {
	 
	public static void main(String[] args) {
		
		Otomobil oto1 = new Otomobil();
		oto1.vites("otomatik");
		oto1.renk="mavi";
		
		Otomobil oto2 = new Otomobil("Kirmizi");
		System.out.println(oto2.renk);
		
		
		

	}

}
