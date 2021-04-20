package gmethod;

public class Airplane  implements Flyable{
    String name;
    int speed;
    String model;

public Airplane(String name, int speed,String model )
{
    this.name=name;
    this.speed=speed;
    this.model=model;
}
public String getName()
{
return name;
}
@Override
public int speed()
{
    return speed;
}
public void fly()
{
    System.out.println("Flying with motors and wings");
}
}