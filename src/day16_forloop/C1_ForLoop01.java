package day16_forloop;


import java.util.Scanner;

public class C1_ForLoop01 {

	public static void main(String[] args) {
		// Kullanicidan pozitif 2 tam sayi alin
		// aldigimiz degerlerden kucuk olandan baslayip buyuk olana kadar tum sayilari yanyana (virgulle ayirarak) yazdirin
		// Her dongu de bir sey yazdirmak istiyorsak For Body'sinin icine yazacagiz
		// Diyelim ki sayilarin toplami ile ilgileniyoruz yani sadece sonuc ile ilgileniyorsak For Body'sinin disina yazdiriyoruz ONEMLI BURASI

		Scanner scan = new Scanner(System.in);
		System.out.println("Pozitif 2 tam sayi giriniz");
		
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
	
		int kucukSayi=21893; // Buraya yazdigim degerin bir onemi yok cunku if icinde yeniden atama yapiyorum
		int buyukSayi=91290219; 
		
		if (sayi1<0 || sayi2<0) {
			System.out.println("Lutfen pozitif sayi giriniz");
		} else if (sayi1>sayi2) {
			buyukSayi=sayi1;
			kucukSayi=sayi2;
		} else {
		    buyukSayi=sayi2;
		    kucukSayi=sayi1;
		} 
		// baslangic sarti	/ bitis sarti / artis azalis
		for (int i=kucukSayi; i<= buyukSayi; i++) { // i=kucukSayi; yazan yer baslangic
			System.out.print(i + " , ");            // i<= buyukSayi; yazan yer bitis kosulu
		}                                           // i++ kacar kacar artacagini yazar
			/* 0 yazmamasi icin ilk if yerine, syso'ya ternary ile bir tarafa
sayi1<0 || sayi2<0 "pozitif yaz" yapsam 0'dan kurtulur muyum 
diger tarafa da i + " , " yazsam*/ // dene	
scan.close();	}
	
}
/*Scanner scan=new Scanner(System.in);
        System.out.println("iki farkli pozitif tamsayi giriniz");
        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();
        if (sayi1<0||sayi2<0){
            System.out.print("lutfen pozitif tamsayi giriniz");
        }
        if (sayi1==sayi2){
            System.out.println("lutfen 2 farkli pozitif tamsayi giriniz");
        }
        else if (sayi1>sayi2){
        for (int i=sayi2; i<=sayi1; i++){
            System.out.print(i+",");}
        } else {
            for (int i=sayi1; i<=sayi2;i++)
            System.out.print(i+",");
        }
    }
}*/ // Baska cozum incele
