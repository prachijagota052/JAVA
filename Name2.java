import java.util.StringBuilder;
class Name2{
    public static void main(String[] args){
        char[] arr={'p','r','a','c','h','i'} ;
        for(int i=0;i<6;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
        for(int i=5;i>=0;i--){
            System.out.print(arr[i]);
        }
        System.out.println();
        String n="prachi";
        System.out.println(n);
        for(int i=n.length()-1;i>=0;i--){
            System.out.print(n.charAt(i));
        }
        String r = new StringBuilder(n).reverse().toString();
        System.out.println();
        System.out.println(r);
    }
}