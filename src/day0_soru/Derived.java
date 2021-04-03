package day0_soru;

class Derived {    }
/*
soru 1
//asagidaki CTE'lar nasil giderilir ?
//ve duzeltiginde sonuc ne olur ?

class Derived {
public Derived(String temp) {
 System.out.println("Derived class " + temp);
}}
public class Test01 extends Derived {
public Test01 (String temp) {   
 System.out.println("Test class " + temp);
 
}
public static void main(String[] args) {
 Test01 obj = new Test01();
 
}
}
*/




/*
2.soru
class Derived {
public void getDetails() {
    System.out.println("Derived class");
}
}
public class Test02 extends Derived {
protected Test02() {
    System.out.println("Test class");
}
public static void main(String[] args) {
    Test02 obj = new Test02();
    
}
}*/





/*
soru3
class Okul {
    public void getDetails() {
        System.out.println("Derived class ");
    }   
    }
public class Test03 extends Okul {
    public Test03() {
        System.out.println("Test class ");
        super.getDetails();
    }
    
    public static void main(String[] args) {
       Test03 obj = new Test03();
        obj.getDetails();
    }
}*/

	

	
	
	


/*4.soru
class Person {
    public Person(){
        System.out.println("Person Constructor");
    }
    public void talk() {
        System.out.println("First Program");
    }
}
class Student extends Person {
    public void talk() {
        System.out.println("Second Program");
    }
}
public class Test04 {
    
    public static void main(String[] args) {
        Person p = new Student();
        p.talk();
    }
}*/

