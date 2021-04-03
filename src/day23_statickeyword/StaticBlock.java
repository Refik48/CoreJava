package day23_statickeyword;

public class StaticBlock { // ******************************DIKKAT INTERVIEW'LARDA CIKABILIR*******************

	static String isim;
	// Static block class calistirildiginda ilk olarak calisir (main method'dan bile once)
	// Static block'lar static variable'lara gore 
	
	/*
	 * Static variable'lara deger atamsi yapmak icin kullanilir
	 * Static Block, class ilk calismaya baslandiginda calisir ve static variable'lara ilk deger atamasi yapar(initialize)
	 * Static Block'lar constructor'lardan tum method'lardan ve main method'lardan once calisir.
	 * Eger 1'den fazla static block varsa ustteki block daha once calisir.
	 */
	
	static {
		isim="Mehmet";
		System.out.println(isim);
	}
	
	static {
		System.out.println("2.static block calisti");	
		}
	
	public static void main(String[] args) {
		
		isim="Alican";
		System.out.println(isim);
		
	}
	
	static {
		System.out.println("Main method sonra yazilan static block calisti");	
		}
}
