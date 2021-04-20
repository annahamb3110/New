package Genericslesson;

public class MyClass<T> {
    T ob;
    MyClass(T ob)
    {
        this.ob=ob;
    }
    public void showType()
    {
        System.out.println(ob.getClass().getName());
    }
}
