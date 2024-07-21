package ex_07072024;

public class Lab067 {
    public static void main(String[] args) {

            for (int i = 0; i <= 50; i++) { // i = 0 to 50, times  = 51
                if (i % 2 == 0) {
                    System.out.println("Even -> " + i);

                }
                if  (i % 2 != 0) {
                    System.out.println("Odd -> " + i);
                }
            }
    }
}
