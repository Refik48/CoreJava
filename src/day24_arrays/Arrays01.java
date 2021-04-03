package day24_arrays;

import java.util.Arrays;

public class Arrays01 {
	
	public static void main(String[] args) {
		
		int sayi = 10;
		int sayi2 = 20;
		int sayi3 = 30;
		String isim = "Ali";
		System.out.println(isim);
		
		// Javada birden fazla elemani koyabilecegimiz (store) object'ler vardir. Bugun bunlardan ilkini ogrenecegiz.
		
		int arr [] = {1085,204,1}; // int [] arr seklinde de kullanilabilir. // Ayni cins data type  yazilir zaten basinda belirtiyoruz
		// Bu ornekte Array'in elemanlarini direkt yazdigim icin uzunluk(lenght) belirtmeme gerek kalmadi.
		// Bu ornekte max eleman sayisi (length) yazdigimiz eleman sayisidir.
		
		System.out.println(arr.length); // 3
		System.out.println(arr);
		// Array bir object'dir. Heap(huge) depolamasinin icindedir. Icinde 10 20 30 degerleri vardir.
		// Bunun steak(small) depolama icinde ki karsiligi random bir referanstir.
		// Direkt olarak System.out.println(arr); boyle yazdirmak istersek [I@e2d56bf bu vb. sekilde bir sonuc verir.
		// Ayri ayri yazdirmak icin
		
		System.out.println(Arrays.toString(arr)); // [10, 20, 30] virgullerden sonra bosluk var Java guzel gozuksun diye kendi olusturuyor.
		
		String takim [] = new String[3]; // Bu sekilde yazidigimizda takim isimli array'in length belirlemis olduk. Object old. icin new
		System.out.println(Arrays.toString(takim)); // Hic bir deger atamadigim icin String'in default degerini yazdirir (null)
		// null, null, null
		// 0 1 2 
		takim[0]="Ali"; // Hangi indexe ne atarsak onu yazdirir.
		System.out.println(Arrays.toString(takim)); // Ali, null, null
		takim[2]="Hasan";
		takim[1]="Veli";
		System.out.println(Arrays.toString(takim)); // Ali, Veli, Hasan
		// takim[3]="Mehmet"; // Burada 4. icin yer yok ama yazdirinca hata vermedi neden ? Java Run Time bir programdir,Java programi calistirinca
		// olusturulur ve hata verir. 
		
		// Array'daki bir elemani update etme, velinin yerine nihat gelsin;
		takim[1]="Nihat";
		System.out.println(Arrays.toString(takim));
		
		// Array uzunlugunu bulmak icin 
		System.out.println(takim.length); // 3 burada () yok . String'lerde vardi.
		System.out.println(takim.length-1);
		
		// Array'deki son eleman Kazim olsun
		takim[2] = "Kazim"; // 3 , 0 1 2
		System.out.println(Arrays.toString(takim));
		// Son elemani boyle atamak dogru degil (normalde dogru cunku burasi 3 elemanli ama bunun dusuk sayida olacagini garantisi yok baska bir yerde
		// daha cok uzunlukta bir Arrays olabilir) . Bunun yerine soyle yapmaliyiz ;
		
		takim[takim.length-1]="Hayri";
		System.out.println(Arrays.toString(takim));
		
		// a b c d e // 5+1/2 = 3 (Normalde matematikte boyle)
		// 0 1 2 3 4 // 5-1/2 = 2 (Java da boyle kullanmak zorundayiz)
		
		// Ortaki elemani Zuhtu yapalim diye dusunursek tekli sayilarda ortada bir eleman olur, fakat cift elemanli ise tam ortada 2 deger olur.
		// O yuzden Array'in eleman sayisi tek ise ortadaki elemani degistirmek icin;
		// a b c d e  // x+1/2   normal matematik  
		// 0 1 2 3 4  // x-1/2   javada boyle   
		if (takim.length%2==1) {
			int ortaEleman = (takim.length -1)/2; // orta sayi bulmak icin normalde 3 + 1 / 2 = dedigimizde ortanca sayinin degerini veriyordu
			takim[ortaEleman]="Zuhtu";            // burada ise -1 yazdik cunku burada 1'den degil 0'dan basliyor index saymaya.
	
		} 
		System.out.println(Arrays.toString(takim));
	}
}
