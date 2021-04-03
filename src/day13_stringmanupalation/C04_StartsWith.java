package day13_stringmanupalation;

public class C04_StartsWith {

	public static void main(String[] args) {
		// Yazilan seyin onla baslayip baslamadigini sorgular
		
		String str = "Calisirsaniz java kolay";
		System.out.println(str.startsWith("C"));
		System.out.println(str.startsWith("c"));
		System.out.println(str.startsWith("Calisi"));
		System.out.println(str.startsWith("s",4));
		System.out.println(str.startsWith("java",14));

	}

}
