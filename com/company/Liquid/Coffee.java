package Liquid;

public class Coffee extends Water{

    double sugarPercentage;

    public Coffee(String name, String state, double mass, double volume,double t, double sugarPercentage) {
        super(name, state, mass, volume,t);
    }
    @Override
    public double density() {
        System.out.println("coffee's density is");
        double d=mass*5/volume;
        return  d;
    }
    @Override
    public double BoilingT()
    {

        System.out.println("Coffee is boiling in 108 C");
        return t;
    }
}

