
class student {
    String name;

    student(String name) {
        this.name = name;
    }
    void display() {
        System.out.println("Student Name: " + this.name);
    }
}
public class ThisKeywordDemo {
    public static void main(String[] args) {
        student student = new student("Alice");
        student.display();
    }
}