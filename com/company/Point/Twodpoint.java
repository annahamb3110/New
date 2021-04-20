package Point;

public class Twodpoint {
    public double X1;
   public double Y1;

     Twodpoint (double X1, double Y1 ) {
       this.X1=X1;
       this.Y1=Y1;
    }

    public void setX1(double X1)
      {

         this.X1=X1;
      }

public void setY1(double Y1)
    {

        this.Y1=Y1;
    }

     public double getX1()
     {
         return X1;
     }
         public double getY1()
     {
         return Y1;
     }

     public double getDimension(double X2, double Y2)
     {
         double d = Math.abs(Math.sqrt(Math.pow((X2-X1),2)+ Math.pow((Y2-Y1),2)));
         return d;

     }

}
