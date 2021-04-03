package day42_abstractclasses;

public abstract class YanHizmetler extends Personel {
	
	// Abstract bir class'in abstract child'ini olusturursak, abstract methodlari implement etmek zorunda olmayiz.
	// Java bilir ki bu child son class degil, mutlaka bu child'in concrete child class'i olacak

	public static void main(String[] args) {
		
		// YanHizmetler obj1 = new YanHizmetler(); // Cannot instantiate the type YanHizmetler 
		// Abstract bir class'dan obje uretilemez.
		// Obje somut bir seydir ve hatada diyor ki sen absract class'i somutlastiramazsin diyor.

	}

}
