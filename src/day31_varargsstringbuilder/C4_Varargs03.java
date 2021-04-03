package day31_varargsstringbuilder;

public class C4_Varargs03 {

	public static void main(String[] args) {
		
		toplama(2,5);
		toplama(5,10,15);
		toplama(4,5,9,7);
		toplama(5,6,8,10,45,78,-12);
		
	}
	
		public static void toplama(int sayi1, int sayi2, int...var) { 
			
			/* (int...var, int sayi) yazdik Java hata vermeye basladi ? Usttekki toplama methodcall'larda sikayet etmeye basladi neden ? 
			* Varargs icine butun int'leri alir . Zaten butun int'ler varargs icine alacagim daha neden yaziyorsun diyor.
			* O yuzden eger boyle bir sey yapilacaksa once int'ler daha sonra varargs yazilmalidir . Peki hangileri sol tarafa hangileri varargs
			* icine dahil olacak ? Methodcall'daki sayilardan ilkini ayri tutar geriye kalan sayilarin hepsini varargs'in icine atar.
			* Mesela yukarda 5 10 15 methodcall'unu dusunelim . int sayi = 5; , int...var= 10 , 15'i alir. (int sayi, int...var) icin.
			* 
			* Eger (int sayi1, int sayi2, int...var) olursa olur mu ? Evet olur bu sefer methodcall'larda ki ilk iki degeri alir digerlerini
			* varargs icine atar . Ornek olarak ; toplama(4,5,9,7); dusunelim . sayi1=4 sayi2=5 olur 9 ve 7 sayisini int...var icine atar
			*/ 
			 int toplam=0;
			    for (int each : var) {
			        toplam+=each;
			    }
			    System.out.println("varargs'a dahil olmayan argument: " + sayi1 + " " + sayi2);
			    System.out.println("varargs'a dahil olup toplanan degerlerin toplami : " + toplam);
			
		}
		
		
	

}
