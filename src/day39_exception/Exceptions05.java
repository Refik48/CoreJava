package day39_exception;

public class Exceptions05 {

	public static void main(String[] args) {
		
		/*
		 * 2 cesit exception vardir .
		 * 1) Compile Time (Checked) Exceptions :
		 *  Kod yazildiginda Java'nin ongordugu olasi sorunlardir. Java olasi bir problem gordugunde kirmizi cizgi ile uyarir.
		 *  Not : Her kirmizi cizgi exception degildir. FileNotException 
		 * 2) RunTime (Unchecked) Exceptions : 
		 *  Kod calistirildiginda ortaya cikan exception’lardir. 
		 */
		
		// null olarak tanimlanmis bir obje ile uygun olmayan bir islem yapmaya 
		// calistiginizda Java NullPointerException verir. Unchecked exception'dir. 
		// NullPointerException run time exception’dir.
		
		String str1 = " ";
		String str2 = "";
		String str3 = null; // null bir deger degildir sadece str3'un hic bir seye esit olmadigini soyleyen bir isaretcidir(pointer)
		
		System.out.println(str1.length()); // 1
		System.out.println(str2.length()); // 0
		System.out.println(str3.length()); // NullPointerException
		System.out.println(str3 + "bos"); // nullbos yazdirir, boyle hata vermez 
		System.out.println(str3.concat("bos ")); // Gene hata verir null ile herhangi bir method'u calistiramayiz.
		

	}

}
