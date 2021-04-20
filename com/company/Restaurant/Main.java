package Restaurant;

public class Main {
    public static void main(String []args)
    {

        Restaurant []array=new Restaurant[2];
        array[0]=new Restaurant("Yerevan","Soriso",3);
        array[1]=new Restaurant("Abovyan","Retro",2);
        for (int i = 0; i < 2; i++)
        {
            System.out.println(array[i].getResult());

        }

        }
    }

