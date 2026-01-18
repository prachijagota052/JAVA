
import java.util.Scanner;

class Division{
    public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in);
        /* 
        int a=10;
        int b=0;
        if(a==0 || b==0){
            System.out.println("Division by zero is not allowed.");
        }
        else{
            int result=a/b;
            System.out.println("Result: "+result);
        }
        */
        try{
            System.out.print("Enter numerator: ");
            int a=sc.nextInt();
            System.out.print("Enter denominator: ");
            int b=sc.nextInt();
            int result=a/b;
            System.out.println("Result: "+result);
        }
        catch(ArithmeticException e){
            System.out.println("Division by zero is not allowed.");
        }
    }
}