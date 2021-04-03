package day07_ifstatements;

import java.util.Scanner;

public class C8_IfElse7 {

	public static void main(String[] args) {
		// Kullanicidan yillik maas girdisi isteyin . Maas 80 Bin uzeri ise kabul edin
		// 60-80 bin arasi ise gorusme yapalim diyin
		// 60 bin asagisini reddedin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen Yillik Maas Teklifinizi Giriniz:");
		
		double maas = scan.nextDouble();
		
		if (maas>80000) {
            System.out.println("Kabul ediyorum");
        } else if(maas>60000){
           System.out.println("Konusabiliriz");
        } else {
            System.out.println("Maalesef Kabul edemem");
 scan.close(); } 
	}
}

