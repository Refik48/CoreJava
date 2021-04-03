package day23_statickeyword;

public class A00 {

	static int x=0;
	
	public void a() {
		x++;
	}
	
	
	
	public static void main(String[] args) {
		
	A00 obj1 = new A00();
	A00 obj2 = new A00();
	
	obj1.a();
	obj2.a();
	
	System.out.println(obj1.x);
	System.out.println(obj2.x);

	}

}
