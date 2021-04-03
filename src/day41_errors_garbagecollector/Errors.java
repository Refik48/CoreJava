package day41_errors_garbagecollector;

public class Errors {

	public static void main(String[] args) {
		
		// System.out.println(20/0);
		// String str = asd; // Cte'dir cunkuc cift tirnak tamamlamadikca kod calismaz bu tur yazimdan kaynaklanan hatalar kolayca duzeltilebilir
		// Java'da Error dendiginde onune gecilemeyen, kod ile cozulemeyen sistemden kaynakli buyuk hatalar kastedilir.
		// Error'lar unchecked'dir ve Java bunlari ongoremez ancak gerceklestiginde kodun calismasi durdurulur.
		
		/* PARANTEZDEN CIKARIP CALISTIRMA 1 MILYON KEZ CALISIR . SENIN PC KOTU ZATEN AMAN DIYIM BASINA BIR IS GELMESIN SONRA..
		String str =""; Birinin islemcisi 101 dereceye cikti sen hic bulasma :D
		for(int i=0; i<10000000; i++) {
			str+=i;
		}
		*/
		/*
		 * Error "throwable" class'inin bir alt class'idir. Errors sistem kaynaklarinin eksikligi nedeniyle ortaya cikan kritik kosullardir,
		 * ve yazacagimiz kodlarla handle edilemezler.
		 * Java error'im olusumu hakkinda herhangi bir bilgiye sahip olmadigi icin hatalar her zaman unchecked'dirler.
		 * Errors her zaman (DEVAMINI YAZAMADIM SLAYTTAN AL)
		 * 
		 * Error’lar handle edilemezler.
		 * 2) Programin anormal bir sekilde sonlanmasina sebep olurlar.
		 * 3) Error’lar unchecked’dir ve genellikle run time’da olusurlar.
		 * 4) Error’lara ornek; Out of Memory Error, Stack over flow error veya System Crash Error
		 * 
		 * finalize() method Garbage Collector tarafindan imha edilmesi gereken datalar imha edilmeden once calistirilir.
		 * Garbage collector sadece finalized yapilmis objeleri toplar ve yokeder.
		 * Biz kod yazarken finalize() method’unu cagirsak da finalize() method’unun ne zaman calisacagina ve ne yapacagina Java karar verir.
		 * 
		 * Garbage Collector : Garbage Collector heap alaninda calisan ve heap alaninda new operatoru vb. methodlarla olusturulan ve referansi olmayan
		 * nesneleri heap alanindan temizleyen mekanizmanin adidir. Garbage Collector islimini 3 adimda tamamlar.
		 * 1) Isaretle : Kullanilan ve kullanilmayan nesneler isaretlenir.
		 * 2) Silme : Referans olmayan nesneleri heap alanindan temizler.
		 * 3) Sıkıştırma ve Silme : Silme islemine ek olarak daha buyuk nesnelere bos alan olusturmak icin kalan nesneleri bir araya getirir.
		 * 
		 */

	}

}
