class Person{
    String name;
    void display(){
        System.out.println("Name: "+name);
    }
    public static void main(String[] args){
        Person person1=new Person();
        person1.name="Alice";
        person1.display();
    }
}