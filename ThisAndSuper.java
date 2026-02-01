class Parent{
    String name;
    void display(){
        this.name = "ParentName";
        System.out.println("Parent class method");
    }
}

class Child extends Parent{
    Child(){
        this.display();
        super.display();
    }
    void display(){
        System.out.println("Child class method");
    }
}

public class ThisAndSuper {
    public static void main(String[] args) {
        Child c = new Child();
    }
}