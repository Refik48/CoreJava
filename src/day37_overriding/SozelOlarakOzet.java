package day37_overriding;

public class SozelOlarakOzet {
	/*
	 *  Overriding Kurallari
	 * 1) Method Signature ayni olmak zorundadir.
	 * 2) Child class’daki method’un (overriding method) Access Modifier’i parent class’daki method’un (overridden) modifier’indan daha dar olamaz. 
	 * Ornek olarak Parent'da public iken Child'da default olamaz. Esit ya da daha genis olmalidir. public > protected > default > private
	 * (Child Parent'i kisitlayamaz yani child'in acces'i daha dar olamaz)
	 * Private static ve final methodlar overriding OLAMAZLAR (CTE VERIR) 
	 * 
	 * 3) Overriding method covariant return type kullanmalidir.
	 * 4) private, static and final method’lar overriding yapilamazlar.
	 * Not : Return Type aciklamasi ; (Slaytta 337. sayfada aciklamali resmi var)
	 * overriden method'un return type'i primitive veya void ise 
	 * overriding method'un return type'i da ayni olmali.
	 * (Parent Class RETURN TYPE PRIMITIVE veya VOID ise Chil Class'da ayni olmak ZORUNDA)
	 * 
	 * Eger return type primitive degilse (overriding method'un return type'i) IS-A (overridden method'un return type'i) olmalidir. 
	 * 
	 * Eger variable'a ulasmak istersek Data Type'a bakiyoruz fakat Method'a gidiyorsak Constructor'a bakariz. (Override durumlari icin hatirlatma)
	 * 
	 * Bu ikisini sonra gorecegiz.
	 * 5) Child class’daki method (overriding method), parent class’daki method’un (overridden method) compile tim 
	 * edip etmedigine bakmaksizin compile time exception throw edebilir. Fakat child class’daki method (overriding method), parent class’daki
	 * method’dan (overridden method) daha bir run time exception throw edemez.
	 * 6) Eger abstract olmayan bir class abstract class’a extend ediyorsa veya bir 
	 * interface’i implement ediyorsa abstract method’larin tamami override edilmelidir.
	 * 
	 * Polymorphism nedir ? (Poly = Cok , morphism = Sekilcilik) ****** DIKKAT INTERVIEW SORUSU******
	 * Polymorphism = Overloading + Overriding
	 * Overriden ve overriding method’larin ikisini de kullanmak istersek child class’da (overriding method) super keyword’unu kullanabiliriz.
	 * Poly “cok” morph ise “form”, “bicim” anlamlarini tasir. 
	 * Bu ikisinin birlesimiyle olusan “polymorphism” sozcugu “çok bicimlilik” anlamina gelir.
	 * Ozetle, olusturulan nesnelerin gerektiginde kiliktan kiliga girip baska bir nesneymis gibi 
	 * davranabilmesine polymorphism diyebiliriz. Bunlar program
	 * kodlarinin yeniden kullanilabilmesi veya var olan kodun gelistirilebilmesi acisindan cok onemlidir.
	 * 
	 * Method Overloading bir compile time (static) polymorphism’dir. Method Overloading sayesinde 
	 * ayni isme, ayni body’e, farkli parametrelere sahip bir cok method uretip kullanabiliriz.
	 * Method Overriding bir run time (dynamic) polymorphism’dir. Method Overriding sayesinde 
	 * ayni isme, ayni parametrelere’e, farkli body’e sahip bir cok method uretip kullanabiliriz.
	 * 
	 * Overloading vs Overriding
	 * 1) Overloading’de method signature degisir, Overriding’de degismez.
	 * 2) Overloading’de body istenirse degistirilebilir, Overriding’de body %99 degistirilir.
	 * 3) final, static ve private methodlar Overload edilebilir, ama Override edilemezler.
	 * 4) Overloading Compile Time Polymorphism (static)’dir, Overriding is Run Time Polymorphism’(dynamic)dir.
	 * 5) Overloading’de inheritance gerekmez, Overriding’de gerekir.
	 * 6) Overloading’de istedigimiz sekilde access modifier ve return type
	 * kullanabiliriz ama Overriding’de access modifier ve return type kullanma belli kurallara baglidir.
	 * 
	 * “Overloading” ve “Overriding”in farki nedir ? 
	 * Overloading’de sadece parametreler degisir, overriding’de signature’a dokunulmaz sadece body degisir.
	 * “Overriding”in faydasi nedir ? Coklu uygulama, reusability
	 * 
	 * public class X
	 * public class Y extends X
	 * public class Z extends Y
	 * Z is-A Y // Y is-A X // Z is-A X
	 * X has-A Y // Y has-A Z // X has-A Z
	 */
}
