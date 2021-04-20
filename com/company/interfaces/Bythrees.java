package interfaces;

public class Bythrees implements Series  {
    int val;

    Bythrees() {
        val = 0;
    }

    public int getNext()
    {
        val=val+3;
        return val;
    }

}
