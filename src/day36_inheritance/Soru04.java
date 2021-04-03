package day36_inheritance;

//4.soru
class Person {
    public Person(){
        System.out.println("Person Constructor");
    }
    public void talk() {
        System.out.println("First Program");
    }
}
// Buradan asagisi Child Class'i , Yukarisi Parent Class'i
class Student extends Person {
    public void talk() {
        System.out.println("Second Program");
    }
}
public class Soru04 {
    
    public static void main(String[] args) {
    	Student p = new Student(); // 1. olarak burayi okur. Kendi Classimiz(Child)'da default cons.'a gider. B
    	// Burada mevcut degil fakat gizli bir default cons. var . Oraya gitti okumaya basladi bu Class child class oldugu icin super();'i de var.
    	// Yani onuda okumasi gerekecek orayi okur . super()'i okudugu icin 
        p.talk();
    }
} 
