package day33_encapsulation;

public class Encapsulation02 {
	
	private String tcNo = "12345678901";
	private int hesapNo = 5554321;
	// Obje olusturularak deger atanip kullanilmasini istedigimiz ilk atadigimiz degerin (inicial, default) gorunmemesini istiyorsak setter() Method'u.
	private String okulIsmi = "Ahtapot Koleji";
	// Okul ismininin baska class'lardan okunmasini ama deger atanamamasini istiyorusak getter(); METHOD'u olusturuyoruz.
	public int sayi = 100;
	
	public static void main(String[] args) {
		// Eger ulasmak istedigim class uyeleri(class member) public degilse baska package'lerden ulasmak icin extra islem yapmamiz gerekir.
		// Class Member(Uye) = bir class icerisinden olan class seviyesinde ki instance variable'lar,static variable'lar ve class methodlaridir.
		
		// Yapabilecegimiz islemlerden 1.si Encapsulation'dir. Ingiliccesi Data Hiding'dir. Bilgi saklama,Kapsulleme anlamindadir .
		// Bu class'da kimseyle paylasmak istemedigimiz variable ve methodlar olusturalim . (5. satir) .
		// Sayilardan da olussa da matematiksel islem yapmacayacagimiz seyler String veya SB build ile korumamiz daha iyidir . 
		
		// Private yapinca guvenlik konusunu halletmis olduk, ancak yeni bir problem ile karsi karsiyayiz. Class uyelerinin private olmasi
		// OOP konsepte aykiridir. Cunku her sey private olursa ben nasil OOP consept yacapgim ? Her class private olursa o zaman OOP consept olmaz .
		
		// Encasaplucation class'imizda olusturudugumuz class uyelerine kimlerin ne oranda ulasabilecegini belirleme icin yapilir.
		// Encapsulation03 class'ini olusturdum suan.
		
	}
	
	/* Private'lar hangi class'da ise o class'a git. Sol ustten Source'e tikla , Generate Getters and Setters... yazisina tikladiktan sonra acilan
	 * pencerede private yaptiklarimizi gorebiliyoruz. Ismin solunda ki ok isaretine tiklayarak get ve set methodlarini gorebiliyoruz.
	 * Set veya get methodlarinin tiklarini isaretledikten sonra hemen altta INSERTION POINT kismi var . Orada nereden sonra olacagini secebiliyoruz
	 * ve get,set methodlarini bu pencerede Access Modifier kismini PUBLIC yapmak zorundayiz yoksa bir anlami yok. 
	 */
	private void denemeMethod() {
		System.out.println("Deneme Methodu calisti 20.satir");
	}

	public String getOkulIsmi() {
		return okulIsmi;
	}

	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}

	public void setHesapNo(int hesapNo) {
		this.hesapNo = hesapNo;
		System.out.println(hesapNo);
	}

}
