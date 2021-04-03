package day02;

import java.util.Scanner;

public class C1_Scanner {

	public static void main(String[] args) {
		
		// scanner ile kullanıcadan bilgi alabiliriz
		// 3 adimla scanner islemini gerceklestiriyoruz
		
		//1. adim scanner objesi olusturmak
		
		Scanner scan = new Scanner(System.in);
		// -Javada ne zaman new kelimesini gorseniz,
		// yeni bir object oluşturuluyor demektir.
		// -Parantez icine yazilan degerlere paratmetre denir
		// ve scanner icin System.in yazmamız gerekiyor.
		// -java.util java kutuphanesidir
		// -scan olusturdugumuz scanner objesine verdiğimiz isimdir
		// farkli isimler de verebiliriz ancak scan ismi 
		// tüm programcilar tarafindan kullanilan bir isimdir
		// kodumuzun anlasabilir ve rahat okunabilir olmasi icin 
		// scan ismini kullanmamiz tavsiye edilir
		
		// 2. adim kullaniciya bir mesaj yazin
		
		System.out.println("Karenin bir kenar uzunlugunu girin");

		// -3. adim kullanicinin konsola girdigi degeri programimiza alacaz
		// ve bir variable olusturup atayacagiz
		// -kullanicidan bir kenar uzunlugu istedigim icin 
		// herhangi bir sayi girebilir (tam,virgül)
		// o yüzden en toleranslı olan double'dir.
		
		double kenar=scan.nextDouble();
		
		System.out.println("Girdiginiz Kenar Uzunluguna Sahip Karenin Alani= "+kenar*kenar);
		
		// calistir de , degeri gir , enter'e tikla
		scan.close();	
	}
}
