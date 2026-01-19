class Student2{
    int id; // instance variable
    String name; // instance variable

    public static void main(String[] args){
        Student2 student1=new Student2();
        Student2 student2=new Student2();

        // Assigning values to instance variables
        student1.id=101;
        student1.name="Alice";

        student2.id=102;
        student2.name="Bob";

        // Displaying values of instance variables
        System.out.println("Student 1 ID: "+student1.id);
        System.out.println("Student 1 Name: "+student1.name);

        System.out.println("Student 2 ID: "+student2.id);
        System.out.println("Student 2 Name: "+student2.name);
    }
}