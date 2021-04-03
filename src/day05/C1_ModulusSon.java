package day05;

public class C1_ModulusSon {

	public static void main(String[] args) {
		// verilen (programda olan ya da bizim yazdigimiz bir sayi) bir integer'in birler basamagindeki sayi ?
		
		int sayi = 1469;
		
		System.out.println("Verilen sayinin birler basamagi: " + sayi%10);
		
		// verilen sayinin bir basamagi haric geriye kalan basamaklarini yazdirin
		
		System.out.println(sayi/10);
		
		// sayi/10 ile sayi/=10 arasindaki fark nedir ?
				
		System.out.println(sayi/=10); // bunu yazdiktan sonra sayi degeri kalici olarak degisir cunku "=" işareti var.
	    System.out.println(sayi/10);  // burada sadece sonuc ekranini degistirecek mat islemi yaptik
        
	    
	}

}
