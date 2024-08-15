package ex_07072024;

public class Dog_Main {
    public static void main(String[] args) {
        Dog_Class D1 = new Dog_Class();
        Dog_Class D2 = new Dog_Class();
        Dog_Class D3 = new Dog_Class();
        System.out.println(D1.name);
        System.out.println(D1.Breed);
        System.out.println(D1.age);
        System.out.println(D2.name);
        System.out.println(D2.Breed);
        System.out.println(D2.age);
        D1.walk();
        D1.bark();

    }
}
