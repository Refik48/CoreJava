package day12_stringmanupalation;

public class C1_EqualsCiftEsittirFarki {

	public static void main(String[] args) {
		
		
		String str1 = "Ali Can"; 
		String str2 = str1 + "" ; // Ali Can 
		String str3 = "Ali Can";
		
		System.out.println(str1==str2); // False
		
		System.out.println(str1.equals(str2)); // True cunku java degerler ayni mi diye bakar . Degerler ayni , adresler farkli. 
		
		// Javada 2 tur hafiza vardi, 1)Stack(small) primitive ve np adresleri tutardi 2)Heap(Huge) np'leri tutardi
		// 8. satiri calistirdigimiz da java onu str1 olarak kaydeder .
		// 9. satiri calistirdigimiz da str2'ye bir deger atadik ama ayni sey degil sagina "" eklenmis bu da farkli bir degere atamis oluyoruz
		// == esit olmasi icin ya ayni deger olacak ya da "" icinde ayni yazi olacak
		
		//== Stringlerin hem degerlerine hem de adreslerine bakar. Bu ornekte str1+"" yazdigimizda concatenation yapildigi icin 
		// java yeni bir obje olusturur ve islemin sonucunu yeni objenin icine koyar.
		
		System.out.println(str1==str3); // True cunku yazilar birebir ayni ama str2 false cunku yanina baska bir sey eklenmis durumda...
		// Ornek olarak: Dunyada baska ali can olabilir ama adresleri farkli .
		// Equals'ta ise adreslere degil isimler ayni mi diye bakar.
	}
}
