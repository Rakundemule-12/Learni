package Oops_Programming;

public class Maruti_Altroz extends Engine_Abs{

    void mdrive()
    {
        start();
        stop();
        speed();
        keys();
        gear();
    }

    @Override
    void start()
    {
        System.out.println("The Car Altroz Start swiftly");
    }

    @Override
    void stop()
    {
        System.out.println("The Car Altroz Stop is 300Km/Hr");
    }

    @Override
    void speed()
    {
        System.out.println("The Car Altroz Speed is 100Km/Hr");

    }

    @Override
    void keys()
    {
        System.out.println("The Car Altroz keys are effective");
    }

    @Override
    void gear()
    {
        System.out.println("The Car Altroz Gear box is flexible");
    }
}

