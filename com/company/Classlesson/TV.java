package Classlesson;

public class TV {
    String name;
   private double height;
   private double width;


    TV(String n, double h, double w)
    {
      name=n;
       setTV(h,w);
    }
    public void setTV(double h, double w)
    {
    if(h>0 && w>0)
    {
        height = h;
        width=w;
    }
       else  System.out.println("wrong input"+h+w);
    }
    public String printName()
    {
        return name;
    }
    public double printHeight()
    {
        return height;
    }

    public double printWidth()
    {
        return width;
    }

    }


