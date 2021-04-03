package day40_exception;

public class Soru04 {

	public static void main(String[] args) {
		try {
			çalış();
		} catch (Exception e) {
			System.out.println(e.getMessage()); // getMessage aciklamasi : the detail mesage string of this Throwable instance(Which may be null)
		}
}
private static void çalış() {
	throw new RuntimeException(); // Parametre icerisine bir mesaj yazmak isek null degerini verir.
}
}