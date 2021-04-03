package day40_exception;

public class InvalidEmailIdSoru {

	public static void main(String[] args) throws InvalidEmailIdCheckedException {
		
		// icinde mailDogrula(String eMail) olsun. Email adreesi @gmail.com veya @hotmail.com icermiyorsa InvalidEmailIdCheckedExceptions versin.
		
		String email = "nihattekiner@hophaci.com";
		
		mailDogrula(email);

	}

	public static void mailDogrula(String email) throws InvalidEmailIdCheckedException {
		// Burada kod bloke oldu evet bloke olmasin istiyorsak throws InvalidEmailIdCheckedException'i sileriz ve 
		// try catch ile exception'i yakalar hatayi yansitiriz boylece kod bloke olmadan hatayi verdirmis oluruz.
		
		if(email.contains("@gmail.com") || email.contains("@hotmail.com")) {
			System.out.println("Mailiniz basariyla kaydedildi");
		} else {
			throw new InvalidEmailIdCheckedException("email ugun degil");
		} // throw new InvalidEmailIdCheckedException(); yazdigim zaman sikayet ediyor icerisine mesaj yazmam lazim.
		  // mesaj yazmama ragmen gene hata veriyor handle edip sorunu cozmek gerekiyor Add Throw Declaration seciyoruz.
		  // (String email) throws InvalidEmailIdCheckedException yapti.
		  // Bu sefer mailDogrula(email); burasi hata verdi bunun icinde tekrar throw ile handle etmem gerekiyor.
		  // Ustune gelip Add Throw Declaration'i seciyorum main(String[] args) throws InvalidEmailIdCheckedException yapti.
		  // Boyle olunca hatadan dolayi kod bloke olmus oluyor.
		
		
	}

}
