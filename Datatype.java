class Datatype{
    static void add(double a,double b)
        {
            double result= a+b;
            
            System.out.println("Result: "+result);
        }
    public static void main(String[] args){
        float a=5;
        float b=4;
        add(a,b);
    }
}
//Compilation error: different data types used in method call and definition 