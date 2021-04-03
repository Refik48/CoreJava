package day05;

public class C4_OperatorsSign {

	public static void main(String[] args) {
		
		// = atama(assignment) demektir
		
		int sayi1=5;
		int sayi2=4;
		
		boolean isGreat = sayi1>sayi2;
		System.out.println(isGreat);
		
		boolean isSmall = sayi1<=sayi2;
		System.out.println(isSmall);
		
		boolean isEqual = sayi1==sayi2; // == mantiksal ifadelerde kullanilir, mat.deki esittir isaretinin yerine gecer.
		System.out.println(isEqual);    // == Comparison(karsilastirma) operatoru olarak isimlendirilir.
		
		System.out.println(sayi1==5); // syso'nun icinde sayi 1 5'e esit midir diye sorduk .
		
		// != esit degil midir sorusunu sorar
		// ! isareti olumsuz hale getirir (tersine cevirir) !< (kucuk degildir)
		
		System.out.println(sayi1+sayi2 != 9); // 5+4 = 9 esit degil midir diye soruyor esittir o yuzden false
		System.out.println(sayi1-sayi2 !=0);  // 5-4 = 1 esit degil midir diye soruyor esit degildir o yuzden true
		
	}

}
