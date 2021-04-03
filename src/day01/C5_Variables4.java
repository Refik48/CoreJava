package day01;

public class C5_Variables4 {

	public static void main(String[] args) {
		
		int sayi1=10;
		int sayi2=4;
		double sayi3=4;
		
		System.out.println(sayi1/sayi2); 
		
		System.out.println(sayi1/sayi3); // int / double = double verir
		
		System.out.println(sayi3/sayi1); // double / int = double verir
		
		
		int sayi4='2'; // Tırnak içinde ise ASCII tablosunda ki değeri verir
		System.out.println(sayi4);
		
		System.out.println(sayi4/sayi3); // double verir
		
	}

}
