class Animal {
    void eat() {
        System.out.println("eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("barking...");
    }
}

public class TestInstanceOf {
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();
        d.eat();
        d.bark();
    }
}