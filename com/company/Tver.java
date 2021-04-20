package com.company;

import java.util.Scanner;

public class Tver {
    public static void main(String[] args) {

        Scanner commandline = new Scanner(System.in);
        System.out.println("Enter number");
        int number = commandline.nextInt();
        int mnacord=0;
        int tasnavor=0;
        int haryuravor=0;
        int hazaravor=0;
        if(number<10)
        {
            System.out.println(number);
        }
     else   if (number >= 10 && number <= 100) {
            mnacord = number % 10;
            tasnavor = number / 10;
            System.out.println(mnacord);
            System.out.println(tasnavor);
        }

  else  if (number >= 100 && number <= 1000) {
        mnacord = number % 100%10;
        tasnavor = number % 100/10;
        haryuravor=number/100;


        System.out.println(mnacord);
        System.out.println(tasnavor);
        System.out.println(haryuravor);
    }


    else    if (number >= 1000 && number <= 10000) {
            mnacord = number % 1000%100%10;
            tasnavor = number % 100/10;
            haryuravor=number%1000/100;
            hazaravor=number/1000;

            System.out.println(mnacord);
            System.out.println(tasnavor);
            System.out.println(haryuravor);
            System.out.println(hazaravor);
        }
              else
                  System.out.println("wrong input");
    }

}
