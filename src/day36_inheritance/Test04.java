package day36_inheritance;

class Derived04 {
	
	String name = "Kaan";
	int yas = 99;
	
	protected void getDetails() {
		System.out.println("Derived Class");
	}
}

public class Test04 extends Derived04 { 
	
	String name = "Ali";
	int yas = 2;
	
	protected final void getDetails() {
		System.out.println("Test Class");
	}
	
	public static void main(String[] args) {
		
		Test04 obj = new Test04();
		obj.getDetails();
		
		System.out.println(obj.name);

	}

}
