package ex_07072024;

public class Encapsulation1 {
    private String name;
    private long bal;

    public Encapsulation1(String name, long bal)
    {
        this.name = name;
        this.bal = bal;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name,boolean isAdmin) {
        if (isAdmin)
        {
            this.name = name;
            System.out.println("Allowed to set the Name");
        }
        else
        {
            System.out.println("Not Allowed to set the Name");
        }
    }

    public long getBal() {

            return bal;


    }

    public void setBal(long bal,boolean isAdmin) {
        if(isAdmin) {
            this.bal = bal;
            System.out.println("Allowed");
        }
        else
        {
            System.out.println("Not Allowed");
        }

    }
}
