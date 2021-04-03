package day14_methodcreation;

public class C2_MethodCreation2 {

	public static void main(String[] args) {
		// calistir tusuna bastigimizda java direk 6.satira gelir daha sonra sirayla asagi iner
		// Bir method'u calistirmak icin main method'un icinden cagirmamiz gerekir
		// Bir method'u cagirmak icin ise method adini ve parametrelere uygun argument'leri yazmaliyiz
		
		kucukHarfler('a','b');
		
		 ortalama(85.2,90.3); // ********************************************************************************************
		 
		 
		 // ortalama egik oldu cunku asagi da ben onu adi ortalama olan 2 parametli parametleri double olan methodu asagida
		 // tanimladim . Ben methodu cagirdigim zaman 85.2 ve 90.3 ile cagirdim . Asagida yazdigimiz sayi1'in onemi yok cunku java 
		 // kendisi 85.2'i sayi1'e atadi. Artik bundan Java nerede sayi1 gorurse sayi1 yerine 85.2 yazacak direkt olarak.
		
		// public = access modifier 
		// static = simdilik static olarak kalsin bu yapiyi bil daha sonra ayrintili gorecegiz
		// void = return type (en alta return yazmaya gerek yok . Cunku dondurdugu bir sonuc yok) . Sadece yazdirir
		// main = isim
		// ( ) parantezler olmazsa main olmaz
		// String [] args parametrelerdir. Data type'leri String basinda yaziyor. Ismi ise args 
		// { } body
		 int	sayi1 = 888;
			int	sayi2 = 943;
				System.out.println("Ort: " + (sayi1+sayi2));
	} // main method sonu
	
	public static void kucukHarfler(char harf1 , char harf2) {
		
	}

	// bir method olusturmak istedigimiz zaman Class'in icinde ama main method'un disinda bir alanda olusturmaliyiz
	// Genel kullanim method'lar main method'dan sonra olur.
	
	public static void ortalama(double sayi1, double sayi2)  {
	
		System.out.println("girdiginiz iki sayinin ortalamasi: " + (sayi1+sayi2)/2);
		// Bir methodu olusturmak o methodu calistirmak icin yeterli degildir.
		// Olusturulan method main method icinden cagirilinca calisir. (Yukarda ortalama olarak yazdim 10.satirda)
		
		sayi1= 888.12;
		sayi2 = 943;
		System.out.println("Ort: " + (sayi1+sayi2)/2);
			
		int sayi3 = 88;
		int sayi5 = 11;
		System.out.println("44.satir: " + (sayi3+sayi5));
		
	}

} // Class sonu
