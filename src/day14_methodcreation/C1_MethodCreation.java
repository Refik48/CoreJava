package day14_methodcreation;

public class C1_MethodCreation {

	public static void main(String[] args) {


		String str = "Java cok guzel";
	    // 1) Java methodlarin sadece ismine degil, isim + parametre'lere de bakar. 
		// str.index yazdigimi 4 cesit index cesidi cikiyor , cikanlarin sonunda parantez icinde 
		// bir seyler yaziyor (String str, int fromIndex) (2 tane var mesela) bunlar parametreleri oluyor
		
		
		str.endsWith("el"); // bu method'un gorevi gidip kelimenin son kismini kontrol etmek
		                    // bu methodud'u kullanmak icin bu method'un kontrol ettikten sonra bana rapor olarak ne getirdigini 
		                    // bilmem lazim (true/false)
		System.out.println(str.endsWith("el"));
		
		// 2) Bir method olusturdugumuzda method'un ne yapacagina ve gorevi yaptiktan sonra bana ne dondurecegine bastan karar vermeliyiz
		
		// 3) Bir method olusturulurken "str.indexOf(String str, int fromIndex)"de oldugu gibi disaridan kabul edecegi parametleri 
		// ve bu parametlerin data tiplerini declare etmeliyiz
		
		// Methodu calistirmak istedigimde (Method'u cagirmak) Parametre olarak declare edilen data tiplerine uygun degerler girmeliyiz
		// girilen bu parametlere ARGUMENT denir.
		
		str.indexOf("va", 1);
	}
}