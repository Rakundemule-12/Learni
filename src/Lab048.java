import java.util.Scanner;

public class Lab048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the days between 1 to 7");
        int day = sc.nextInt();

        switch (day)
        {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wed");
                break;

            case 4:
                System.out.println("Thur");
                break;

            case 5:
                System.out.println("Fri");
                break;

            case 6:
                System.out.println("Sat");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("No Such day");
                break;
        }


    }
}
