package day22_constructor;

public class A00 {

	String isim = "Emily";
	int yas = 20; 
	
	
	public static void main(String[] args) {
		
		A00 obje1 = new A00();
		
		obje1.isim="Oliver";
		obje1.yas=25;
		
		System.out.print(obje1.isim);
		System.out.print(","+obje1.yas);

	}

}
