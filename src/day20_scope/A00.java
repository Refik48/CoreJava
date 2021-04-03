package day20_scope;

import java.util.Scanner;

public class A00 {
	
	public static void main(String[] args) {
		
		int x =1;
		int y =1;
		int z =0;
		if (x==y || x<y++) {
			z=x+y;
		} else {
			z=1;
		}
		System.out.println(z);
		System.out.println(3|4);
	}

	
}