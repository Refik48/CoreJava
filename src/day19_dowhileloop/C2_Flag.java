package day19_dowhileloop;

import java.util.Scanner;

public class C2_Flag {

	public static void main(String[] args) {
		// Kullanicidan bir cumle alin while loop kullanarak
		// cumlede buyuk harf var mi yok mu kontrol edin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir cumle yaziniz");
		String cumle = scan.next();
		String flag = "yok";
		
		int index=0;
		 while(index<cumle.length()) {
	            if (cumle.charAt(index)>='A' && cumle.charAt(index)<='Z' ) { 
	                flag="var";
	            }
	            index++;
	        }
	        System.out.println("verdiginiz cumlede buyuk harf " + flag);
scan.close();
  }
}
