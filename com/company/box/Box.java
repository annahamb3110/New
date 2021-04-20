package box;

public class Box {
    double width;
    double height;
    double depth;

    Box(double w, double h, double d)
    {   width=w;
        height=h;
        depth=d;
     }
     Box(double l)

     {
         width=height=depth=l;

     }

 double volume()
 {
     return width*height*depth;
 }

}
