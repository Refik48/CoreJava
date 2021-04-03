package day43_interfaces;

public interface Interface02 {
	
	public default void deneme() {
		System.out.println("Default method calisti");
		// Method'u body ile yazinca hata veriyor secenekler : 
		// 1) Change deneme to default ------> Bu method icin icin bunu seciyoruz
		// 2) Change deneme to static
		// 3) Remove method body
		// *******Buradaki default ve static bizim her zaman bilip kullandigimiz default ve static DEGILDIR.
		
		/*
		 - Bizim bildigimiz default access modifier idi. Ama burada ki default method turudur.
		 - Bir method'da birden fazla access modifier olur mu ? OLMAZ 
		 - Bizim interface'de olusturdugumuz tum method'lar public ve abstract'tir.
		 - Interface'de default keyword kullanarak concrete method olusturabiliriz.
		 - Buradaki DEFAULT keyword'u access modifier degildir.
		 - Java'nin ozel bir cozumudur.
		 - Buradaki DEFAULT keyword yazildigi method'un Concrete oldugunu belirtir.
		 Cok mecburi durumlarda kullanilmak icin vardir %90 kullanilmayan bir seydir .
		*/
		 
	}
	// Yukarida default keyword'u icin yazilanlar burada ki static icinde gecerlidir.
	static void deneme2() {
		System.out.println("Static method calisti");
		// Method'u body ile yazinca hata veriyor secenekler : 
		// 1) Change deneme to default 
		// 2) Change deneme to static ------> Bu method icin icin bunu seciyoruz
		// 3) Remove method body
		// *******Buradaki default ve static bizim her zaman bilip kullandigimiz default ve static DEGILDIR.
		
		// Static ve default keyword'u kullanarak olusturdugumuz method'lar override edilmek ZORUNDA DEGILDIR.
	}

}
