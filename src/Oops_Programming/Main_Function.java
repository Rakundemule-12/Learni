package Oops_Programming;

public class Main_Function {
    public static void main(String[] args) {

        Son s = new Son();
        s.Load_50K();
        s.Loan_25K();

        Father f = new Son();
        {
            f.Load_50K();
            f.Loan_25K();
        }
    }
}
