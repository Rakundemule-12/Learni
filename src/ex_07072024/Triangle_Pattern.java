package ex_07072024;

import java.util.Scanner;

public class Triangle_Pattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 1st side of the traingle");
        float a= s.nextFloat();
        System.out.println("Enter 2nd side of the traingle");
        float b= s.nextFloat();
        System.out.println("Enter 3rd side of the traingle");
        float c= s.nextFloat();

        if(a==b && b==c && c==a)
        {
            System.out.println("This is an Equilateral Traingle");
        }
        else if (a==b ||b==c||c==a)
        {
            System.out.println("This is an Isosceles Traingle");
        }
        else
        {
            System.out.println("This is an Scalene Traingle");
        }
    }
}
