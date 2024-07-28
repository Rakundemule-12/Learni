package ex_07072024;

import java.util.Scanner;

public class Lab081 {
    public static void main(String[] args) {
        int [] n = {10,20,30,40,50};
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number of elements to be printed");
        int num = s.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println(n[i]);

        }

    }
}
