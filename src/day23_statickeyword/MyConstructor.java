package day23_statickeyword;

public class MyConstructor {
    
    int x =3;
    int y =5;
    
    MyConstructor () { // default
        x+=1; // x = x + 1 // x = 4
        System.out.println("-x"+x); // -x4
    }
    
    MyConstructor (int i) { // i = 3
        this();
        
        this.y=i; // y = 3
        x+=y; // 4 + 3 = 7
        System.out.println("-x"+x); // -x7
   }
    
    MyConstructor (int i, int i2) { // i = 4 // i2 = 3
        this(3);
        
        this.x-=4; // 7 - 4 = 3 // x = 3
        System.out.println("-x"+x); // -x3
    }
    public static void main(String[] args) {
        MyConstructor mc1 = new MyConstructor (4,3);
        System.out.println(mc1);
    }
 
}