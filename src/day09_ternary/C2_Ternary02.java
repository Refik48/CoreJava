package day09_ternary;

public class C2_Ternary02 {

	public static void main(String[] args) {


		int y = 1;
		int z = 1;
		int a = y<10 ? y++ : z++; // 
		
		System.out.println(y + "," + z + "," + a);
		System.out.println(y);
		System.out.println(y++); // Sonuc ekranina y'li halini yazdiriyor fakat aslinda +1 ekliyor diger satirda gozukuyor
		System.out.println(y);
		System.out.println(++y); // Once arttirip sonra sonuc ekranina veriyor
	}

}
