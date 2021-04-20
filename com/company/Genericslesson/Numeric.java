package Genericslesson;

public class Numeric <T extends Number> {
    T ob;
    Numeric(T ob)
    {
        this.ob=ob;

    }
    double square()
    {
        return ob.intValue()*ob.intValue();
    }


}
