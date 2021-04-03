package day23_statickeyword;

public class CalismaStatic1 {
			
	int x =3;
	int y=5;
	
	CalismaStatic1() { // x=3 / y=5
		x+=1; // x=4
		System.out.println("-x" + x);  // -x4 
	}
	
	CalismaStatic1(int i) { // i = 3 
		this();
		
		this.y=i; // y=3
		x+=y;  // 4+3 = 7 // x=7
		System.out.println("-x" + x); // -x7
	}
	CalismaStatic1(int i,int i2) { // i =4 // i2=3
		this(3); 
		
		this.x -=4; // 7 - 4 = 3 // 
		System.out.println("-x" + x); // -x3
	}
	public static void main(String[] args) {
		CalismaStatic1 a = new CalismaStatic1(4,3);
	}
	
		}