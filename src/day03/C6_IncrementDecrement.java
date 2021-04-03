package day03;

public class C6_IncrementDecrement {

	public static void main(String[] args) {
		
		int number = 10;
		// bir variable degerini toplayarak artirmak icin 3 yontem vardir
		
		// 1) Yontem (acemi yontemi)
		number = number + 5;
		
		// 2) Yontem (usta yontemi)
		number +=8;
		
		// 3) Sadece 1 artirmak icin num++ (sadece toplama ve cikarma icin gecerli
		number++;
		
		// number'i 6 eksiltin
	    number -=6;
	    
	    //number'i 2'ye bolelim
	    number /=2;
	    
	    // number'i 3 ile carpin
	    number *=3;
	    
	    // number'i 1 eksiltmek istersek
	    number--;
	    
	    System.out.println(number);
	    				
	}

}
