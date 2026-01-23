class StudentStaticVar {

    static String college = "Symbiosis Institute of Technology";
    String name;
    int prn;

    StudentStaticVar(String name, int prn) {
        this.name = name;
        this.prn = prn;
    }

    void display() {
        System.out.println("Name : " + name);
        System.out.println("PRN  : " + prn);
        System.out.println("College : " + college);
    }

    public static void main(String[] args) {
        StudentStaticVar s1 = new StudentStaticVar("Prachi", 101);
        s1.display();
    }
}
