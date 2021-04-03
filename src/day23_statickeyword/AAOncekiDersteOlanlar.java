package day23_statickeyword;

public class AAOncekiDersteOlanlar {

	public static void main(String[] args) {
		/*
		 * 1 - Cons : Java'da object uretmek icin Constructor kullanilir. Cons tanimlamalarda ozel bir method diye gecse de yapisi method'a 
		 * benzemekle beraber method'dan farklidir.
		 * 2 - Method'lar kucuk harfle baslarken, Cons Class ismi ile ayni olacagi icin buyuk harfle baslar.
		 * 3 - Cons'larin return type'i yoktur.
		 * 4 - Cons olusturmak = Class ismi ve (parametler) {body} seklinde olusturulur.
		 * 5 - Parametre olmasi istege baglidir.
		 * 6 - Body icinde hicbir sey olmasa da Cons olabilir.
		 * 7 - Access Modifier yazilmalidir. Eger biz yazmazsak access modifier default olarak tanimlanir.(Package icinden ulasilabilir).
		 * 8 - Cons. ismi class ismi ile ayni olmak zorunda oldugu birden fazla cons. olusturmak icin overloading yapmaliyiz.(Isim ayni signature
		 *  farkli)
		 * 9 - Java'da bir Class olusturuldugunda Java o class'dan object uretebilmemiz icin gorulmeyen fakat Class'in arka planinda calisan
		 * bir constructor olusturur. Bu cons'a Default Cons. denir ve parametresi YOKTUR. Biz parametreleri veya parametresiz herhangi bir cons.
		 * urettigimizde default yerine onu atar ve default cons yok olur. Bu durumda biz manuel olarak Default Cons'i olusturmak zorundayiz.
		 * 10 - Parametresiz bir cons. ile object uretirsek objenin degerleri instance veya static olarak olusturulan variable'larin degerlerine 
		 * esit olur. (Default degerler : int = 0(sifir) , boolean = false , String = null , char =  (bos deger,space)
		 * Eger biz objenin degerlerini degistirmek istersek, tum variable'lar icin deger atamasi yapmam gerekir.
		 * 11 - Obje uretirken degerleri de kendimiz vermek istersek parametreli cons. kullanmamiz gerekir. Parametreli cons. olusturmak 
		 * objeye bizim verdigimiz argument'leri atamak icin yeterli degildir. Argumentleri objeye atayabilmek icin cons. body'si icerisine
		 *     this.instanceVariableIsmi = parametreIsmil; seklinde deger atamasi yapmam gerekir.
		 *     Not : this ile deger atamasi yapilmayan parametler icin hicbir islem yapilmaz.
		 */
		}
}