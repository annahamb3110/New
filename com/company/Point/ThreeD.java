package Point;

public class ThreeD  extends  Twodpoint{
    double Z1;
    ThreeD(double Z1, double X1, double Y1)
    {
        super(X1, Y1);
        this.Z1=Z1;
    }
    private void setZ1()
    {
        this.Z1=Z1;
    }
    public double getZ1()
    {
        return Z1;

    }

    public double getNewDimension(double Z2, double Y2, double X2)
    {
        double d;
        d=Math.abs(Math.sqrt(Math.pow((Z2-Z1),2)+Math.sqrt(Math.pow((X2-X1),2)+ Math.pow((Y2-Y1),2))));
        return d;
    }
}
