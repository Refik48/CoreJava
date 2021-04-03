package day21_scope;

public class Scope6 {
	

	public int num1; /// num1 icin default deger 0'dir ******** DAY 33-C1 icinde kullanabilmek icin baslarina PUBLIC dedim*************
	public String name = "Ali";
	
		public static void main(String args){ 
		  add();
		// product (5); // static olmayan bir method, static olan bir main method icerisinden cagiralamaz 
		}
		
		
		public static void add(){ // void ekledim
		// num1++; // statin olmayan (instance) num1, static bir method icinden kullanilamaz
		int num2 = 6;
		char letter;
		System.out.println("Do addition ");
		System.out.println("SA DAY33 C1");
		}
		
		
		public void product(int num3){ // void ekledim
	    name = "Veli";
		// num2++; // num2 ustteki methodda olusturukmus Local bir variable'dir
		System.out.println(num3 * num3);
		}	} 

	
	
/*int num1;
String name = "Ali";
public static void main(String args){ 
  add();
product (5);
}
public static add(){
num1 ++;
int num2 = 6;
char letter;
System.out.println("Do addition ");
}
public product(int num3){
name = "Veli";
num2++;
System.out.println(num3 * num3);
} }
*/ // yukardakinin orjinal hali bu
	
