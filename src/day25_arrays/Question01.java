package day25_arrays;
import java.util.Arrays;
import java.util.Scanner;
public class Question01 {

		    public static void main(String[] args) {
		    	
		       // Kullanicidan kac kelime girecegini isteyin daha sonra kelimeleri alarak Array'e cevirin
		    	
		    	Scanner scan = new Scanner (System.in);
		    	System.out.println("Kac kelime gireceginizi belirtin");
		    	
		    	int uzunluk = scan.nextInt();
		    	
		    	String arr [] = new String[uzunluk];
		    	
		    	System.out.println("Kelimeleri giriniz");
		    	
		    	for (int i=0; i<arr.length; i++) {
		    		
		    		arr[i]=scan.next(); // NextLine yapmadik cunku kelimeyi degil direkt olarak cumleyi alirdi indexlere.
		    		
		    	}
		    	
		    	// NextLine Kullanicinin girdigi butun cumleyi alir
		    	// Next Kullanicinin giridigi cumlenin ilk bosluguna kadar ki yeri alir
		    	
		    	System.out.println(Arrays.toString(arr));
		    	
	scan.close();	    }
		    
		}