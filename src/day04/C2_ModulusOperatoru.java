package day04;

public class C2_ModulusOperatoru {

	public static void main(String[] args) {
		
		// Modulus operatoru bolme isleminde kalani verir (isareti : %)
		// 15 Tek midir cift midir ? 15/2 kalan=1 tektir
		int a = 15 % 2; 
		System.out.println(a);
		
		//25 3'e bolunur mu ? 25/3 kalan=1 
		int b = 25 % 3;
		System.out.println(b);
		
		// 856 sayisinin birler basamagi kactir ?
		
		int sayi=856;
		
		int birlerBasamagi = sayi % 10;
		System.out.println("Sayinin birler basamagi: " + birlerBasamagi);
		
		// 856 sayisinin onlar basamagi kactir ?
		sayi/=10;
		System.out.println("On'a bolduktan sonra sayi degeri: " + sayi); // sayi 10'a bolundugu icin artık sayimiz 85 oldu .
		
		int onlarBasamagi= sayi % 10;
		System.out.println("Onlar basamagi: " + onlarBasamagi);
		
		// 856 yuzler basamagi ? Ayni islemi tekrarliyoruz
		sayi/=10;
		System.out.println("Ikinci defa On'a boldukten sonra: " + sayi);
		
		int yuzlerBasamagi=sayi;
		System.out.println("Yuzler basamagi: " + yuzlerBasamagi);

	}

}
