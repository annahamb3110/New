package Genericslesson;
import java.util.*;
import  java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        MyClass<Integer> obj=new MyClass<>(20);
        MyClass<Double> obj1=new MyClass<>(20.5);
        MyClass<String> obj2=new MyClass<>("Anna");
obj.showType();
obj1.showType();
obj2.showType();


   Numeric<Integer> num=new Numeric<>(5);
        System.out.println(num.square());
    }
}
