package Liquid;

public class  Water  extends Liquid{


    public Water (String name, String state, double mass, double volume, double t) {

        super(name, state, mass, volume, t);
    }


    @Override
    public double density() {
        double d=mass/volume;
        System.out.println("Water desnity is");
        return  d;
    }
    @Override
    public double BoilingT()
    {

        System.out.println("Water is boiling in 100 C");
        return t;
    }
}
