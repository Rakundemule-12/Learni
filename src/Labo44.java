import java.util.Scanner;

public class Labo44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1");
        int num_in = sc.nextInt();


        if(num_in%2==0)
        {
            System.out.println("Number is even");
        }
        else
        {
            System.out.println("Number is Odd");
        }

    }
}
