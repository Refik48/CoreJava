package day31_varargsstringbuilder;

public class C3_Varargs02 {

	public static void main(String[] args) {
		// Istedigimiz kadar sayi girdigimizde tum sayilari toplayan bir method yazalim
		// Var--- variety cesitlilik args--- arguments 
		
		toplama(2,5);
		toplama(5,10,15);
		toplama(4,5,9,7);
		toplama(5,6,8,10,45,78,-12);
		

	}

	public static void toplama(int...var) {// burada ki "var" int'in ismi isteedigimizi koyariz, istersek var yazariz istersek ali,a,x, okul vs.
		// data turunden sonra yazdigimiz ... varags kullanacagimiz anlamina gelir
		// her bir elemani tek tek cagiracagimiz icin foreachloop kullanacagiz
		
		int toplam=0;
		for (int each : var) { // var'a git her bir int'i bana getir
			toplam+=each;
		}
		System.out.println("Toplam : " + toplam);
		
	}

}
