import java.util.Scanner;
class NameConstructor{
    NameConstructor(String name, int prn){
        System.out.println("hello,"+name);
        System.out.println("your prn is"+prn);
    }

    
    public static void main(String [ ] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter your name: ");
        String name= sc.nextLine();
        System.out.println();
        System.out.print("enter your prn: ");
        int prn=sc.nextInt();
        NameConstructor obj = new NameConstructor(name,prn);
    }
}