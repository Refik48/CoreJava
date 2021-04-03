package day19_dowhileloop;

import java.util.Scanner;

public class A01 {

	public static void main(String[] args) {
		
	
		String specialCharactersString = "!@#$%&*()'+,-./:;<=>?[]^_`{|}";
		Scanner scan=new Scanner(System.in);
		System.out.print("Please enter a password : ");
		while (true) {
			String password = scan.nextLine();
			if (password != null) {
				if (password.length() < 8) {
					System.out.println("Please enter a password of at least 8 characters.");
				}
				
				boolean includesSpecialCharacter = false;
				boolean includesBigCharacter = false;
				boolean includesLowerCharacter = false;
				for (int i = 0; i < password.length(); i++) {
					char ch = password.charAt(i);
					if (specialCharactersString.contains(Character.toString(ch))) {
						includesSpecialCharacter = true;
					}
					if (Character.isUpperCase(ch)) {
						includesBigCharacter = true;
					}
					if (Character.isLowerCase(ch)) {
						includesLowerCharacter = true;
					}
				}
				if (includesSpecialCharacter != true) {
					System.out
							.println("Password must include a special charecter (\"!@#$%&*()'+,-./:;<=>?[]^_`{|}\") ");
				}
				if (includesBigCharacter != true) {
					System.out.println("Password must include a big character");
				}
				if (includesLowerCharacter != true) {
					System.out.println("Password must include lower character ");
				}
				if (includesSpecialCharacter && includesBigCharacter && includesLowerCharacter && password.length() >= 8) {
					System.out.println("Your password has been accepted.");
					break;
				}
			} else {
				System.out.println("Please enter a password of at least 8 characters.");
			}
		}
	}
}
	
