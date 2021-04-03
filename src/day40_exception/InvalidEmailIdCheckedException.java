package day40_exception;

public class InvalidEmailIdCheckedException extends Exception { // Child class yapmak zorunlu.
	// InvalidEmailIdCheckedException ustune gel ve add default serial version ID'yi sec .

	private static final long serialVersionUID = 1L; 
	// Bunu neden yaptim ? Java exception'larin tekrarsiz ve 

	// main'e gerek yok.
	
	// Class isminin sonunda Exception kulanilir. Bu mecburi degildir ama genel isim verme konsepti boyledir.
	// Bir "checked exception" olusturacaksak, class'imizi "Exception" Class'ina child class yapaliyiz.
	// String parametresi olan bir cons. olusturun 
	
	InvalidEmailIdCheckedException(String message) { // Message kismi bizim yazacagimiz mesajdir.
		super(message); // yazmasakta gozukmeyen bir super(); var fakat ben parametreli bir Super yaziyorum cunku message'i yazdirmak istiyorum.
		// Eger parametresiz olursa message'i yazdiramam..
		// Eger super(message); yazmasaydim, gizli super();'dan dolayi Java otomatik olarak null yazdirirdi. 
		
	}

}
