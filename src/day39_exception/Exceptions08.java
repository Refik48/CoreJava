package day39_exception;

import java.util.Scanner;

public class Exceptions08 {

	public static void main(String[] args) {
		/*
        Kullanicidan carpma yapmak icin bir String isteyin. 
        Kullanicinin girdigi String sadece sayilardan olusuyorsa 
        sayiyi 2 ile carpip sonucu yazdirin.
       Kullanici sayilardan olusmayan bir String girerse 
       “Girdiginiz String sayiya cevrilemez” yazdirin.
        */

		Scanner scan = new Scanner(System.in);
		System.out.println("2 ile carpma yapacagim rica etsem bir String yazar misin ?");
		String str = scan.next();
		
		try {
			System.out.println(Integer.parseInt(str)*2);
		} catch (Exception e) {
			System.out.println("Girdiginiz string sayiya donusturulemiyor");
		}
		
	}

}
