package Point;

public class Main {
    public static void main(String []args)
    {
        Twodpoint point=new Twodpoint(5, 6);
     System.out.println(point.getDimension(9, 8));
     ThreeD point1=new ThreeD(9,6,7);
        System.out.println(point1.getNewDimension(12,9,10));
    }

}
