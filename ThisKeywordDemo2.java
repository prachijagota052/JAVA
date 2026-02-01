class Demo{
    Demo(){
        this("default constructor"); // Calling parameterized constructor
        //In this program, `this("default constructor")` is used to call another constructor of the same 
        // class. When `new Demo()` is executed, the no-argument constructor is called first, which then 
        // uses `this()` to invoke the parameterized constructor and pass the string 
        // `"default constructor"`. The parameterized constructor prints this message. Using 
        // `this()` helps reuse constructor code and avoids duplication.

    }
    Demo(String message){
        System.out.println(message);
    }
}
public class ThisKeywordDemo2 {
    public static void main(String[] args) {
        new Demo();
    }
}