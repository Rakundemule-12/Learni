package Oops_Programming.Interfaces;

public class Car implements Engine {
    void drive()
    {
        start();
        stop();
    }

    @Override
    public void start() {
        System.out.println("Car Starts");

    }

    @Override
    public void stop() {
        System.out.println("Car Stops");

    }
}
