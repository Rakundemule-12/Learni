package Oops_Programming;

public class Main_Method {
    public static void main(String[] args) {
        Tesla_Abs t = new Tesla_Abs();
        System.out.println("Specification for Tesla is");
        t.drive();

        System.out.println("--------------------------");

        Maruti_Altroz m = new Maruti_Altroz();
        System.out.println("Specification for Maruti Altroz is");
        m.mdrive();
    }
}
