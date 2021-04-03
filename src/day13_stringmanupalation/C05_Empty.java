package day13_stringmanupalation;

public class C05_Empty {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		// isEmpty = bos mu sorusunu sorar		
		String str = "";
		System.out.println(str.isEmpty());
		
		String str2=null;
		System.out.println(str2.isEmpty()); // RTE verir
		// Null bir deger degildir sadece str3'un hic bir seye esit olmadigini gosteren POINTER'dir.
 	}
}
