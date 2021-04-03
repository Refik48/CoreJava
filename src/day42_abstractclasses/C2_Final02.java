package day42_abstractclasses;

public class C2_Final02 extends C1_Final01 {

	public static void main(String[] args) {
		
		System.out.println(C1_Final01.SAYI);
		// Static variable okul ismi gibi herkes icin aynidir.
		
		
		// C1_final.SAYI+=20; // Hata verir cunku sayi bariable'i final olarak tanimlandigi icin degistirilemez.
		
		// deneme(); method static oldugu icin obje olusturarak methodcall yapabilirim.
		
		C2_Final02 obj1 = new C2_Final02(); // Variable icin dataturune bak , method icin const.'a bak
		obj1.deneme();

	}
	
	public void deneme() {
		System.out.println("Chil Class'daki overriding method");
	}
	/*
	public void deneme2() { // Cannot override the final method from C1_Final01 yani Final method override edilemez diyor.
		
	}*/

}
