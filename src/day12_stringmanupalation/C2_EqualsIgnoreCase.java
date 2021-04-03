package day12_stringmanupalation;

public class C2_EqualsIgnoreCase {

	public static void main(String[] args) {
		// equalsIgnoreCase() method'u karsilastirdigi String'lere case sensitive (buyuk kucuk harf duyarliligi) olmaksizin bakar.
		// String'ler ayni ise True ayni degilse False doner.
		
		String str1 = "Ali Can";
		String str2 = "ali CAN";
		String str3 = "ALI CAN";
		System.out.println(str1.equals(str2)); // False buyuk kucuk harf duyarlidir, bosluga da duyarlidir.
		System.out.println(str1.equalsIgnoreCase(str2));

		System.out.println(str1.equalsIgnoreCase(str2) && str2.equalsIgnoreCase(str3)); // 3 tanesini boyle karsilastirabiliriz.
		
	}

}
