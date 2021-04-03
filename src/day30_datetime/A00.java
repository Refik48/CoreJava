package day30_datetime;

import java.util.Scanner;

public class A00 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Please enter a password : ");
		String password=scan.nextLine();
		
		while(password.equals(false)) {
		if(1<=password.length() && password.length()<8) {
			System.out.println("Please enter a password of at least 8 characters.");
		}else if(!password.contains("[a-z]")){
			System.out.println("Please enter a password with lowercase letters.");
			
		}else if(!password.contains("[A-Z]")) {
			System.out.println("Please enter a password with uppercase letters.");
		}else if(!password.contains("[]"));
	
	}
		System.out.println("Your password has been accepted");
	}

}
