package day32_stringbuilder;

public class C2_SB02 {

	public static void main(String[] args) {
		
		// Soru1
        StringBuilder sb1=new StringBuilder();
        sb1.append("aaa").insert(1, "bb").insert(4, "ccc");
        System.out.println(sb1);
        
        String s1 = "java";
        StringBuilder s2 = new StringBuilder("java");
       
        
        /*if (s1==s2) {
        	System.out.println("1");
        } */
        
        if(s1.equals(s2)) {
        	System.out.println("2");
        }
        
   
        String numbers = "012345678";
        System.out.println(numbers.substring(1,3));         // 12
        System.out.println(numbers.substring(7,7));         // Bos deger verir.
        System.out.println(numbers.substring(7));           // 78
        
        int total=0;
        StringBuilder letters=new StringBuilder("abcdefg");   // 
        total+=letters.substring(1,2).length();             // length=1 total=1
        total+=letters.substring(6,6).length();             // Hic bisi vermez, total=1 
        // total+=letters.substring(6,5).length();             //  RTE
        System.out.println(total);                          // 1
        
        

	}

}
