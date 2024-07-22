package ex_07072024;

import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a year to find if its a leap");
        int year= s.nextInt();

        if (year%4==0 && year%100!=0 || (year % 400 == 0))
        {
            System.out.println(year+ " is a Leap Year");

        }
        else
        {
            System.out.println(year+ " is not a Leap Year");
        }
    }
}
