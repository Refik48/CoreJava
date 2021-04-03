package day06_ifstatements;

import java.util.Scanner;

public class C7_IfStatement7 {

	public static void main(String[] args){ // Ogrencinin notuna gore harf derecesini belirleyin .
		  Scanner scan = new Scanner(System.in);
	        
	        System.out.println("Please enter your grade.");
	        
	        double grade1 = scan.nextDouble();
	        
	        if (grade1>= 84.5 && grade1<=100) {
	            System.out.println("Your grade equals to AA");
	        }
	        
	        if (grade1<=84.4 && grade1>=69.5) {
	            System.out.println("Your grade equals to BB");
	        }
	        
	        if (grade1<=69.4 && grade1>=54.5) {
	            System.out.println("Your grade equals to CC");
	            
	        }
	        
	        if (grade1>=44.5 && grade1<=54.4) {
	        
	        System.out.println("Your grade equals to DC");    
	        }
	    
	        if (grade1>=0 && grade1<=44.4) {
	        
	        System.out.println("Your grade is : FF . Please retake the exam.");
	        
	    
	        scan.close();
	        
	    }
	    
	    }
	


	}

