package day0_soru;

class CURD {    }/* ****************************************** 6. SORU**************************

	public static void main(String[] args) {
		
		new C().create();
		new D().update();
		new R().read();
		new D().delete();
	}
}

Class C {
	public void create() { System.out.print("c"); }
}

Class U {
	private void update() {  System.out.print("u"); }
}

Class R extends C {
	public void create() { System.out.print("C"); }
	protected void read() { System.out.println("R"); }
}

Class D extends U {
	void update() { System.out.println("U"); }
	void delete() { System.out.println("D"); }
}
*/