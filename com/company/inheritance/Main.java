package inheritance;

public class Main {
    public static void main(String []args) {
        A superOb = new A();
        B subB = new B();
        superOb.i = 10;
        superOb.j = 20;
        superOb.showij();

        subB.k=100;
        subB.i=20;
        subB.j=15;

        subB.showK();
        subB.sum();
    }

}
