import java.util.Scanner;
class Details{
    public static void main(String[ ] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name: ");
        String n= sc.nextLine();
        System.out.print("Enter your PRN: ");
        String p= sc.nextLine();
        System.out.print("Enter your address: ");
        String a= sc.nextLine();
        System.out.println("-----Details-----");
        System.out.println("Name: "+ n);
        System.out.println("PRN: "+ p);
        System.out.println("Address: "+a);
    }
}
