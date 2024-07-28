package ex_07072024;

public class Lab089 {
    public static void main(String[] args) {
        int[] salaries = {7, 10, 4, 13, 25, 18, 9, 8, 17};
        // Infsys - Autoamtion Interview
        int min = salaries[0];
        for (int i = 0; i < salaries.length; i++) {
            if (min > salaries[i]) {
                min = salaries[i];
            }

        }
        System.out.println(min);
    }
    }
