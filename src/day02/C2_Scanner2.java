package day02;

import java.util.Scanner;

public class C2_Scanner2 {

	public static void main(String[] args) {
		
// kullanicidan dairenin yaricapini isteyin ve alanini yazin
		
	Scanner scan = new Scanner(System.in);
	System.out.println("Alan Hesabi Icin Daire Alani Girin");
	double yaricap = scan.nextDouble();
	
	System.out.println("dairenin alani= " + 3.14*yaricap*yaricap);

	scan.close();
	
	}

}
