import java.util.Scanner;

public class Labo45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1");
        int n1 = sc.nextInt();

        System.out.println("Enter the num2");
        int n2 = sc.nextInt();

        if (n1>n2)
        {
            System.out.println("n1 is greater");
        }
        else if(n2>n1)
        {
            System.out.println("n2 is greater");

        }
        else
        {
            System.out.println("both equal");
        }
    }
}
