
import java.util.Scanner;

class CalculationConstructor{
    CalculationConstructor(String op,float a,float b)
    {
        float result=0;
        if(op.equals("add"))
        {
             result= a+b;
        }
        else if(op.equals("sub"))
        {
             result=a-b;
        }
        else if(op.equals("mul"))
        {
             result=a*b;
        }
        else if(op.equals("div"))
        {
             result=a/b;
        }
        System.out.println("result : "+ result);
    }
    public static void main(String [ ] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter operation(add,sub,mul,div): ");
        String op= sc.nextLine();
        System.out.println("enter first number: ");
        float a= sc.nextFloat();
        System.out.println("enter second number: ");
        float b= sc.nextFloat();
        CalculationConstructor obj = new CalculationConstructor(op,a,b);

        
    }
}