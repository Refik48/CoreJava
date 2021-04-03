package day03;

public class C7_PreIncrementPostIncrement {

	public static void main(String[] args) {
		
		int num = 20;
		
		num++;
		
		System.out.println(num);  // 21
		
		System.out.println(num++); // 21(num++); boyle yazinca sonuc ekraninda artmis gozukmez ama kendi icinde artirmis olur. (Post Increment)

		System.out.println(num); // 22 Kendi icinde yazdirdigi icin burada 22 oluyor.
		
		System.out.println(++num); // 23 + işareti solda olunca önce artırır sonra ekrana verir yani 23 olur (Pre Increment)
		
		System.out.println(num); // 23 zaten artirmisti o yüzden 23 olur
		
		int a = 15;
		int b = ++a;
		System.out.println(b);
		int c = a++ ;
		System.out.println(c);
		
	}

}
