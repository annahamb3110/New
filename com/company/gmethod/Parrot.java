package gmethod;

public class Parrot implements Flyable {
    public String name;
    private int speed;

    public Parrot(String name, int speed)
    {
        this.name=name;
        this.speed=speed;
    }
    public String getName()
    {
        return name;
    }
    public int getSpeed() {
        return speed;
    }

   @Override
    public void fly()
   {
       System.out.println("Flying with wings");
   }
   @Override
    public int speed()
   {
       return speed;
   }

}
