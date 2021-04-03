package day21_scope;

public class Scope5 {

	public static void main(String[] args) {
		
		for (int i = 0; i<5; i++) {
			String isim = "Ayse";
			System.out.println(i + " " + isim);
		}

		
		// System.out.println(isim); // isim diye variable olusturdum fakat itiraz ediyor ayni method icinde olmama ragmen 
		// her ne kadar bir method icinde olsada loop'un icinde olusturulan degiskenler, loop'un disinda kullanilamaz, loop'a ozeldir.
		
		for (int i = 0; i<5; i++) {
			System.out.println(i + " ");
		}
		// System.out.println(i); en meshuru bu cunku i for'da yaziliyor fakat disarida yazdirilamiyor
		
		int count=0; // bu bir local variable 0'i silersek calismaz . Local variable'larin ilk atamasi olmak zorundadir.
		
		while(count<5) {
			System.out.println(count);
			count++;
		}
	}

}
