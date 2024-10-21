package org.example.endpoints;

public class Instance {

    int speed = 100;

    public void Bike7()
    {
        System.out.println("speed is "+speed);
    }

//    {
//        speed=100;
//    }
    public static void main(String[] args) {
        Instance it = new Instance();
        Instance it1 = new Instance();
        it.Bike7();
        it1.Bike7();

    }


}
