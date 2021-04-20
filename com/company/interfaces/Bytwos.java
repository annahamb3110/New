package interfaces;

public class Bytwos implements Series {
   int val;
    Bytwos()
    {
        val=0;
    }
public  int getNext()
    {
        if (val>=Max) {
            System.out.println(ErrorMsg);
        }
        else {
            val = val + 2;
        }
        return val;

    }

}
