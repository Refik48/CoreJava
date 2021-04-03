package day43_interfaces;

public class InterfaceRunner implements Interface02 {

	public static void main(String[] args) {
		
		// Static olarak tanimlanmis bir variable veya method baska class'dan,
		// classIsmi.methodIsmi seklinde cagirilabilir.
		
		Interface02.deneme2(); // Calisti cunku STATIC .
		
		// Default keyword'u ile olusturdugumuz method ise obje uzerinden cagrilabilir.
		
		InterfaceRunner obj = new InterfaceRunner();
		// obj. koydugum zaman deneme method'u yok , neden ? Cunku inheritance yok. Hemen implements Interface02 yazdik yukari.
		obj.deneme();

	}

}
