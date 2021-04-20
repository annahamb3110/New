package com.company;
import java.util.Scanner;

public class Integer {
    public static void main(String[] args) {
        Scanner commandline= new Scanner(System.in);
        System.out.println("Nermucel drakan  mianish tiv");
        int number=commandline.nextInt();


       // int number=commandline.nextInt();
       switch(number)
       {
           case 1: System.out.println("one");
           break;
           case 2: System.out.println("two");
           break;
           case 3: System.out.println("three");
           break;
           case 4: System.out.println("four");
           break;
           case 5: System.out.println("five");
           break;
           case 6: System.out.println("six");
           break;
           case 7: System.out.println("seven");
           break;
           case 8: System.out.println("eight");
           break;
           case 9: System.out.println("nine");
           break;
           default: System.out.println("wrong input|");
        }
            }
               }

