package ex_07072024;

public class Encapsulation_main
{
    public static void main(String[] args)
    {
      Encapsulation1 amit = new Encapsulation1("Amit",2000);
        amit.setBal(500000,false);
        System.out.println(amit.getName());
        System.out.println(amit.getBal());

        Encapsulation1 admin = new Encapsulation1("Admin",5000);
        admin.setBal(80000,true);
        System.out.println(admin.getName());
        System.out.println(admin.getBal());


    }
}
