class a{
    void show(){
        System.out.println("In A");
    }
}

class b{
    void show(){
        System.out.println("In B");
    }
}

class c{
    void show(){
        System.out.println("In C");
    }
}

public class Main2{
public static void main(String args[]){
    a obj1 = new a();
    b obj2 = new b();
    c obj3 = new c();
    
    obj1.show();
    obj2.show();
    obj3.show();
}
}