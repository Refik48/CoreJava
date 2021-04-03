package day37_overriding;

public class GeciciIsci extends Isci {
	
	public String calistigiBolum = "Yemekhane";
	
	public static void main(String[] args) {
		
		// Overriding : Bir child class'da parents class'dan miras alinan method'u degistirmeye overriding denir.
		// Parent class'daki method'u child class'da kullanilmamasi icin Parent class'la ayni isimli bir method olusturmaliyiz.
		// Ayni isimli bir method olusturdugumuz zaman Parent Class'inda ki methodu ERISILEMEZ, KULLANILAMAZ yapariz yani overriding olur.
		// Overriding gecersiz kilma demektir.
		
		GeciciIsci gi1 = new GeciciIsci();
		System.out.println(gi1.maasHesapla()); // Parent class'da ki public int maasHesapla() methodun'a ulasilamiyor.
		gi1.mesai(); // 2 tane sonuc ekrani verdi, 29.satira bak.
	}
	@Override
	public int maasHesapla() {
		
		return 30*8*10;  
	}
	
	// Source -> Override/Implement Methods -> Hangi method'u override edebilecegimizi secebiliyoruz. 
	// Sectikten sonra @override yazisi cikti buna annotation(dip not) diyoruz.
	 
	@Override // annotation // Isci'de parametre ekleyerek override'i bozmustum. Onu degistirdigim icin bu method hata vermeye basladi cunku
	// @Override yaziyor. Annotation sadece bir aciklama degildir, override yaptigimiz method'u surekli kontrol eder ve parent class'daki
	// Overriden method signature'i degistirilirse CTE 
	public void mesai() { // SUPER() DEGIL******SUPER.MESAI() BURASI COK ONEMLI BUNU UNUTMA.
		// super.mesai(); // Super'den dolayi parent class'ina gidip onu da yazdirdi ve buradaki methodu da yazdir okuyup syso'yu yazdirdi.
		System.out.println("Gecici isciler haftada 25 saat calisir");
		// Java 27. satirda kodu inceleyenler icin bir aciklama getiriyor.
		// Eger override edilen parent class'daki method'un (overriden,gecersiz kilinan) da calismasini istiyorsak ,
		// overriding method'a super().overridenMethodIsmi yazariz .
		// Eger method overriding method'un ilk satirina super() yazilmazsa overriden method calismaz.
	}
	
	

}
