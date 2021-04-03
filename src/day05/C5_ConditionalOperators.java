package day05;

public class C5_ConditionalOperators {

	public static void main(String[] args) {
		
		// AND && , OR ||   , && (hepsinin ya dogru ya da yanlis olmasi lazim) , || (bir tanesi dogru ise sonuc True , False icin hepsi yanlis olmali)
		
		boolean isTrue = 5>4 && 7-3>0 ; // True
		System.out.println(isTrue);
		
		boolean isTrue2 = 5>4 && 7-3<0; // False
		System.out.println(isTrue2);
		
		boolean isTrue3 = (5>4) ;
        System.out.println(isTrue3);	
		
		boolean isTrue4 = (5<4 || 7-3<0);
		System.out.println(isTrue4);
		
		System.out.println(5<4 || 7-3>0);
		
		int x=10;
		int y=5;
		System.out.println(x/y==2 && x*y>20 && x-y>0); // Hepsi True old. icin True
		System.out.println(x+y<0 && x-y>0); // False
		System.out.println(x<y || x+y<0 || x*y>0);
		
		System.out.println(2 + 3 <= 5); // >= veya <= yazim sekli boyledir. '=' isaretini once koyma.
		System.out.println((2+3)==5);   // 2+3=5 yazilmasi sonucu error verir, mantiksal sorular icin == kullanilir
		System.out.println(2+4 == 6 || 'a'<'c'); // Tek '=' olursa hata verir mantiksal ifadelerde == kullanilir, UNUTMA!
	}
}
