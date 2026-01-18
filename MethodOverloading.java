class MethodOverloading{
    static void add(int a,int b){
        int result= a+b;
        System.out.println("Result: "+result);
    }
    static void add(int a,int b,int c)
    {
        int result=a+b+c;
        System.out.println("Result: "+result);
    }
    public static void main(String[] args){
        add(6, 5);
    }
}