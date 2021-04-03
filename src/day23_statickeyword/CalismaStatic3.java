package day23_statickeyword;

public class CalismaStatic3 {
	static int x;
	int y;
	
	CalismaStatic3(){
		x+=2;
		y++;
	}
	static int getSquare() {
		return x * x;
	}
	
	
	public static void main(String[] args) {
		CalismaStatic3 sm1 = new CalismaStatic3();
		
		CalismaStatic3 sm2 = new CalismaStatic3();
		
		int z = sm1.getSquare();
		
		System.out.println("-x" + z + "-y" + sm2.y);

	}

}