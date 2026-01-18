class Datatype{
    void add(float a,float b)
        {
            int result= a+b;
            System.out.println("Result: "+result);
        }
    public static void main(String[] args){
        double a=5;
        double b=4;
        add(a,b);
    }
}
//Compilation error: different data types used in method call and definition 