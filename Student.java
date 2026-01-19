class Student {
    String name;
    int age;

    Student() { // Default constructor
        name = "Unknown";
        age = 0;
    }
    
    Student(String n, int a){  // Parameterized constructor
        name=n;
        age=a;
    }
    void displayInfo(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
    public static void main(String[] args){
        Student student1=new Student("Alice",20);
        Student student2=new Student();
        student1.displayInfo();
        student2.displayInfo();
    }
}