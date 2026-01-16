import java.util.Scanner ;
class Multiply{
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        int a,b,product;
        a=sc.nextInt();
        b=sc.nextInt();
        product=a*b;
        System.out.println("the product is:"+product);
    }
}