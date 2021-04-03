package day21_scope;

public class Scope3 {

	public static void main(String[] args) {
		System.out.println(Scope1.okulAdi); // Yildiz Koleji
		System.out.println(Scope1.okulId); // 1201
		Scope1.main(args);
		System.out.println(Scope1.okulId);
		
		
	}
}
