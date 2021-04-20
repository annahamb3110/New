package interfaces;

public class Main {
    public static void main(String[] args) {
        Bytwos bytwos=new Bytwos();
        Bythrees bythrees=new Bythrees();
        Series ob;
        System.out.println(Series.Max);
        for (int i = 0; i <6 ; i++) {
            ob=bytwos;
           // System.out.println(ob.getNext());
            System.out.println(ob.getNext());


        }
    }
}
