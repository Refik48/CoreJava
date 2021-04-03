package day23_statickeyword;

public class Deneme {

	int x;
	static int y;
	
	Deneme (int i) {
		x+=i;
		y+=i;
	}

	public static void main(String[] args) {
		
		new Deneme(2); // Deneme cons.'ini calistiriyor . Atama yapilmamis adi yok .
		Deneme dnm = new Deneme(3); // Atama yapilmis adi dnm olan bir object. 
		
		System.out.println(dnm.x + "," +dnm.y); 

	}
}
