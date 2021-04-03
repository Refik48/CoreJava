package day19_dowhileloop;

import java.util.Scanner;

public class C1_Count {

	public static void main(String[] args) {
		// Kullanicidan bir cumle ve bir harf isteyin 
		// while loop kullanarak cumlede istenen harf kac kez kullanilmis bulunuz (case sensitive duyarli olsun)
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir cumle yaziniz");
		String cumle = scan.nextLine(); // case sensitive oldugu icin toUpper veya toLowercase kullanmadim
		System.out.println("Bir harf yaziniz");
		String harf = scan.next().substring(0, 1); // char turunde yazip charAt(0); da yazabilirdim onun yerine String kullanmak istedim.
		
		int count=0;
		
		int index = 0;
		
		while (index<=cumle.length()-1) { // index<cumle.length(); yazsamda olurdu = varsa -1'de yazacagiz son harf icin (*****COK ONEMLI*****)
			if(cumle.substring(index, index+1).equals(harf)) { // index index+1 sirasiyla 1. ve 2. kelimeye bakar sonra 2. 3.'ye sirayla gider
				count++;	
			}
			    index++;
		}  
		 System.out.println("cumlede " + harf + " harfi " + count + " defa kullanilmis");
         scan.close();
	}
}
