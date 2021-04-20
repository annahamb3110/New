package Classlesson;

public class Main {

    public static void main(String[] args)
    {
        TV t1=new TV("Samsung",1,5);
        TV t2=new TV("LG",0,10);
        System.out.println(t1.printHeight());
        System.out.println(t1.printName());
        System.out.println(t1.printWidth());
    }
}
