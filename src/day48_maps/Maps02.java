package day48_maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Maps02 {

	public static void main(String[] args) {
		// Verilen bir map'de yazilim dili java olan kisi isimlerini bir liste donduren bir method yaziniz.
		
		Map<Integer, String> map1 = new HashMap<>();

		map1.put(101, "Ali, Can, java");
		map1.put(102, "Veli, Yan, java");
		map1.put(103, "Ali, Yan, C#");
		// System.out.println(map1); // {101=Ali, Can, java, 102=Veli, Yan, java, 103=Ali, Yan, C#}
		
		/* Adim adim gidelim :
		  1) Benim elimde bir "map" var. {101=Ali, Can, java, 102=Veli, Yan, java, 103=Ali, Yan, C#} seklinde.
		   Map'le islem tek basina direkt yapamayiz, liste gibi degildir. Map komplex bir yapidadir. Key'lerden ve Value'lardan olusur.
		   Bir Array'deki gibi, Set'teki gibi, Queue'daki gibi, linklisted'deki gibi butun elemanlari bana tek tek getir diyemeyiz.
		   Neden ? Cunku bunun icindeki eleman bir entry oldugu icin tek tek icine girerek entry'lerin isteneni bulmam gerekiyor.
		       Not : entrySet diye bir class var onu ogrenirsen cozebilirsin entry entry alarak.
		       
		  2) Bunun icin yapacagim method = "MAP.VALUES" method'udur. Komplex map yapisindan cikiyor ve bir Multidimensional Array'e donusuyormus
		   gibi dusunebiliriz. Su hale geliyor : { {Ali,Can,Java},{Veli,Yan,Java},{Ali,Yan,C#} } -->> BU ARTIK COLLECTIONS'DIR.
		   Array'dir demedim, onun gibi dusunebiliriz yapisini dedim ama bu bir artik COLLECTION'DIR.
		   Collection old. icin artik foreach loop kullanabilirim. Foreach ile collection'daki her bir elemani tek tek ele alacagim.
		   Foreach Loop gibi dusunelim : 1. Eleman => "Ali, Can, Java" (Virgulleri ve bosluklari var) suan elimde bu yapida bir STRING var.
		   Ben bu string icinde "Java"yi arayacagim ve bu kisiyi List'e ekleyecegim.
		   
		  3) Ali, Can, java   Veli, Yan, java   Ali, Yan, C#   -->> Bunlar foreach loop'dan donen her elemanlar. Hepsi String seklinde .
		   String seklinde oldugu icin ad nerden nereye , java nerden nereye kadar falan bilemeyecegim.
		   O yuzden bu yapiyi Array yapisina donusturuyorum ki index index bakayim java var mi ? 
		   Eger varsa, isim index'ini alip List'e ekleyerek return list; yapayim. Bu yuzden burada split method'unu kullaniyorum.
		   
		  4) Split method'u ne ise yariyordu ? Burada each loop'dan dolayi her bir eleman tek tek gelecek, elemandan kasit Ali, Can, java kismi.
		   Bu geleni Array'e donduruyor. Nereden dondurecek Array'e ? w.split(", ") ile virgul ve bosluk kismindan ayirmasini istedim.
		   Burada split method'u ne ise yariyordu ? Icine yazdigimiz yerden ayirarak (Yani virgule ve bosluktan) ayridigin yerin oncesi
		   ve sonrasini index'e ekliyor. Yani : "Ali, Can, java"yi aliyor. virgul ve bosluku siliyor ; 
		   sildigi yerin oncesi ve sonrasini Array'e index olarak ekliyor . [Ali, Can, java]' donusuyor. Neden burada hala virgul ve bosluk var
		   Cunku [Ali, Can, java] buradaki virgul ve bosluk Array'in kendi virgul ve boslugu biz az once silerek ekledik.
		   [Ali, Can, java] [Veli, Yan, java] [Ali, Yan, C#] --->> Array'deki elemanlar. 
		   
		  5) Artik Array olduklari icin index index inceleyebilirim. arr[2] bize Dil'i veriyor (java , c#) . 
		   Yani burasi Java ise Liste'ye arr[0]'yi ekle dedik yani ismi (Ali, veli) . 
		 */
		
		String istenenDil = "java";
		List<String> isimList = javaBilenler(map1,istenenDil); // Burayi neden boyle olusturduk ? Asagiya yaziyorum :
		// Bir method olustururken 2 seye dikkat etmem gerekiyor. 1) Method'a ne gonderecegim ? 2) Method bana ne dondurecek ?
		// Method'a gonderdiklerim map1 ve istenenDil .    Method'un bana dondurdugu ise soruda istenen Java kisilerinin LISTESI.
		// Esitligin sol tarafini donecek objeye gore belirliyorum. 
		// Cunku bu method bana bir liste dondurecek(return = list).
		// Sag tarafta ise method isim ve parametreler var.

		System.out.println(isimList);
	}

	public static List<String> javaBilenler(Map<Integer, String> map1, String istenenDil) { 
		
		List<String> isimListesi = new ArrayList<>();
		
		for (String w : map1.values()) { // Bu method ile map'den collection'a gecis yaptim ve artik foreach kullanabilirim.
		// System.out.println("FOR EACH LOOP HER BIR ELEMANI : " + w); 
			// Ali, Can, java
		    // Veli, Yan, java
		    // Ali, Yan, C#     -->> Bunlar foreach loop'dan donen her elemanlar. Hepsi String seklinde .
			// String seklinde oldugu icin ad nerden nereye , java nerden nereye kadar falan bilemeyecegim.
			// O yuzden bu yapiyi Array yapisina donusturuyorum ki index index bakayim java var mi ? 
			// Eger varsa isim index'ini alip List'e ekleyerek return list; yapayim.
			// Bu yuzden burada split method'unu kullaniyorum.
			
			String arr [] = w.split(", ");  
			// Split method'u ne ise yariyordu ? Burada each loop'dan dolayi her bir eleman tek tek gelecek, elemandan kasit Ali, Can, java kismi.
			// Bu geleni Array'e donduruyor. Nereden dondurecek Array'e ? w.split(", ") ile virgul ve bosluk kismindan ayirmasini istedim.
			// Burada split method'u ne ise yariyordu ? Icine yazdigimiz yerden ayirarak (Yani virgule ve bosluktan) ayridigin yerin oncesi
			// ve sonrasini index'e ekliyor. Yani : "Ali, Can, java"yi aliyor. virgul ve bosluku siliyor ; 
			// sildigi yerin oncesi ve sonrasini Array'e index olarak ekliyor . [Ali, Can, java]' donusuyor. Neden burada hala virgul ve bosluk var
			// Cunku [Ali, Can, java] buradaki virgul ve bosluk Array'in kendi virgul ve boslugu biz az once silerek ekledik.
			
			// System.out.println("SPLIT METHOD'U NEYE DONUSTU : " + Arrays.toString(arr));
			// [Ali, Can, java]
			// [Veli, Yan, java]
			// [Ali, Yan, C#]
			
			if(arr[2].equalsIgnoreCase(istenenDil)) {
				isimListesi.add(arr[0]);	
			}
		}
		return isimListesi;
	}
	

}
