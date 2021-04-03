package day12_stringmanupalation;

import java.util.Scanner;

public class C6_LastIndexOf {

	public static void main(String[] args) {
		// lastIndexOf cumlede istedigimiz son harfin ya da kelimenin yerini gosterir.
		// Kullanicidan bir cumle alin ve asagidaki 3 durumdan uygun olani yazdirin
		// 1) cumle java icermiyor 
		// 2) cumle bir tane java iceriyor
		// 3) cumlede birden fazla java var
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz");
        String cumle = scan.nextLine().toLowerCase(); 
        
        int ilkJava=cumle.indexOf("java"); // bu ya -1 verecek ya da ilk java'nin indexini
        int sonJava=cumle.lastIndexOf("java"); // -1 ya da son java index'ini verecek
        
        if (ilkJava==-1) {
        	System.out.println("cumle java icermiyor");
        } else if(ilkJava==sonJava) {
        	System.out.println("cumle bir tane java iceriyor");
        } else System.out.println("cumle birden fazla java iceriyor");
        
        System.out.println(sonJava);
scan.close();	
	}
}
