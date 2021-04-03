package day34_inheritance;

public class Encapsulation {

	private String okulIsmi = "Su Koleji";
	private int okulHesapNo = 1016;
	private boolean okulAcikMi = true;
	
	public String getOkulIsmi() { // Getter'i manuel olarak olusturuyorum
		
		
		return okulIsmi;
	}
	
	public int getOkulHesapNo() { // Getter'i manuel olarak olusturuyorum
		
		
		return okulHesapNo;
	}
	
	public boolean isOkulAcikMi() { // Getter'i manuel olarak olusturuyorum BOOLEAN OLDUGU ICIN is ILE BASLADI
		
		
		return okulAcikMi;
	}
	
	public void setOkulIsmi(String okulIsmi) { // Bir sey dondurmeyecegi icin return type'i void yaziyoruz.
		this.okulIsmi=okulIsmi;
		// Disardaki class'dan gelen okulIsmi'ni bu class'daki okulIsmi'ne atama yapiyoruz. 
		// Obje uzerionden old. icin bu class'daki orjinal degeri degistirmiyor.  
	}
	
	public void setOkulHesapNo(int okulHesapNo) {
		this.okulHesapNo=okulHesapNo;
	}
	
	public void setOkulAcikMi(boolean okulAcikMi) { // Set icin boolean normal yazildi.
		this.okulAcikMi=okulAcikMi;
	}

}
