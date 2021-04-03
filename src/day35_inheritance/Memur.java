package day35_inheritance;

public class Memur extends Personel {

	public int maas;
	
	public Memur() {
		// super();
		System.out.println("Child class parametresiz cons. calisti");
	}
	
	public Memur(int maas) {
		super();
		System.out.println("Child class parametreli cons. calisti"); //Once super'i okudugu icin gittigi cons. icindekileri yazdi sonra bunu yazdi.
		
	}

	public static void main(String[] args) {
		
		// Memur obj1 = new Memur();
		// Ilk main method calisir. obj1'i okur ve esitligin sag tarafinda parametresiz 
		// constructor'i gorur. Constructor'i gordugu icin oraya okuma yapmaya gider.
		// super();'i okur okudugu icin bu keyword parent class'daki parametresiz constructor'a goturdu ve
		// sonuc ekraninda Personel parametresiz constructor calisti yazdirdi.
		// Inheritance'da constructor olusturdugumuzda java'nin otomatik olarak constructor'a koydugu super(); keyword onemlidir.
		// Eger super(); yazisi olmasaydi gene calisirdi(Satir8) cunku super(); keyword DEFAULT CONSTRUCTOR gibidir, biz gormesekte calisir.
		// Ancak yerine baska bir keyword yazarsak etkisiz hale gelir.
		// **** Extends varsa yerine bir sey yazmadikca super(); calisir...******
		Memur obj2 = new Memur(2400);
		/*
		 * Ilk main method calisti, sonra obj2'i okudu. Esitligin sag tarafinda const. var o yuzden parametreli Const.'i okumak icin 
		 * 12.satira gitti ve orayi okumaya basladi. Bunun icinde super(); parametresiz oldugu icin 
		 */
		
		/*
		 * Bir class'da constructor calistirdigimizda once parent class'daki cons. calisir. 
		 * Cunku her constructor'in ilk satirinda super(); keyword vardir(gorunmese bile). 
		 * super();'i manuel'de yazsak yazmasakda ilk satir disinda baska bir yerde olamaz. O yuzden once super okunur ve onunla uygun olan 
		 * baska cons.'a gidilir daha sonra syso veya diger islemler yapilir.
		 * 
		 * Eger parent(Super) class'da super() ile calistirdiginiz constructor yoksa Java CTE verir.
		 * super(); parent class'dan costructor cagirmak icin, this(); icinde olunan class'da baska bir cons. cagirmak icin kullanilir. 
		 */
	}

	
	
	

}
