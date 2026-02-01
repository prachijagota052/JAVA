class Parent {
    void display() {
        System.out.println("Parent class method");
    }
}

class Child extends Parent {
    void display() {
        super.display(); // Calling Parent class method
        System.out.println("Child class method");
    }
}

public class SuperKeywordDemo {
    public static void main(String[] args) {
        Child child = new Child();
        child.display();
    }
}