package day13_stringmanupalation;

import java.util.Scanner;

public class C12_Examples3 {

	public static void main(String[] args) {
		/*Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi yazdirin
		  isim-soyisim : M***** B*******
		  kart no : **** **** **** 1234
        */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Lutfen ilk isminizi giriniz");
		String isim = scan.next();
		
		System.out.println("Lutfen soyisminizi giriniz");
		String soyisim = scan.next();
		
		System.out.println("Lutfen kart numaranizi bosluk olmadan giriniz");
		String kartNo = scan.next(); // Numarasini strgin aldik cunku manipulation etme olasiligimiz daha yuksek
		
		char isimIlkHarf = isim.toUpperCase().charAt(0);
		String isimGeriKalan = isim.substring(1).replaceAll("\\w", "*");
		String soyisimIlkHarf = soyisim.toUpperCase().substring(0, 1);
		String soyisimGeriyeKalan = soyisim.substring(1).replaceAll("\\w","*");
		String kartNoBasi = "**** **** **** "; // kart no'lar sabit old. icin basini direk yildizlarini biz yazdik
		String kartNoSonu = kartNo.substring(kartNo.length()-4);
		
		System.out.println("Isminiz ve Soyisminiz: " + isimIlkHarf + isimGeriKalan + soyisimIlkHarf + soyisimGeriyeKalan);
		System.err.println("Kart Numaraniz: " + kartNoBasi + kartNoSonu);
		
scan.close();	}
}


