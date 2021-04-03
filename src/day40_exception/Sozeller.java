package day40_exception;

public class Sozeller {
																																												
	/*
	Throws Throw
	Throw keyword'u 1 exc. firlatmak icin. Throw declare etmiyor
	Throws ise bir veya daha fazla exc.'i declera etmek icindir. "," ile ayrilarak yazilabilir.
	
	Throw method'un icinde kullanilir.
	Throws keyword ise method signature'inda kullanilir.
	
	 Throw'dan sonra new diyip exc. turunu yazmamis lazim.
	 Throws'dan sonra sadece exc. turu yazilmasi yeterlidir.
	*/
	
	/*
	1) Try blogu mutlaka catch blogu ile kullanilmalidir. => False 

	2) Finally blogu mutlaka calisir. =>  True 

	3) Bir try blogu ile birden fazla catch blogu calistirilabilir. => True 

	4) Birden fazla catch blok varsa, child olan once yazilmalidir. => True Cunku parent yukarda yazilirsa Child'a is dusmez.

	5) FileNotFoundException nedir?
	  Ya bulamazsam idi.
	  Programimizda bir dosyayi okumaya calisiyorken, dosya bulunamazsa olusur. IOException’in subclass’idir.
	
	6) IOException nedir?
	  FileNotFoundException'in parent'idir. Input ve Output ile ilgili IOException vardir.
	  Programimizda bir file’a input/output yapiliyorsa ve program calisirken bir problem cikarsa olusur.
	  Checked exception’dir ve kod yazilirken mutlaka handle edilmelidir.
	
	
	Create Custom CheckedException
	1) Class isminin sonunda "Exception" kullanilir. BU mecburi degildir ama genel isim verme konsepti boyledir.
	
	2) Bir "checked exception“ olusturacaksak, class’imizi "Exception" class’ina child class yapmaliyiz.
	
	3) "String" parametresi olan bir constructor olusturun ve ilk satirina super(); ekleyin.
	*/
	
}
