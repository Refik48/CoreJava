package day10_switchcase;

public class C8_StrManipulation01 {

	public static void main(String[] args) {
		// Str np data turudur
		// np data turleri value ile birlikte methodlara sahiptirler
		// methodlari kullanarak String'i degistirmeye StrManipulation deniyor
		String str = "Hello World";
		
		System.out.println(str.toUpperCase()); // HELLO WORLD
		
		System.out.println(str); // Hello World yazar cunku = ile bir atama yapmadik !!
		
		String str2 = str.toUpperCase(); // str'i belli bir islem icin manipule ettik baska ve str2'e atadik .
		
		System.out.println(str); // str gene ilk basta ki gibi kaldi
		System.out.println(str2); // HELLO WORLD
		
		int y = 2;

		int z = 0;

		int a=z>=0 ? ++y : z--;

		System.out.println(y + "," + z + "," + a); // 3 0 3
		System.out.println(y); // 3
		int b = ++y;
		System.out.println(b); // 4 
		System.out.println(y); // 4
		int c = y++ ;
		System.out.println(c); // 4
		System.out.println(y); // 5
		int d = y; 
		System.out.println(d); // 5
		System.out.println(y); // 5
		
	}

}
