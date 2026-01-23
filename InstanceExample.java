class InstanceExample {

    String name;
    int prn;

    InstanceExample(String name, int prn) {
        this.name = name;
        this.prn = prn;
    }

    void display() {
        System.out.println("Name : " + name);
        System.out.println("PRN  : " + prn);
    }

    public static void main(String[] args) {
        InstanceExample s1 = new InstanceExample("Prachi", 101);
        InstanceExample s2 = new InstanceExample("Aarav", 102);

        s1.display();
        s2.display();
    }
}
