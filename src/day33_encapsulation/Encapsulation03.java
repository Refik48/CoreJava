package day33_encapsulation;

public class Encapsulation03 {

	public static void main(String[] args) {
		
		// Encapsulation02 class'indaki class member'e ulasmaya calisalim.
		
		Encapsulation02 obj1 = new Encapsulation02();
		Encapsulation02 obj2 = new Encapsulation02();
		// obj1. yazdigim zaman private olanlar gozukmuyor, bekledigim sonuc bu idi private yaptigim icin .
		// Biz erisim yetkisini 2'ye ayiriyoruz.
		// 1- Okuyabilme
		// 2- Degistirip kullanabilme
		// Tcno'lar gizli olsun fakat bu variable'lari kullanabilsinler veya hesapNo degistirilmesin fakat kopyasini olusturup kullanabilsinler.
		// Acik kapi olusmuyor yetkiye kime ne kadar verecegine biz karar veriyoruz. 
		
		/*
		 * Encapsulation onemli Class uyelerini korumak icin uygulanan data saklama yontemidir. 
		 * Farkli Class'lardan erisilerek ya da yanlis kullanim sonucu kodunuzun veya onemli datalarinizin degismesini istemiyorsaniz Encapsulation
		 * ile datalarinizi koruyabilirsiniz.
		 * Encapsulation edilen variable ve method'lara sadece sizin verdiginiz oranda erisilebilir.
		 * Encapsule edilen variable ve method'lara izin verdiginiz kisiler ulassabilir ama DEGISTIREMEZ.
		 * Obje olusturularak deger atanip kullanilmasini istedigimiz ilk atadigimiz degerin (inicial, default) gorunmemesini istiyorsak setter() Method'u.
		 * Okul ismininin baska class'lardan okunmasini ama deger atanamamasini istiyorusak getter(); method'u olusturuyoruz.
		 * 
		 * Private'lar hangi class'da ise o class'a git. Sol ustten Source'e tikla , Generate Getters and Setters... yazisina tikladiktan sonra acilan
		 * pencerede private yaptiklarimizi gorebiliyoruz. Ismin solunda ki ok isaretine tiklayarak get ve set methodlarini gorebiliyoruz.
		 * Set veya get methodlarinin tiklarini isaretledikten sonra hemen altta INSERTION POINT kismi var . Orada nereden sonra olacagini secebiliyoruz
		 * ve get,set methodlarini bu pencerede Access Modifier kismini PUBLIC yapmak zorundayiz yoksa bir anlami yok. 
		 * 
		 */
		
		 obj1.sayi=25;
		 System.out.println(obj1.sayi); 
		 System.out.println(obj2.sayi); 
		 
		 // obj1. yazdigim zaman gene variable halinde gozukmuyor ama azicik alt tarafta getOkulIsmi veya setTcNo vs. seklinde gozukuyor 
		 // obj1.getOkulIsmi()="Nihat Koleji"; degistirmek istedigim zaman hata veriyor cunku get methodu yaptim ben bunu.		 
		 System.out.println(obj1.getOkulIsmi()); // Degistirmeye izin yok ama yazdirmaya izin var.
		 
		 // System.out.println(obj1.setHesapNo(hesapNo)); yazdiramiyorum cunku yazdirmaya izin yok 
		 // ama degistirmeye iznim var
		 obj1.setHesapNo(999999); // Parantez icin parametre olarak atama yapabilirim. Eger yazdirmak istersem Encapsulation02'de bunun oldugu 
		 // method'a giderek System.out.println(hesapNo); yazdigim zaman BU class'da calistirinca sonuc ekraninda yazdirir.
		 
		 /*
		  * Olayi toparlarsak; bir class icin class member olustururken bunu diger class'larla ne oranda paylasacagimiza karar veririz.
		  * 1 - Herkes okuyabilsin ve obje uzerinden deger atayip kullanabilsin -> Public
		  * 2 - Herkes okuyabilsin ama kimse obje uzerinden de olsa degistiremesin -> Private yaptiktan sonra Public GET METHOD'u olusturacagiz.
		  * 3 - Ilk atadigim degeri kimse goremesin -> Private yaptiktan sonra Public SET METHOD'u olusturacagiz.
		  * 2. ve 3.'su Encapsuplation'dir.
		  */
		 
		 
		 
	}

}
