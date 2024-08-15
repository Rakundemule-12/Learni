package Oops_Programming;

public class Tesla_Abs extends Engine_Abs{
   void drive()
   {
       start();
       stop();
       speed();
       gear();
       keys();
   }


    @Override
    void start()
    {
        System.out.println("The Car Tesla is Started");

    }

    @Override
    void stop()
    {
        System.out.println("The Car Tesla is Stopped");
    }

    @Override
    void speed()
    {
        System.out.println("The Car Tesla accelaration increased");
    }

    @Override
    void gear()
    {
        System.out.println("The Car Tesla gear box is super flexible");
    }

    @Override
    void keys()
    {
        System.out.println("The Car Tesla Key Box is good");
    }
}
