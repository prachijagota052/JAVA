import java.util.StringBuilder;
class ReverseString{
    static String reverseWithout(String str){
        String reversed = "";
        for(int i=str.length()-1;i>=0;i--){
            reversed+=str.charAt(i);
        }
        return reversed;
    }
    static String reverseWith(String str){
        String r= new StringBuilder(str).reverse().toString();
        return r;
    }

    public static void main(String[] args){
        String n= "World";
        System.out.println("Reversed without StringBuilder: "+reverseWithout(n));
        System.out.println("Reversed with StringBuilder: "+reverseWith(n));
    }

}
