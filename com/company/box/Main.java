package box;

public class Main {
    public static void main(String [] args)
    {
        Box b = new Box(5);
        Box b1 = new Box(5, 6, 7);
        System.out.println(b.volume());
        System.out.println(b1.volume());


    }


}
