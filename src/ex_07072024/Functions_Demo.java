package ex_07072024;

import java.util.Scanner;

public class Functions_Demo {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the 1st Number");
        int c = s.nextInt();
        System.out.println("Enter the 2nd Number");
        int d = s.nextInt();
        int maths=funky(c,d);
        System.out.println(maths);

    }
    static int funky(int a, int b)
    {
        return a+b;

    }
}
