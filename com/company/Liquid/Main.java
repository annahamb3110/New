package Liquid;

public class Main {
    public static void main(String args[])
    {


   Liquid []liquids= {new Water("Water","Liquid",200, 350,100),new Coffee("Coffee","Liquid",500,600,108,25 )};
        for(Liquid l:liquids)
        {
            System.out.println(l.BoilingT());
            System.out.println(l.density());
        }



    }
}
