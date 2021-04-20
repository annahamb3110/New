package gmethod;
import java.util.*;
import  java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Parrot parrot1 = new Parrot("Kakadu", 25);
        Parrot parrot2 = new Parrot("Kakadu", 25);
        Airplane airplane1 = new Airplane("Boing", 186, "Russian");
        Airplane airplane2 = new Airplane("K59", 196, "American");

      //  Flyable[] flyables = {parrot1, parrot2, airplane1, airplane2};
        Parrot[] parrots = {parrot1, parrot2};
        Airplane[] airpalne = {airplane1, airplane2};
        System.out.println(findResult(parrots,parrot1 ));


    }

     static <T extends Flyable <T> > T findResult(T[] array, T x) {
            for (int i = 0; i < array.length; i++)
                if (x.equals(array[i])) {
                    return x;
                }
            return null;
        }
    }

